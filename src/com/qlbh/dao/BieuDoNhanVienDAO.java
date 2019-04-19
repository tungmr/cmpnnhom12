/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.BieuDoNhanVien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class BieuDoNhanVienDAO {

    public static ArrayList<BieuDoNhanVien> getListBieuDoNhanVien() {
        ArrayList<BieuDoNhanVien> listBDNV = new ArrayList<>();
        String sql = "SELECT ma_nhanVien, count(ma_hoa_don) as so_luong_hoa_don FROM hoadon GROUP BY ma_nhanVien ORDER BY so_luong_hoa_don desc LIMIT 5";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                BieuDoNhanVien bieuDoNhanVien = new BieuDoNhanVien();
                bieuDoNhanVien.setMaNhanVien(resultSet.getString(1));
                bieuDoNhanVien.setSoLuongHoaDon(resultSet.getInt(2));
                listBDNV.add(bieuDoNhanVien);
            }
        } catch (Exception e) {
        }
        return listBDNV;
    }
    
   public static ArrayList<BieuDoNhanVien> getListThongKeSoLuongDonHangCuaNhanVien(){
        ArrayList<BieuDoNhanVien> listTKHDNV = new ArrayList<>();
        String sql = "SELECT ma_nhanVien, count(*) FROM hoadon group by ma_nhanVien";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                BieuDoNhanVien bieuDoNhanVien = new BieuDoNhanVien();
                bieuDoNhanVien.setMaNhanVien(resultSet.getString(1));
                bieuDoNhanVien.setSoLuongHoaDon(resultSet.getInt(2));
                listTKHDNV.add(bieuDoNhanVien);
            }
        } catch (Exception e) {
        }
        return listTKHDNV;
    }

    public static void main(String[] args) {
        System.out.println(BieuDoNhanVienDAO.getListThongKeSoLuongDonHangCuaNhanVien().size());
    }
}
