/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.NhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HoangDucTung
 */
public class NhaCungCapDAO {
    
    public static ArrayList<NhaCungCap> getListNhaCungCap() {
        ArrayList<NhaCungCap> listNhaCungCap = new ArrayList<>();
        String sql = "SELECT * FROM nhacungcap";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(resultSet.getString(1));
                nhaCungCap.setTenNhaCungCap(resultSet.getString(2));
                nhaCungCap.setDiaChiNhaCungCap(resultSet.getString(3));
                nhaCungCap.setEmailNhaCungCap(resultSet.getString(4));
                nhaCungCap.setSoDienThoaiNCC(resultSet.getString(5));
                listNhaCungCap.add(nhaCungCap);
            }
        } catch (Exception e) {
        }
        return listNhaCungCap;
    }
    
    public static boolean themNhaCungCap(NhaCungCap nhaCungCap) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "INSERT INTO nhacungcap(ma_nha_cung_cap,ten_nha_cung_cap,dia_chi_ncc,email_ncc,so_dien_thoai_ncc) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhaCungCap.getMaNhaCungCap());
            preparedStatement.setString(2, nhaCungCap.getTenNhaCungCap());
            preparedStatement.setString(3, nhaCungCap.getDiaChiNhaCungCap());
            preparedStatement.setString(4, nhaCungCap.getEmailNhaCungCap());
            preparedStatement.setString(5, nhaCungCap.getSoDienThoaiNCC());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean suaNhaCungCap(NhaCungCap nhaCungCap, String maNCC) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "UPDATE nhacungcap SET ten_nha_cung_cap=?, dia_chi_ncc=?, email_ncc=?, so_dien_thoai_ncc=? WHERE ma_nha_cung_cap=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nhaCungCap.getTenNhaCungCap());
            preparedStatement.setString(2, nhaCungCap.getDiaChiNhaCungCap());
            preparedStatement.setString(3, nhaCungCap.getEmailNhaCungCap());
            preparedStatement.setString(4, nhaCungCap.getSoDienThoaiNCC());
            preparedStatement.setString(5, maNCC);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean xoaNhaCungCap(String maNCC) {
        Connection connection = JDBCConnection.myConnect();
        String sql = "DELETE FROM nhacungcap WHERE ma_nha_cung_cap=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNCC);
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static ArrayList<String> getListMaNhaCungCap() {
        ArrayList<String> listMaNCC = new ArrayList<>();
        String sql = "SELECT ma_nha_cung_cap FROM nhacungcap";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listMaNCC.add(resultSet.getString(1));
            }
        } catch (Exception e) {
        }
        return listMaNCC;
    }
    
    public static boolean kiemTraMaNhaCungCapDaTonTai(String maNhaCungCap) {
        String sql = "SELECT ma_nha_cung_cap FROM nhacungcap WHERE ma_nha_cung_cap=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, maNhaCungCap);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    public static ArrayList<NhaCungCap> timKiemNhaCungCapTheoTen(String tuKhoa) {
        ArrayList<NhaCungCap> listNhaCungCap = new ArrayList<>();
        String sql = "SELECT * FROM nhacungcap WHERE ten_nha_cung_cap LIKE '%"+tuKhoa+"%'";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(resultSet.getString(1));
                nhaCungCap.setTenNhaCungCap(resultSet.getString(2));
                nhaCungCap.setDiaChiNhaCungCap(resultSet.getString(3));
                nhaCungCap.setEmailNhaCungCap(resultSet.getString(4));
                nhaCungCap.setSoDienThoaiNCC(resultSet.getString(5));
                listNhaCungCap.add(nhaCungCap);
            }
        } catch (Exception e) {
        }
        return listNhaCungCap;
    }
    
    
    public static ArrayList<NhaCungCap> timKiemNhaCungCapTheoMa(String tuKhoa) {
        ArrayList<NhaCungCap> listNhaCungCap = new ArrayList<>();
        String sql = "SELECT * FROM nhacungcap WHERE ma_nha_cung_cap LIKE '%"+tuKhoa+"%'";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                NhaCungCap nhaCungCap = new NhaCungCap();
                nhaCungCap.setMaNhaCungCap(resultSet.getString(1));
                nhaCungCap.setTenNhaCungCap(resultSet.getString(2));
                nhaCungCap.setDiaChiNhaCungCap(resultSet.getString(3));
                nhaCungCap.setEmailNhaCungCap(resultSet.getString(4));
                nhaCungCap.setSoDienThoaiNCC(resultSet.getString(5));
                listNhaCungCap.add(nhaCungCap);
            }
        } catch (Exception e) {
        }
        return listNhaCungCap;
    }

//    public static void main(String[] args) {
//        System.out.println(NhaCungCapDAO.kiemTraMaNhaCungCapDaTonTai("SS"));
//
//    }
}
