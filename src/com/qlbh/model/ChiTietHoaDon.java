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
    private String maHoaDonChiTiet;
    private String maSanPhamMua;
    private String soLuongMua;
    private String giaSanPhamMua;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int idChiTiet, String maHoaDonChiTiet, String maSanPhamMua, String soLuongMua, String giaSanPhamMua) {
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

    public String getMaHoaDonChiTiet() {
        return maHoaDonChiTiet;
    }

    public void setMaHoaDonChiTiet(String maHoaDonChiTiet) {
        this.maHoaDonChiTiet = maHoaDonChiTiet;
    }

    public String getMaSanPhamMua() {
        return maSanPhamMua;
    }

    public void setMaSanPhamMua(String maSanPhamMua) {
        this.maSanPhamMua = maSanPhamMua;
    }

    public String getSoLuongMua() {
        return soLuongMua;
    }

    public void setSoLuongMua(String soLuongMua) {
        this.soLuongMua = soLuongMua;
    }

    public String getGiaSanPhamMua() {
        return giaSanPhamMua;
    }

    public void setGiaSanPhamMua(String giaSanPhamMua) {
        this.giaSanPhamMua = giaSanPhamMua;
    }
    
    
            
}
