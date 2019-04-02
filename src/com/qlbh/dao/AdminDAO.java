/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.dao;

import com.qlbh.tools.MD5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author HoangDucTung
 */
public class AdminDAO {
    public static boolean checkLogin(String username, String password){
        String hashPassword = MD5.md5(password);
        String sql = "SELECT * FROM admin WHERE username=? and password=?";
        Connection connection = JDBCConnection.myConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, hashPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next())
                return true;
        } catch (Exception e) {
        }
        return false;
    }
    
//    public static void main(String[] args) {
//        System.out.println(AdminDAO.checkLogin("administrator", "123456"));
//    }
}
