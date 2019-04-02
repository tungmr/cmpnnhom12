/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.model;

import java.sql.Date;

/**
 *
 * @author HoangDucTung
 */
public class NhanVien {
    private String maNhanVien;
    private String tenNhanVien;
    private String chucVu;
    private String diaChiNhanVien;
    private String soDienThoai;
    private double luongNhanVien;
    private String emailNhanVien;
    private Date ngaySinh;
    private boolean gioiTinh;

    public NhanVien() {
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String chucVu, String diaChiNhanVien, String soDienThoai, double luongNhanVien, String emailNhanVien, Date ngaySinh, boolean gioiTinh) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.chucVu = chucVu;
        this.diaChiNhanVien = diaChiNhanVien;
        this.soDienThoai = soDienThoai;
        this.luongNhanVien = luongNhanVien;
        this.emailNhanVien = emailNhanVien;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    

   

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public double getLuongNhanVien() {
        return luongNhanVien;
    }

    public void setLuongNhanVien(double luongNhanVien) {
        this.luongNhanVien = luongNhanVien;
    }

    public String getEmailNhanVien() {
        return emailNhanVien;
    }

    public void setEmailNhanVien(String emailNhanVien) {
        this.emailNhanVien = emailNhanVien;
    }
    
    
    
    
    
}
