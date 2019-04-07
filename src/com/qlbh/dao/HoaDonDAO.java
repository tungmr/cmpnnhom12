/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class HoaDonDAO {
    
    public static ArrayList<HoaDon> getListHoaDon (){
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        String sql = "SELECT * FROM hoadon";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHoaDon(resultSet.getLong(1));
                hoaDon.setMaKhachHangMua(resultSet.getString(2));
                hoaDon.setTenKhachHangMua(resultSet.getString(3));
                hoaDon.setSoDienThoaiKH(resultSet.getString(4));
                hoaDon.setDiaChiKhachHangMua(resultSet.getString(5));
                hoaDon.setNgayMua(resultSet.getTimestamp(6));
                hoaDon.setMaNhanVienBan(resultSet.getString(7));
                listHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
        }
        return listHoaDon;
    }

    public static boolean themHoaDon(HoaDon hoaDon) {
        String sql = "INSERT INTO hoadon VALUES (?,?,?,?,?,?,?)";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, hoaDon.getMaHoaDon());
            preparedStatement.setString(2, hoaDon.getMaKhachHangMua());
            preparedStatement.setString(3, hoaDon.getTenKhachHangMua());
            preparedStatement.setString(4, hoaDon.getSoDienThoaiKH());
            preparedStatement.setString(5, hoaDon.getDiaChiKhachHangMua());
            preparedStatement.setTimestamp(6, hoaDon.getNgayMua());
            preparedStatement.setString(7, hoaDon.getMaNhanVienBan());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean suaHoaDon(HoaDon hoaDon, long maHoaDon) {
        String sql = "UPDATE hoadon SET ma_kh = ?, ten_kh =?, so_dien_thoai_kh=?, dia_chi_kh =?, ngay_mua =?, ma_nhanVien=? WHERE ma_hoa_don=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hoaDon.getMaKhachHangMua());
            preparedStatement.setString(2, hoaDon.getTenKhachHangMua());
            preparedStatement.setString(3, hoaDon.getSoDienThoaiKH());
            preparedStatement.setString(4, hoaDon.getDiaChiKhachHangMua());
            preparedStatement.setTimestamp(5, hoaDon.getNgayMua());
            preparedStatement.setString(6, hoaDon.getMaNhanVienBan());
            preparedStatement.setLong(7, maHoaDon);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean xoaHoaDon (long maHoaDon){
        String sql ="DELETE FROM hoadon WHERE ma_hoa_don= ?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, maHoaDon);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean checkHoaDon (long maHoaDon){
        String sql = "SELECT * FROM hoadon WHERE ma_hoa_don=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, maHoaDon);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(HoaDonDAO.getListHoaDon().size());
    }
}
