/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class SanPhamDAO {

    public static ArrayList<SanPham> getListSanPham() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String sql = "SELECT * FROM sanpham";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                SanPham sanPham = new SanPham();
                sanPham.setMaSanPham(resultSet.getString(1));
                sanPham.setTenSanPham(resultSet.getString(2));
                sanPham.setSoLuong(resultSet.getInt(3));
                sanPham.setDonGia(resultSet.getDouble(4));
                sanPham.setMaNhaCungCapSP(resultSet.getString(5));
                sanPham.setMaNhanVienSP(resultSet.getString(6));
                listSanPham.add(sanPham);
            }
        } catch (Exception e) {
        }
        return listSanPham;
    }

    public static boolean themSanPham(SanPham sanPham) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "INSERT INTO sanpham(ma_san_pham,ten_san_pham,so_luong,don_gia,ma_nhaCungcCap,ma_nhanVien) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sanPham.getMaSanPham());
            preparedStatement.setString(2, sanPham.getTenSanPham());
            preparedStatement.setInt(3, sanPham.getSoLuong());
            preparedStatement.setDouble(4, sanPham.getDonGia());
            preparedStatement.setString(5, sanPham.getMaNhaCungCapSP());
            preparedStatement.setString(6, sanPham.getMaNhanVienSP());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean suaSanPham(SanPham sanPham, String maSP) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "UPDATE sanpham SET ten_san_pham=?, so_luong=?, don_gia=?,ma_nhaCungcCap=?,ma_nhanVien=? WHERE ma_san_pham=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, sanPham.getTenSanPham());
            preparedStatement.setInt(2, sanPham.getSoLuong());
            preparedStatement.setDouble(3, sanPham.getDonGia());
            preparedStatement.setString(4, sanPham.getMaNhaCungCapSP());
            preparedStatement.setString(5, sanPham.getMaNhanVienSP());
            preparedStatement.setString(6, maSP);
            return preparedStatement.executeUpdate() == 1;

        } catch (Exception e) {
        }
        return false;
    }

    public static boolean xoaSanPham(String maSP) {
        String sql = "DELETE FROM sanpham WHERE ma_san_pham=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    // cập nhập lại số lượng khi bán hàng
    public static boolean capNhapSoLuongSanPham(String maSP, int soLuongMoi) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "UPDATE sanpham SET so_luong=? WHERE ma_san_pham=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, soLuongMoi);
            preparedStatement.setString(2, maSP);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean kiemTraMaSPTonTai(String maSP){
        Connection connection = JDBCConnection.myConnect();
        String sql = "SELECT * FROM sanpham WHERE ma_san_pham=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSP);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
            {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public static SanPham getMotSanPham(String maSanPham){
        SanPham sanPham = new SanPham();
        Connection connection = JDBCConnection.myConnect();
        String sql = "SELECT * FROM sanpham WHERE ma_san_pham=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSanPham);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                sanPham.setMaSanPham(resultSet.getString(1));
                sanPham.setTenSanPham(resultSet.getString(2));
                sanPham.setSoLuong(resultSet.getInt(3));
                sanPham.setDonGia(resultSet.getDouble(4));
                sanPham.setMaNhaCungCapSP(resultSet.getString(5));
                sanPham.setMaNhanVienSP(resultSet.getString(6));
            }
        } catch (Exception e) {
        }
        return sanPham;
    }
    
    public static boolean kiemTraDuSoLuong(String maSanPham, int soLuong){
        String sql = "SELECT * FROM sanpham WHERE ma_san_pham=?";
        Connection connection = JDBCConnection.myConnect();
        int soLuongSP = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maSanPham);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
               soLuongSP = resultSet.getInt(3);
               return soLuongSP >= soLuong;
                     
            }
        } catch (Exception e) {
        }
        return false;
    }
    

    public static void main(String[] args) {
//        System.out.println(SanPhamDAO.themSanPham(new SanPham("DT", "Điện thoại", 100, 1000000, null, null)));
//          System.out.println(SanPhamDAO.xoaSanPham("DT"));
//            System.out.println(SanPhamDAO.suaSanPham(new SanPham(null, "Siêu máy giặt", 10, 10, null, null), "MG"));
//            System.out.println(SanPhamDAO.capNhapSoLuongSanPham("MG", 111));
//        System.out.println(SanPhamDAO.kiemTraMaSPTonTai("DH1234"));
    }
}
