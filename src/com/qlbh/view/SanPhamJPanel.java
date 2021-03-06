/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.view;

import com.qlbh.dao.NhaCungCapDAO;
import com.qlbh.dao.SanPhamDAO;
import com.qlbh.dao.UserDAO;
import com.qlbh.model.SanPham;
import com.qlbh.model.User;
import com.qlbh.tools.Excel;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author HoangDucTung
 */
public class SanPhamJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SanPhamJPanel
     */
    DefaultTableModel sanPhamtableModel;
    ImageIcon sai = new ImageIcon("tinhsai.png");
    ImageIcon dung = new ImageIcon("dau-check.png");
    DecimalFormat format = new DecimalFormat("### ### ###");
    ArrayList<SanPham> listSanPham = null;

    public SanPhamJPanel(String username) {
        initComponents();
        sanPhamtableModel = (DefaultTableModel) sanPhamjTable.getModel();
        sanPhamjTable.setAutoCreateRowSorter(true);
        sanPhamjTable.getTableHeader().setReorderingAllowed(false);
        loadSanPham();
        loadMaNCC("");
        setEnabledButton();
        maNhanVienSPjTextField.setText(username.toUpperCase());
        maNhanVienSPjTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sanPhamjTable = new javax.swing.JTable();
        maSanPhamjLabel = new javax.swing.JLabel();
        tenSanPhamjLabel = new javax.swing.JLabel();
        soLuongSanPhamjLabel = new javax.swing.JLabel();
        donGiaSanPhamjLabel = new javax.swing.JLabel();
        maNhaCungCapSPjComboBox = new javax.swing.JComboBox<>();
        maNhaCungCapSPjLabel = new javax.swing.JLabel();
        maNhanVienSPjLabel = new javax.swing.JLabel();
        maSanPhamjTextField = new javax.swing.JTextField();
        tenSanPhamjTextField = new javax.swing.JTextField();
        donGiaSanPhamjTextField = new javax.swing.JTextField();
        soLuongSanPhamjTextField = new javax.swing.JTextField();
        maNhanVienSPjTextField = new javax.swing.JTextField();
        themSanPhamjButton = new javax.swing.JButton();
        huySanPhamjButton = new javax.swing.JButton();
        nhapSanPhamjButton = new javax.swing.JButton();
        xuatSanPhamjButton = new javax.swing.JButton();
        xoaSanPhamjButton = new javax.swing.JButton();
        suaSanPhamjButton = new javax.swing.JButton();
        soLuongThongKejTextField = new javax.swing.JTextField();
        locSanPhamjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SẢN PHẨM");

        sanPhamjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Mã nhà cung cấp", "Số lượng", "Đơn giá", "Mã nhân viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sanPhamjTable.getTableHeader().setReorderingAllowed(false);
        sanPhamjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sanPhamjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sanPhamjTable);
        if (sanPhamjTable.getColumnModel().getColumnCount() > 0) {
            sanPhamjTable.getColumnModel().getColumn(0).setResizable(false);
            sanPhamjTable.getColumnModel().getColumn(1).setResizable(false);
            sanPhamjTable.getColumnModel().getColumn(2).setResizable(false);
            sanPhamjTable.getColumnModel().getColumn(3).setResizable(false);
            sanPhamjTable.getColumnModel().getColumn(4).setResizable(false);
            sanPhamjTable.getColumnModel().getColumn(5).setResizable(false);
        }

        maSanPhamjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maSanPhamjLabel.setForeground(new java.awt.Color(255, 255, 255));
        maSanPhamjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/business-card-of-folded-diptych-design.png"))); // NOI18N
        maSanPhamjLabel.setText("Mã sản phẩm");

        tenSanPhamjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tenSanPhamjLabel.setForeground(new java.awt.Color(255, 255, 255));
        tenSanPhamjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/dog-tag.png"))); // NOI18N
        tenSanPhamjLabel.setText("Tên sản phẩm");

        soLuongSanPhamjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        soLuongSanPhamjLabel.setForeground(new java.awt.Color(255, 255, 255));
        soLuongSanPhamjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/stats.png"))); // NOI18N
        soLuongSanPhamjLabel.setText("Số lượng");

        donGiaSanPhamjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        donGiaSanPhamjLabel.setForeground(new java.awt.Color(255, 255, 255));
        donGiaSanPhamjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/price-tag.png"))); // NOI18N
        donGiaSanPhamjLabel.setText("Đơn giá");

        maNhaCungCapSPjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maNhaCungCapSPjLabel.setForeground(new java.awt.Color(255, 255, 255));
        maNhaCungCapSPjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/business-card-of-folded-diptych-design.png"))); // NOI18N
        maNhaCungCapSPjLabel.setText("Mã nhà cung cấp");

        maNhanVienSPjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maNhanVienSPjLabel.setForeground(new java.awt.Color(255, 255, 255));
        maNhanVienSPjLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/id-card.png"))); // NOI18N
        maNhanVienSPjLabel.setText("Mã nhân viên");

        themSanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        themSanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        themSanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/plus.png"))); // NOI18N
        themSanPhamjButton.setText("THÊM");
        themSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSanPhamjButtonActionPerformed(evt);
            }
        });

        huySanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        huySanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        huySanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/x-button.png"))); // NOI18N
        huySanPhamjButton.setText("HỦY");
        huySanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huySanPhamjButtonActionPerformed(evt);
            }
        });

        nhapSanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nhapSanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        nhapSanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/import (1).png"))); // NOI18N
        nhapSanPhamjButton.setText("NHẬP");
        nhapSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapSanPhamjButtonActionPerformed(evt);
            }
        });

        xuatSanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xuatSanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        xuatSanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/share.png"))); // NOI18N
        xuatSanPhamjButton.setText("XUẤT");
        xuatSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatSanPhamjButtonActionPerformed(evt);
            }
        });

        xoaSanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        xoaSanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        xoaSanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/database.png"))); // NOI18N
        xoaSanPhamjButton.setText("XÓA");
        xoaSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaSanPhamjButtonActionPerformed(evt);
            }
        });

        suaSanPhamjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suaSanPhamjButton.setForeground(new java.awt.Color(0, 102, 102));
        suaSanPhamjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/edit (1).png"))); // NOI18N
        suaSanPhamjButton.setText("SỬA");
        suaSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaSanPhamjButtonActionPerformed(evt);
            }
        });

        locSanPhamjButton.setText("LỌC");
        locSanPhamjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locSanPhamjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maSanPhamjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenSanPhamjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(soLuongSanPhamjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(soLuongSanPhamjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(maSanPhamjTextField)
                            .addComponent(tenSanPhamjTextField))
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maNhaCungCapSPjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(maNhanVienSPjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(donGiaSanPhamjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maNhaCungCapSPjComboBox, 0, 226, Short.MAX_VALUE)
                            .addComponent(donGiaSanPhamjTextField)
                            .addComponent(maNhanVienSPjTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(themSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(suaSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(xoaSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(huySanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(nhapSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(soLuongThongKejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xuatSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(maSanPhamjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maSanPhamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donGiaSanPhamjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donGiaSanPhamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tenSanPhamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maNhaCungCapSPjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addComponent(maNhaCungCapSPjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tenSanPhamjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soLuongSanPhamjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maNhanVienSPjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongSanPhamjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maNhanVienSPjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huySanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(themSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xoaSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suaSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xuatSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongThongKejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(locSanPhamjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void loadSanPham() {
        listSanPham = SanPhamDAO.getListSanPham();
        for (SanPham sanPham : listSanPham) {
            sanPhamtableModel.addRow(new Object[]{
                sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getMaNhaCungCapSP(), sanPham.getSoLuong(), format.format(sanPham.getDonGia()), sanPham.getMaNhanVienSP()
            });
        }
    }

    public void setEnabledButton() {
        huySanPhamjButton.setEnabled(false);
    }

    public void loadMaNCC(String maNhaCungCap) {
        ArrayList<String> listMaNCC = NhaCungCapDAO.getListMaNhaCungCap();
        if (maNhaCungCap.equals("")) {
            maNhaCungCapSPjComboBox.addItem("");
        }
        for (String maNCC : listMaNCC) {
            if (maNCC.equals(maNhaCungCap)) {
                continue;
            } else {
                maNhaCungCapSPjComboBox.addItem(maNCC);
            }
        }
    }


    private void themSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        try {
            SanPham sanPham = new SanPham();
            String maSP = maSanPhamjTextField.getText().toUpperCase();
            if (SanPhamDAO.kiemTraMaSPTonTai(maSP)) {
                JOptionPane.showMessageDialog(null, "Mã sản phẩm đã tồn tại", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
            } else {
                sanPham.setMaSanPham(maSP);
                sanPham.setTenSanPham(tenSanPhamjTextField.getText());
                sanPham.setDonGia(Double.parseDouble(donGiaSanPhamjTextField.getText()));
                sanPham.setSoLuong(Integer.parseInt(soLuongSanPhamjTextField.getText()));
                sanPham.setMaNhanVienSP(maNhanVienSPjTextField.getText());
                sanPham.setMaNhaCungCapSP(maNhaCungCapSPjComboBox.getSelectedItem().toString());
                if (SanPhamDAO.themSanPham(sanPham)) {
                    sanPhamtableModel.addRow(new Object[]{
                        sanPham.getMaSanPham(), sanPham.getTenSanPham(), sanPham.getMaNhaCungCapSP(), sanPham.getSoLuong(), sanPham.getDonGia(), sanPham.getMaNhanVienSP()
                    });
                    maSanPhamjTextField.setText("");
                    tenSanPhamjTextField.setText("");
                    soLuongSanPhamjTextField.setText("");
                    donGiaSanPhamjTextField.setText("");
                    maNhaCungCapSPjComboBox.removeAllItems();
                    loadMaNCC("");
                    JOptionPane.showMessageDialog(null, "Đã thêm", "Message", JOptionPane.INFORMATION_MESSAGE, dung);

                } else {
                    JOptionPane.showMessageDialog(null, "Kiểm tra lại thông tin nhập vào", "Message", JOptionPane.INFORMATION_MESSAGE, sai);

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kiểm tra lại thông tin nhập vào", "Message", JOptionPane.INFORMATION_MESSAGE, sai);

        }


    }//GEN-LAST:event_themSanPhamjButtonActionPerformed

    private void suaSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        int chonHang = sanPhamjTable.getSelectedRow();
        if (chonHang != -1) {
            User user = UserDAO.getMotUser(maNhanVienSPjTextField.getText());
            if (user.getRole() == 1 || maNhanVienSPjTextField.getText().equals(sanPhamtableModel.getValueAt(chonHang, 5).toString())) {
                try {
                    SanPham sanPham = new SanPham();
                    String maSP = maSanPhamjTextField.getText().toUpperCase();
                    sanPham.setMaSanPham(maSP);
                    sanPham.setTenSanPham(tenSanPhamjTextField.getText());
                    sanPham.setDonGia(Double.parseDouble(donGiaSanPhamjTextField.getText()));
                    sanPham.setSoLuong(Integer.parseInt(soLuongSanPhamjTextField.getText()));
                    sanPham.setMaNhanVienSP(maNhanVienSPjTextField.getText().toUpperCase());
                    sanPham.setMaNhaCungCapSP(maNhaCungCapSPjComboBox.getSelectedItem().toString());
                    if (SanPhamDAO.suaSanPham(sanPham, maSP)) {
                        int row = sanPhamjTable.getSelectedRow();
                        sanPhamtableModel.setValueAt(sanPham.getTenSanPham(), row, 1);
                        sanPhamtableModel.setValueAt(sanPham.getMaNhaCungCapSP(), row, 2);
                        sanPhamtableModel.setValueAt(sanPham.getSoLuong(), row, 3);
                        sanPhamtableModel.setValueAt(sanPham.getDonGia(), row, 4);
                        maSanPhamjTextField.setText("");
                        tenSanPhamjTextField.setText("");
                        soLuongSanPhamjTextField.setText("");
                        donGiaSanPhamjTextField.setText("");
                        maNhaCungCapSPjComboBox.removeAllItems();
                        loadMaNCC("");
                        JOptionPane.showMessageDialog(null, "Đã sửa", "Message", JOptionPane.INFORMATION_MESSAGE, dung);
                    } else {
                        JOptionPane.showMessageDialog(null, "Kiểm tra lại thông tin nhập vào", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Kiểm tra lại thông tin nhập vào", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                }
                themSanPhamjButton.setEnabled(true);
                nhapSanPhamjButton.setEnabled(true);
                huySanPhamjButton.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Bạn không có quyền chỉnh sửa sản phẩm này!", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                maSanPhamjTextField.setText("");
                tenSanPhamjTextField.setText("");
                soLuongSanPhamjTextField.setText("");
                donGiaSanPhamjTextField.setText("");
                maNhaCungCapSPjComboBox.removeAllItems();
                loadMaNCC("");
                sanPhamjTable.clearSelection();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Chọn một hàng để sửa");
        }


    }//GEN-LAST:event_suaSanPhamjButtonActionPerformed

    private void sanPhamjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sanPhamjTableMouseClicked
        // TODO add your handling code here:
        themSanPhamjButton.setEnabled(false);
        nhapSanPhamjButton.setEnabled(false);
        huySanPhamjButton.setEnabled(true);
        int row = sanPhamjTable.getSelectedRow();
        maSanPhamjTextField.setText(sanPhamtableModel.getValueAt(row, 0).toString());
        tenSanPhamjTextField.setText(sanPhamtableModel.getValueAt(row, 1).toString());
        maNhaCungCapSPjComboBox.removeAllItems();
        maNhaCungCapSPjComboBox.addItem(sanPhamtableModel.getValueAt(row, 2).toString());
        loadMaNCC(sanPhamtableModel.getValueAt(row, 2).toString());
        soLuongSanPhamjTextField.setText(sanPhamtableModel.getValueAt(row, 3).toString());
        donGiaSanPhamjTextField.setText(sanPhamtableModel.getValueAt(row, 4).toString());
        maSanPhamjTextField.setEditable(false);
    }//GEN-LAST:event_sanPhamjTableMouseClicked

    private void xoaSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        int row = sanPhamjTable.getSelectedRow();
        if (row != -1) {
            User user = UserDAO.getMotUser(maNhanVienSPjTextField.getText());
            if (user.getRole() == 1 || maNhanVienSPjTextField.getText().equals(sanPhamtableModel.getValueAt(row, 5).toString())) {
                maSanPhamjTextField.setEditable(false);
                String maSP = maSanPhamjTextField.getText();
                try {
                    int luaChon = JOptionPane.showConfirmDialog(null, "Bạn có chắn chắn muốn xóa không", "Message", JOptionPane.YES_NO_OPTION);
                    if (luaChon == JOptionPane.YES_OPTION) {
                        if (SanPhamDAO.xoaSanPham(maSP)) {
                            sanPhamtableModel.removeRow(row);
                            maSanPhamjTextField.setText("");
                            tenSanPhamjTextField.setText("");
                            soLuongSanPhamjTextField.setText("");
                            donGiaSanPhamjTextField.setText("");
                            maNhaCungCapSPjComboBox.removeAllItems();
                            loadMaNCC("");
                            JOptionPane.showMessageDialog(null, "Đã xóa", "Message", JOptionPane.INFORMATION_MESSAGE, dung);
                        }
                    } else if (luaChon == JOptionPane.NO_OPTION) {

                        JOptionPane.showMessageDialog(null, "Đã hủy việc xóa", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                    }
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn không có quyền xóa sản phẩm này!", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                sanPhamjTable.clearSelection();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Chọn một hàng để xóa");
        }
        themSanPhamjButton.setEnabled(true);
        nhapSanPhamjButton.setEnabled(true);
        huySanPhamjButton.setEnabled(false);
    }//GEN-LAST:event_xoaSanPhamjButtonActionPerformed

    private void huySanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huySanPhamjButtonActionPerformed
        // TODO add your handling code here:
        sanPhamtableModel.setRowCount(0);
        loadSanPham();
        maSanPhamjTextField.setText("");
        tenSanPhamjTextField.setText("");
        soLuongSanPhamjTextField.setText("");
        donGiaSanPhamjTextField.setText("");
        maNhaCungCapSPjComboBox.removeAllItems();
        maNhaCungCapSPjComboBox.addItem("");
        soLuongThongKejTextField.setText("");
        loadMaNCC("");
        themSanPhamjButton.setEnabled(true);
        nhapSanPhamjButton.setEnabled(true);
        huySanPhamjButton.setEnabled(false);
        sanPhamjTable.clearSelection();
    }//GEN-LAST:event_huySanPhamjButtonActionPerformed

    private void nhapSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setDialogTitle("Chọn file");
        int chonFile = jFileChooser.showOpenDialog(null);
        if (chonFile == JFileChooser.APPROVE_OPTION) {
            try {
                int count = 0;
                String duongDanExcel = jFileChooser.getSelectedFile().getAbsolutePath();
                File file = new File(duongDanExcel);
                Workbook workbook = Workbook.getWorkbook(file);
                Sheet sheet = workbook.getSheet(0);
                int row = sheet.getRows();
                for (int i = 1; i < row; i++) {
                    Cell col1 = sheet.getCell(0, i);
                    Cell col2 = sheet.getCell(1, i);
                    Cell col3 = sheet.getCell(2, i);
                    Cell col4 = sheet.getCell(3, i);
                    Cell col5 = sheet.getCell(4, i);
                    Cell col6 = sheet.getCell(5, i);
                    String maSanPham = col1.getContents();
                    String tenSanPham = col2.getContents();
                    String maNCCSanPham = col3.getContents();
                    int soLuong = Integer.parseInt(col4.getContents());
                    double donGia = Double.parseDouble(col5.getContents());
                    String maNhanVien = col6.getContents();
                    SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, donGia, maNCCSanPham, maNhanVien);
                    if (SanPhamDAO.themSanPham(sanPham)) {
                        count++;
                        sanPhamtableModel.addRow(new Object[]{
                            sanPham.getMaSanPham(),
                            sanPham.getTenSanPham(),
                            sanPham.getMaNhaCungCapSP(),
                            sanPham.getSoLuong(),
                            sanPham.getDonGia(),
                            sanPham.getMaNhanVienSP()
                        });

                    } else {
                        JOptionPane.showMessageDialog(null, "Kiểm tra lại giá trị trong file", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
                    }

                }

                if (count == row - 1) {
                    JOptionPane.showMessageDialog(null, "Nhập file thành công", "Message", JOptionPane.INFORMATION_MESSAGE, dung);

                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Kiểm tra lại cấu trúc file", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
            } catch (BiffException ex) {
                JOptionPane.showMessageDialog(null, "Kiểm tra lại cấu trúc file", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
            }
        }
    }//GEN-LAST:event_nhapSanPhamjButtonActionPerformed

    private void xuatSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        jFileChooser.setCurrentDirectory(new java.io.File("."));
        jFileChooser.setDialogTitle("Chọn thư mục để lưu");
        jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jFileChooser.setAcceptAllFileFilterUsed(false);
        if (jFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            Excel.xuatFileExcel(sanPhamjTable, jFileChooser.getSelectedFile() + "\\\\Sanpham.xls");
            JOptionPane.showMessageDialog(null, "Đã lưu file tại đường dẫn: " + jFileChooser.getSelectedFile(), "Message", JOptionPane.INFORMATION_MESSAGE, dung);
        }

    }//GEN-LAST:event_xuatSanPhamjButtonActionPerformed

    private void locSanPhamjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locSanPhamjButtonActionPerformed
        // TODO add your handling code here:
        try {
            huySanPhamjButton.setEnabled(true);
            sanPhamtableModel.setRowCount(0);
            int soLuong = Integer.parseInt(soLuongThongKejTextField.getText());
            if (soLuong <= 0) {
                JOptionPane.showMessageDialog(null, "Số lượng phải lớn hơn 0", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
            } else {
                ArrayList<SanPham> listSP = SanPhamDAO.locSanPhamTheoSoLuong(soLuong);
                for (int i = 0; i < listSP.size(); i++) {
                    sanPhamtableModel.addRow(new Object[]{
                        listSP.get(i).getMaSanPham(),
                        listSP.get(i).getTenSanPham(),
                        listSP.get(i).getMaNhaCungCapSP(),
                        listSP.get(i).getSoLuong(),
                        format.format(listSP.get(i).getDonGia()),
                        listSP.get(i).getMaNhanVienSP(),});
                }
                if (sanPhamtableModel.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Không có sản phẩm nào trong khoảng này", "Message", JOptionPane.INFORMATION_MESSAGE, sai);

                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kiểm tra giá trị nhập vào", "Message", JOptionPane.INFORMATION_MESSAGE, sai);
        }
    }//GEN-LAST:event_locSanPhamjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel donGiaSanPhamjLabel;
    private javax.swing.JTextField donGiaSanPhamjTextField;
    private javax.swing.JButton huySanPhamjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton locSanPhamjButton;
    private javax.swing.JComboBox<String> maNhaCungCapSPjComboBox;
    private javax.swing.JLabel maNhaCungCapSPjLabel;
    private javax.swing.JLabel maNhanVienSPjLabel;
    private javax.swing.JTextField maNhanVienSPjTextField;
    private javax.swing.JLabel maSanPhamjLabel;
    public javax.swing.JTextField maSanPhamjTextField;
    private javax.swing.JButton nhapSanPhamjButton;
    public javax.swing.JTable sanPhamjTable;
    private javax.swing.JLabel soLuongSanPhamjLabel;
    private javax.swing.JTextField soLuongSanPhamjTextField;
    private javax.swing.JTextField soLuongThongKejTextField;
    private javax.swing.JButton suaSanPhamjButton;
    private javax.swing.JLabel tenSanPhamjLabel;
    private javax.swing.JTextField tenSanPhamjTextField;
    private javax.swing.JButton themSanPhamjButton;
    private javax.swing.JButton xoaSanPhamjButton;
    private javax.swing.JButton xuatSanPhamjButton;
    // End of variables declaration//GEN-END:variables
}
