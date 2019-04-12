/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.model.User;
import com.qlbh.tools.MD5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class UserDAO {
    
    public static boolean checkUser(String username, String password) {
        String hashPassword = MD5.md5(password);
        String sql = "SELECT * FROM user WHERE ma_nhanVien=? and password =?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, hashPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean doiMatKhauUser(String username, String password) {
        String hashPassword = MD5.md5(password);
        String sql = "UPDATE user SET password=? WHERE ma_nhanVien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, hashPassword);
            preparedStatement.setString(2, username);
            return preparedStatement.executeUpdate() == 1;

        } catch (Exception e) {
        }
        return false;
    }
    
    public static ArrayList<User> getListUser(){
        ArrayList<User> listUser = new ArrayList<>();
        String sql = "SELECT * FROM user";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                User user = new User();
                user.setMaNhanVien(resultSet.getString(2));
                user.setPassword(resultSet.getString(3));
                user.setRole(resultSet.getInt(4));
                listUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }
    
    public static boolean themUser(User user){
        String sql ="INSERT INTO user(ma_nhanVien,password,role) VALUES(?,?,?)";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getMaNhanVien());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setInt(3, user.getRole());
            return preparedStatement.executeUpdate() == 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean xoaUser(String username){
        String sql = "DELETE FROM user WHERE ma_nhanVien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            return preparedStatement.executeUpdate()== 1;
        } catch (Exception e) {
        }
        return false;
    }
    
    public static boolean kiemTraUsernameTonTai(String username){
        String sql ="SELECT * FROM user WHERE ma_nhanVien=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
    
    

//    public static void main(String[] args) {
//        System.out.println(UserDAO.getListUser().get(0).getPassword());
//    }

}
