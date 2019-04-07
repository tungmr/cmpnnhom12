/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.ChiTietHoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class ChiTietHoaDonDAO {
    
    public static ArrayList<ChiTietHoaDon> getListChiTietHD (){
        ArrayList<ChiTietHoaDon> listChiTiet = new ArrayList<>();
        Connection connection = JDBCConnection.myConnect();
        String sql ="SELECT * FROM chitiethoadon";
        try {
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setIdChiTiet(resultSet.getInt(1));
                chiTietHoaDon.setMaHoaDonChiTiet(resultSet.getLong(2));
                chiTietHoaDon.setMaSanPhamMua(resultSet.getString(3));
                chiTietHoaDon.setSoLuongMua(resultSet.getInt(4));
                chiTietHoaDon.setGiaSanPhamMua(resultSet.getDouble(5));
                listChiTiet.add(chiTietHoaDon);
            }
        } catch (Exception e) {
        }
        return listChiTiet;
    }
    
    public static ArrayList<ChiTietHoaDon> getMotChiTietHoaDon (long maHoaDon){
        ArrayList<ChiTietHoaDon> listMotChiTiet = new ArrayList<>();
        String sql = "SELECT * FROM chitiethoadon WHERE ma_hd=?";
        Connection connection = JDBCConnection.myConnect();
         try {
            PreparedStatement preparedStatement =connection.prepareStatement(sql);
            preparedStatement.setLong(1, maHoaDon);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ChiTietHoaDon chiTietHoaDon = new ChiTietHoaDon();
                chiTietHoaDon.setIdChiTiet(resultSet.getInt(1));
                chiTietHoaDon.setMaHoaDonChiTiet(resultSet.getLong(2));
                chiTietHoaDon.setMaSanPhamMua(resultSet.getString(3));
                chiTietHoaDon.setSoLuongMua(resultSet.getInt(4));
                chiTietHoaDon.setGiaSanPhamMua(resultSet.getDouble(5));
                listMotChiTiet.add(chiTietHoaDon);
            }
        } catch (Exception e) {
        }
        return listMotChiTiet;
    }
    
    public static boolean themChiTietHoaDon(ChiTietHoaDon chiTietHoaDon){
        String sql ="INSERT INTO chitiethoadon (ma_hd, ma_sp, so_luong, gia_sp) VALUES (?,?,?,?)";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, chiTietHoaDon.getMaHoaDonChiTiet());
            preparedStatement.setString(2, chiTietHoaDon.getMaSanPhamMua());
            preparedStatement.setInt(3, chiTietHoaDon.getSoLuongMua());
            preparedStatement.setDouble(4, chiTietHoaDon.getGiaSanPhamMua());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean suaChiTietHoaDon(ChiTietHoaDon chiTietHoaDon, int idChiTiet){
        String sql ="UPDATE chitiethoadon SET ma_sp = ?, so_luong = ?, gia_sp =? WHERE id_chitiet =?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, chiTietHoaDon.getMaSanPhamMua());
            preparedStatement.setInt(2, chiTietHoaDon.getSoLuongMua());
            preparedStatement.setDouble(3,chiTietHoaDon.getGiaSanPhamMua());
            preparedStatement.setInt(4, idChiTiet);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
        
    }
    
    public static boolean xoaChiTietHoaDon(int idChiTiet){
        String sql = "DELETE FROM chitiethoadon WHERE id_chitiet=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, idChiTiet);
            return preparedStatement.executeUpdate()==1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(ChiTietHoaDonDAO.getListChiTietHD().size());
    }
}
