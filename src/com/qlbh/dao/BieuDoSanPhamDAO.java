/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.BieuDoSanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class BieuDoSanPhamDAO {
    
    
    public static ArrayList<BieuDoSanPham> getListBieuDoSanPham(){
        ArrayList<BieuDoSanPham> listBDSP = new ArrayList<>();
        String sql = "SELECT ma_sp, sum(so_luong) as so_luong_ban FROM chitiethoadon group by ma_sp";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                BieuDoSanPham bieuDoSanPham = new BieuDoSanPham();
                bieuDoSanPham.setMaSanPham(resultSet.getString(1));
                bieuDoSanPham.setSoLuongBan(resultSet.getInt(2));
                listBDSP.add(bieuDoSanPham);
            }
        } catch (Exception e) {
        }
        return listBDSP;
    }
    
//    public static void main(String[] args) {
//        System.out.println(BieuDoSanPhamDAO.getListBieuDoSanPham().size());
//    }
}
