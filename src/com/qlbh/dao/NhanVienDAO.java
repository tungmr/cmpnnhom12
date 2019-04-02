/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.NhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class NhanVienDAO {

    public static ArrayList<NhanVien> getListNhanVien() {
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM nhanvien";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setMaNhanVien(resultSet.getString(1));
                nhanVien.setTenNhanVien(resultSet.getString(2));
                nhanVien.setChucVu(resultSet.getString(3));
                nhanVien.setLuongNhanVien(resultSet.getDouble(4));
                nhanVien.setDiaChiNhanVien(resultSet.getString(5));
                nhanVien.setSoDienThoai(resultSet.getString(6));
                nhanVien.setEmailNhanVien(resultSet.getString(7));
                nhanVien.setNgaySinh(resultSet.getDate(8));
                nhanVien.setGioiTinh(resultSet.getBoolean(9));
                listNhanVien.add(nhanVien);
            }
        } catch (Exception e) {
        }
        return listNhanVien;
    }

    public static NhanVien getNhanVien(String maNhanVien) {
        NhanVien nhanVien = new NhanVien();
        String sql = "SELECT * FROM nhanvien WHERE ma_nhan_vien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNhanVien);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                nhanVien.setMaNhanVien(maNhanVien);
                nhanVien.setTenNhanVien(resultSet.getString(2));
                nhanVien.setChucVu(resultSet.getString(3));
                nhanVien.setLuongNhanVien(resultSet.getDouble(4));
                nhanVien.setDiaChiNhanVien(resultSet.getString(5));
                nhanVien.setSoDienThoai(resultSet.getString(6));
                nhanVien.setEmailNhanVien(resultSet.getString(7));
                nhanVien.setNgaySinh(resultSet.getDate(8));
                nhanVien.setGioiTinh(resultSet.getBoolean(9));
            }
        } catch (Exception e) {
        }
        return nhanVien;
    }

    public static boolean kiemTraMaNhanVienDaTonTai(String maNhanVien) {
        String sql = "SELECT * FROM nhanvien WHERE ma_nhan_vien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNhanVien);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean themNhanVien(NhanVien nhanVien) {
        String sql = "INSERT INTO nhanvien VALUES (?,?,?,?,?,?,?,?,?)";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getMaNhanVien());
            preparedStatement.setString(2, nhanVien.getTenNhanVien());
            preparedStatement.setString(3, nhanVien.getChucVu());
            preparedStatement.setDouble(4, nhanVien.getLuongNhanVien());
            preparedStatement.setString(5, nhanVien.getDiaChiNhanVien());
            preparedStatement.setString(6, nhanVien.getSoDienThoai());
            preparedStatement.setString(7, nhanVien.getEmailNhanVien());
            preparedStatement.setDate(8, nhanVien.getNgaySinh());
            preparedStatement.setBoolean(9, nhanVien.isGioiTinh());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean xoaNhanVien(String maNhanVien) {
        String sql = "DELETE FROM nhanvien WHERE ma_nhan_vien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNhanVien);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean suaNhanVien(NhanVien nhanVien, String maNhanVien) {
        String sql = "UPDATE nhanvien SET ten_nhan_vien=?, chuc_vu=?, luong=?, dia_chi_nv=?, so_dien_thoai_nv=?, email_nv=?, ngay_sinh=?, gioi_tinh=? WHERE ma_nhan_vien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhanVien.getTenNhanVien());
            preparedStatement.setString(2, nhanVien.getChucVu());
            preparedStatement.setDouble(3, nhanVien.getLuongNhanVien());
            preparedStatement.setString(4, nhanVien.getDiaChiNhanVien());
            preparedStatement.setString(5, nhanVien.getSoDienThoai());
            preparedStatement.setString(6, nhanVien.getEmailNhanVien());
            preparedStatement.setDate(7, nhanVien.getNgaySinh());
            preparedStatement.setBoolean(8, nhanVien.isGioiTinh());
            preparedStatement.setString(9, maNhanVien);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }

//     public static void main(String[] args) {
//         System.out.println(NhanVienDAO.getListNhanVien().size());
//    }
//     public static void main(String[] args) {
//        NhanVien nhanVien = NhanVienDAO.getNhanVien("DT");
//         System.out.println(nhanVien.getTenNhanVien());
//    }
//    public static void main(String[] args) {
//        System.out.println(NhanVienDAO.kiemTraMaNhanVienDaTonTai("DT"));
//    }
}
