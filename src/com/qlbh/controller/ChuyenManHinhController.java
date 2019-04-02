/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.controller;

import com.qlbh.bean.DanhMucBean;
import com.qlbh.view.BanHangJPanel;
import com.qlbh.view.KhachHangJPanel;
import com.qlbh.view.NhaCungCapJPanel;
import com.qlbh.view.NhanVienJPanel;
import com.qlbh.view.SanPhamJPanel;
import com.qlbh.view.TimKiemThongKeJPanel;
import com.qlbh.view.TrangChuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HoangDucTung
 */
public class ChuyenManHinhController {

    private JPanel root;
    private String loaiMacDinh = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    // mặc đỉnh mở lên là trang chủ .
    public void setView(JPanel jpnItem, JLabel jlbItem) {
        loaiMacDinh = "TrangChu";
        jpnItem.setBackground(new Color(243, 255, 189));
        jlbItem.setBackground(new Color(243, 255, 189));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getjLabel().addMouseListener(new LabelEvent(item.getLoai(), item.getjPanel(), item.getjLabel()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;
        private String loai;
        private JPanel jPanel;
        private JLabel jLabel;

        public LabelEvent(String loai, JPanel jPanel, JLabel jLabel) {
            this.loai = loai;
            this.jPanel = jPanel;
            this.jLabel = jLabel;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (loai) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "SanPham":
                    node = new SanPhamJPanel();
                    break;
                case "NhaCungCap":
                    node = new NhaCungCapJPanel();
                    break;
                case "KhachHang":
                    node = new KhachHangJPanel();
                    break;
                case "BanHang":
                    node = new BanHangJPanel();
                    break;
                case "NhanVien":
                    node = new NhanVienJPanel();
                    break;
                case "TimKiemThongKe":
                    node = new TimKiemThongKeJPanel();
                    break;
                default:
                    node = new TrangChuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud(loai);
        }

        @Override // chuột hover
        public void mousePressed(MouseEvent e) {
            loaiMacDinh = loai;
            jPanel.setBackground(new Color(243, 255, 189));
            jLabel.setBackground(new Color(243, 255, 189));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override // chuột bấm vào
        public void mouseEntered(MouseEvent e) {
            jPanel.setBackground(new Color(243, 255, 189));
            jLabel.setBackground(new Color(243, 255, 189));
        }

        @Override // chuội qua panel khác
        public void mouseExited(MouseEvent e) {
            if (!loaiMacDinh.equalsIgnoreCase(loai)) {
                jPanel.setBackground(new Color(112, 193, 179));
                jLabel.setBackground(new Color(112, 193, 179));
            }
        }

    }

    private void setChangeBackgroud(String kind) {
        for (DanhMucBean item : listItem) {
            // lúc được kick thì màu trên 
            if (item.getLoai().equalsIgnoreCase(kind)) {
                item.getjPanel().setBackground(new Color(243, 255, 189));
                item.getjLabel().setBackground(new Color (243, 255, 189));
            } else {
                // không thì màu này
                item.getjPanel().setBackground(new Color(112, 193, 179));
                item.getjLabel().setBackground(new Color(112, 193, 179));
            }
        }
    }

}
