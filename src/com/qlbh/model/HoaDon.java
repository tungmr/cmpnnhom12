/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.model;

import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author HoangDucTung
 */
public class HoaDon {

    private long maHoaDon;
    private String maKhachHangMua;
    private String tenKhachHangMua;
    private String soDienThoaiKH;
    private String diaChiKhachHangMua;
    private Timestamp ngayMua;
    private String maNhanVienBan;
    private double tongTienHoaDon;

    public HoaDon() {
    }

    public HoaDon(long maHoaDon, String maKhachHangMua, String tenKhachHangMua, String soDienThoaiKH, String diaChiKhachHangMua, Timestamp ngayMua, String maNhanVienBan) {
        this.maHoaDon = maHoaDon;
        this.maKhachHangMua = maKhachHangMua;
        this.tenKhachHangMua = tenKhachHangMua;
        this.soDienThoaiKH = soDienThoaiKH;
        this.diaChiKhachHangMua = diaChiKhachHangMua;
        this.ngayMua = ngayMua;
        this.maNhanVienBan = maNhanVienBan;

    }

    public long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(long maHoaDon) {
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

    public String getSoDienThoaiKH() {
        return soDienThoaiKH;
    }

    public void setSoDienThoaiKH(String soDienThoaiKH) {
        this.soDienThoaiKH = soDienThoaiKH;
    }

    public String getDiaChiKhachHangMua() {
        return diaChiKhachHangMua;
    }

    public void setDiaChiKhachHangMua(String diaChiKhachHangMua) {
        this.diaChiKhachHangMua = diaChiKhachHangMua;
    }

    public double getTongTien(ArrayList<ChiTietHoaDon> listChiTietHoaDon) {
        double tongTien = 0;
        for (int i = 0; i < listChiTietHoaDon.size(); i++) {
            tongTien += listChiTietHoaDon.get(i).tinhTien();
        }
        return tongTien;
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

    public double getTongTienHoaDon() {
        return tongTienHoaDon;
    }

    public void setTongTienHoaDon(ArrayList<ChiTietHoaDon> listChiTietHoaDon) {
        double tongTien = 0;
        for (int i = 0; i < listChiTietHoaDon.size(); i++) {
            tongTien += listChiTietHoaDon.get(i).tinhTien();
        }
        this.tongTienHoaDon = tongTien;

    }

}
