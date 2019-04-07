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
public class ChiTietHoaDon {
    private int idChiTiet;
    private long maHoaDonChiTiet;
    private String maSanPhamMua;
    private int soLuongMua;
    private double giaSanPhamMua;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int idChiTiet, long maHoaDonChiTiet, String maSanPhamMua, int soLuongMua, double giaSanPhamMua) {
        this.idChiTiet = idChiTiet;
        this.maHoaDonChiTiet = maHoaDonChiTiet;
        this.maSanPhamMua = maSanPhamMua;
        this.soLuongMua = soLuongMua;
        this.giaSanPhamMua = giaSanPhamMua;
    }

    public int getIdChiTiet() {
        return idChiTiet;
    }

    public void setIdChiTiet(int idChiTiet) {
        this.idChiTiet = idChiTiet;
    }

    public long getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(long maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public String getMaSanPhamMua() {
        return maSanPhamMua;
    }

    public void setMaSanPhamMua(String maSanPhamMua) {
        this.maSanPhamMua = maSanPhamMua;
    }

    public int getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(int soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public double getGiaSanPhamMua() {
        return giaSanPhamMua;
    }

    public void setGiaSanPhamMua(double giaSanPhamMua) {
        this.giaSanPhamMua = giaSanPhamMua;
    }
    
    public double tinhTien(){
        return soLuongMua*giaSanPhamMua;
    }
            
    
            
}
