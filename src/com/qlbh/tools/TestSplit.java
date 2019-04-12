/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.tools;

/**
 *
 * @author HoangDucTung
 */
public class TestSplit {
    public static void main(String[] args) {
        String duongDan = "D:\\CNPM\\QuanLiBanHang"; 
        String [] chuoi = duongDan.split("\\\\");
        for ( String w : chuoi){
            System.out.println(w);
        }
    }
    
}
