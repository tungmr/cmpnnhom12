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
public class NhaCungCap {
    private String maNhaCungCap;
    private String tenNhaCungCap;
    private String diaChiNhaCungCap;
    private String emailNhaCungCap;
    private String soDienThoaiNCC;

    public NhaCungCap() {
    }

    public NhaCungCap(String maNhaCungCap, String tenNhaCungCap, String diaChiNhaCungCap, String emailNhaCungCap, String soDienThoaiNCC) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCungCap = tenNhaCungCap;
        this.diaChiNhaCungCap = diaChiNhaCungCap;
        this.emailNhaCungCap = emailNhaCungCap;
        this.soDienThoaiNCC = soDienThoaiNCC;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCungCap() {
        return tenNhaCungCap;
    }

    public void setTenNhaCungCap(String tenNhaCungCap) {
        this.tenNhaCungCap = tenNhaCungCap;
    }

    public String getDiaChiNhaCungCap() {
        return diaChiNhaCungCap;
    }

    public void setDiaChiNhaCungCap(String diaChiNhaCungCap) {
        this.diaChiNhaCungCap = diaChiNhaCungCap;
    }

    public String getEmailNhaCungCap() {
        return emailNhaCungCap;
    }

    public void setEmailNhaCungCap(String emailNhaCungCap) {
        this.emailNhaCungCap = emailNhaCungCap;
    }

    public String getSoDienThoaiNCC() {
        return soDienThoaiNCC;
    }

    public void setSoDienThoaiNCC(String soDienThoaiNCC) {
        this.soDienThoaiNCC = soDienThoaiNCC;
    }
    
    
}
