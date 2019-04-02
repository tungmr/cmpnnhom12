/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.model;

import java.sql.Timestamp;

/**
 *
 * @author HoangDucTung
 */
public class HoaDon {
    private String maHoaDon;
    private String maKhachHangMua;
    private String tenKhachHangMua;
    private String diaChiKhachHangMua;
    private double tongTien;
    private Timestamp ngayMua;
    private String maNhanVienBan;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, String maKhachHangMua, String tenKhachHangMua, String diaChiKhachHangMua, double tongTien, Timestamp ngayMua, String maNhanVienBan) {
        this.maHoaDon = maHoaDon;
        this.maKhachHangMua = maKhachHangMua;
        this.tenKhachHangMua = tenKhachHangMua;
        this.diaChiKhachHangMua = diaChiKhachHangMua;
        this.tongTien = tongTien;
        this.ngayMua = ngayMua;
        this.maNhanVienBan = maNhanVienBan;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHangMua() {
        return maKhachHangMua;
    }

    public void setMaKhachHangMua(String maKhachHangMua) {
        this.maKhachHangMua = maKhachHangMua;
    }

    public String getTenKhachHangMua() {
        return tenKhachHangMua;
    }

    public void setTenKhachHangMua(String tenKhachHangMua) {
        this.tenKhachHangMua = tenKhachHangMua;
    }

    public String getDiaChiKhachHangMua() {
        return diaChiKhachHangMua;
    }

    public void setDiaChiKhachHangMua(String diaChiKhachHangMua) {
        this.diaChiKhachHangMua = diaChiKhachHangMua;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Timestamp getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Timestamp ngayMua) {
        this.ngayMua = ngayMua;
    }

    public String getMaNhanVienBan() {
        return maNhanVienBan;
    }

    public void setMaNhanVienBan(String maNhanVienBan) {
        this.maNhanVienBan = maNhanVienBan;
    }
    
    
            
}
