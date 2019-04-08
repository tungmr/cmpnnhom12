/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class KhachHangDAO {
    
    public static ArrayList<KhachHang> getListKhachHang() {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM khachhang";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString(1));
                khachHang.setTenKhachHang(resultSet.getString(2));
                khachHang.setEmailKhachHang(resultSet.getString(3));
                khachHang.setDiaChiKhachHang(resultSet.getString(4));
                khachHang.setSoDienThoaiKH(resultSet.getString(5));
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }
    
    public static boolean themKhachHang(KhachHang khachHang) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "INSERT INTO khachhang(ma_khach_hang,ten_khach_hang,email_khach_hang,dia_chi,so_dien_thoai) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khachHang.getMaKhachHang());
            preparedStatement.setString(2, khachHang.getTenKhachHang());
            preparedStatement.setString(3, khachHang.getEmailKhachHang());
            preparedStatement.setString(4, khachHang.getDiaChiKhachHang());
            preparedStatement.setString(5, khachHang.getSoDienThoaiKH());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean suaKhachHang(KhachHang khachHang, String maKH) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "UPDATE khachhang SET ten_khach_hang=?, email_khach_hang=?, dia_chi=?, so_dien_thoai=? WHERE ma_khach_hang=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, khachHang.getTenKhachHang());
            preparedStatement.setString(2, khachHang.getEmailKhachHang());
            preparedStatement.setString(3, khachHang.getDiaChiKhachHang());
            preparedStatement.setString(4, khachHang.getSoDienThoaiKH());
            preparedStatement.setString(5, maKH);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean xoaKhachHang(String maKhachHang) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "DELETE FROM khachhang WHERE ma_khach_hang=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhachHang);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean kiemTraMaKHDaTonTai(String maKhachHang) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "SELECT ma_khach_hang FROM khachhang WHERE ma_khach_hang=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhachHang);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public static KhachHang getMotKhachHang(String maKhachHang) {
        KhachHang khachHang = new KhachHang();
        String sql = "SELECT * FROM khachhang WHERE ma_khach_hang=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maKhachHang);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                khachHang.setMaKhachHang(maKhachHang);
                khachHang.setTenKhachHang(resultSet.getString(2));
                khachHang.setEmailKhachHang(resultSet.getString(3));
                khachHang.setDiaChiKhachHang(resultSet.getString(4));
                khachHang.setSoDienThoaiKH(resultSet.getString(5));
            }
        } catch (Exception e) {
        }
        return khachHang;
    }
    
    public static ArrayList<KhachHang> timKiemKhachHangTheoTen(String tuKhoa) {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM khachhang WHERE ten_khach_hang LIKE '%"+tuKhoa+"%'";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString(1));
                khachHang.setTenKhachHang(resultSet.getString(2));
                khachHang.setEmailKhachHang(resultSet.getString(3));
                khachHang.setDiaChiKhachHang(resultSet.getString(4));
                khachHang.setSoDienThoaiKH(resultSet.getString(5));
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }
    
    
    public static ArrayList<KhachHang> timKiemKhachHangTheoMa(String tuKhoa) {
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        String sql = "SELECT * FROM khachhang WHERE ma_khach_hang LIKE '%"+tuKhoa+"%'";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                KhachHang khachHang = new KhachHang();
                khachHang.setMaKhachHang(resultSet.getString(1));
                khachHang.setTenKhachHang(resultSet.getString(2));
                khachHang.setEmailKhachHang(resultSet.getString(3));
                khachHang.setDiaChiKhachHang(resultSet.getString(4));
                khachHang.setSoDienThoaiKH(resultSet.getString(5));
                listKhachHang.add(khachHang);
            }
        } catch (Exception e) {
        }
        return listKhachHang;
    }
    
    public static void main(String[] args) {
        System.out.println(KhachHangDAO.kiemTraMaKHDaTonTai("MR"));
    }
}
