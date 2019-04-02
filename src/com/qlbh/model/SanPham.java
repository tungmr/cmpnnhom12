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
public class SanPham {
    private String maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double donGia;
    private String maNhaCungCapSP;
    private String maNhanVienSP;

    public SanPham() {
    }

    public SanPham(String maSanPham, String tenSanPham, int soLuong, double donGia, String maNhaCungCapSP, String maNhanVienSP) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.maNhaCungCapSP = maNhaCungCapSP;
        this.maNhanVienSP = maNhanVienSP;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaNhaCungCapSP() {
        return maNhaCungCapSP;
    }

    public void setMaNhaCungCapSP(String maNhaCungCapSP) {
        this.maNhaCungCapSP = maNhaCungCapSP;
    }

    public String getMaNhanVienSP() {
        return maNhanVienSP;
    }

    public void setMaNhanVienSP(String maNhanVienSP) {
        this.maNhanVienSP = maNhanVienSP;
    }
    
    
    
}
