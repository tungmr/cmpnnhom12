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
public class BieuDoNhanVien {
    private String maNhanVien;
    private int soLuongHoaDon;

    public BieuDoNhanVien() {
    }

    public BieuDoNhanVien(String maNhanVien, int soLuongHoaDon) {
        this.maNhanVien = maNhanVien;
        this.soLuongHoaDon = soLuongHoaDon;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public int getSoLuongHoaDon() {
        return soLuongHoaDon;
    }

    public void setSoLuongHoaDon(int soLuongHoaDon) {
        this.soLuongHoaDon = soLuongHoaDon;
    }
    
    
}
