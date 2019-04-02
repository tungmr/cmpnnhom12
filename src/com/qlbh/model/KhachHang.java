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
public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String emailKhachHang;
    private String diaChiKhachHang;
    private String soDienThoaiKH;

    public KhachHang() {
    }
    
    public KhachHang(String maKhachHang, String tenKhachHang, String emailKhachHang, String diaChiKhachHang, String soDienThoaiKH) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.emailKhachHang = emailKhachHang;
        this.diaChiKhachHang = diaChiKhachHang;
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getEmailKhachHang() {
        return emailKhachHang;
    }

    public void setEmailKhachHang(String emailKhachHang) {
        this.emailKhachHang = emailKhachHang;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }
    
    
    
    
}
