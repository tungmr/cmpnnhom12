/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.model;

/**
 *
 * @author HoangDucTung
 */
public class BieuDoSanPham {
    private String maSanPham;
    private int soLuongBan;

    public BieuDoSanPham() {
    }
 
    public BieuDoSanPham(String maSanPham, int soLuongBan) {
        this.maSanPham = maSanPham;
        this.soLuongBan = soLuongBan;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }
    
    
    
}
