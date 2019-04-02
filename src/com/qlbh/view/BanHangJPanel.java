/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.view;

/**
 *
 * @author HoangDucTung
 */
public class BanHangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BanHangJPanel
     */
    public BanHangJPanel() {
        initComponents();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        banhangTVjTable = new javax.swing.JTable();
        maDonHangBHtvjLabel = new javax.swing.JLabel();
        maSanPhamBHtvjLabel = new javax.swing.JLabel();
        ngayMuaBHtvjLabel = new javax.swing.JLabel();
        maNhanVienBHtvjComboBox = new javax.swing.JComboBox<>();
        maSanPhamBHtvjComboBox = new javax.swing.JComboBox<>();
        ngayMuaBHtvjDateChooser = new com.toedter.calendar.JDateChooser();
        xuatBHtvjButton = new javax.swing.JButton();
        maKhachHangBHtvjLabel = new javax.swing.JLabel();
        nhapBHtvjButton = new javax.swing.JButton();
        suaBHtvjButton = new javax.swing.JButton();
        maKhachHangBHtvjTextField = new javax.swing.JTextField();
        soLuongBHtvjLabel = new javax.swing.JLabel();
        soLuongBHtvjTextField = new javax.swing.JTextField();
        maNhanVienBHtvjLabel = new javax.swing.JLabel();
        maDonHangBHtvjTextField = new javax.swing.JTextField();
        xoaBHtvjButton = new javax.swing.JButton();
        themBHtvjButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        banHangKTVjTable = new javax.swing.JTable();
        maDonHangBHKTVjLabel = new javax.swing.JLabel();
        ngayMuaBHKTVjLabel = new javax.swing.JLabel();
        hoTenBHKTVjLabel = new javax.swing.JLabel();
        themBHKTVjButton = new javax.swing.JButton();
        xoaBHKTVjButton = new javax.swing.JButton();
        nhapBHKTVjButton = new javax.swing.JButton();
        maDonHangBHKTVjTextField = new javax.swing.JTextField();
        hoTenBHKTVjTextField = new javax.swing.JTextField();
        ngayMuaBHKTVjDateChooser = new com.toedter.calendar.JDateChooser();
        soDienThoaiBHKTVjLabel = new javax.swing.JLabel();
        soLuongBHktvjLabel = new javax.swing.JLabel();
        soDienThoaiBHKTVjTextField = new javax.swing.JTextField();
        soLuongBHKTVjTextField = new javax.swing.JTextField();
        maSanPhamBHKTVjLabel = new javax.swing.JLabel();
        maSanPhamBHKTVjComboBox = new javax.swing.JComboBox<>();
        maNhanVienBHKTVjLabel = new javax.swing.JLabel();
        maNhanVienBHKTVjTextField = new javax.swing.JTextField();
        diaChiBHKTVjLabel = new javax.swing.JLabel();
        diaChiBHKTVjTextField = new javax.swing.JTextField();
        suaBHKTVjButton = new javax.swing.JButton();
        xuatBHKTVjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BÁN HÀNG");

        banhangTVjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn hàng", "Mã khách hàng", "Tên khách hàng", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Ngày mua", "Mã nhân viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banhangTVjTable);
        if (banhangTVjTable.getColumnModel().getColumnCount() > 0) {
            banhangTVjTable.getColumnModel().getColumn(0).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(1).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(2).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(3).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(4).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(5).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(6).setResizable(false);
            banhangTVjTable.getColumnModel().getColumn(7).setResizable(false);
        }

        maDonHangBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maDonHangBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maDonHangBHtvjLabel.setText("Mã đơn hàng");

        maSanPhamBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maSanPhamBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maSanPhamBHtvjLabel.setText("Mã sản phẩm");

        ngayMuaBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ngayMuaBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        ngayMuaBHtvjLabel.setText("Ngày mua");

        maNhanVienBHtvjComboBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maNhanVienBHtvjComboBox.setForeground(new java.awt.Color(0, 102, 102));

        maSanPhamBHtvjComboBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maSanPhamBHtvjComboBox.setForeground(new java.awt.Color(0, 102, 102));
        maSanPhamBHtvjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maSanPhamBHtvjComboBoxActionPerformed(evt);
            }
        });

        xuatBHtvjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xuatBHtvjButton.setForeground(new java.awt.Color(0, 102, 102));
        xuatBHtvjButton.setText("XUẤT");

        maKhachHangBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maKhachHangBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maKhachHangBHtvjLabel.setText("Mã khách hàng");

        nhapBHtvjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nhapBHtvjButton.setForeground(new java.awt.Color(0, 102, 102));
        nhapBHtvjButton.setText("NHẬP");

        suaBHtvjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        suaBHtvjButton.setForeground(new java.awt.Color(0, 102, 102));
        suaBHtvjButton.setText("SỬA");

        maKhachHangBHtvjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maKhachHangBHtvjTextFieldActionPerformed(evt);
            }
        });

        soLuongBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        soLuongBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        soLuongBHtvjLabel.setText("Số lượng");

        soLuongBHtvjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuongBHtvjTextFieldActionPerformed(evt);
            }
        });

        maNhanVienBHtvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maNhanVienBHtvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maNhanVienBHtvjLabel.setText("Mã nhân viên");

        maDonHangBHtvjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maDonHangBHtvjTextFieldActionPerformed(evt);
            }
        });

        xoaBHtvjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xoaBHtvjButton.setForeground(new java.awt.Color(0, 102, 102));
        xoaBHtvjButton.setText("XÓA");

        themBHtvjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        themBHtvjButton.setForeground(new java.awt.Color(0, 102, 102));
        themBHtvjButton.setText("THÊM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maDonHangBHtvjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soLuongBHtvjLabel)
                    .addComponent(maSanPhamBHtvjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(maDonHangBHtvjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maSanPhamBHtvjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soLuongBHtvjTextField))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maKhachHangBHtvjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ngayMuaBHtvjLabel)
                                    .addComponent(maNhanVienBHtvjLabel))
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maKhachHangBHtvjTextField)
                                    .addComponent(ngayMuaBHtvjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maNhanVienBHtvjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(184, 184, 184))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(369, 369, 369)
                                .addComponent(xuatBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(themBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(suaBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoaBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nhapBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 93, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maDonHangBHtvjLabel)
                    .addComponent(maKhachHangBHtvjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maKhachHangBHtvjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maDonHangBHtvjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maSanPhamBHtvjLabel)
                        .addComponent(maSanPhamBHtvjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ngayMuaBHtvjLabel))
                    .addComponent(ngayMuaBHtvjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soLuongBHtvjLabel)
                    .addComponent(soLuongBHtvjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maNhanVienBHtvjLabel)
                    .addComponent(maNhanVienBHtvjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suaBHtvjButton)
                    .addComponent(xoaBHtvjButton)
                    .addComponent(themBHtvjButton)
                    .addComponent(nhapBHtvjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xuatBHtvjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("THÀNH VIÊN", jPanel1);

        banHangKTVjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Ngày mua", "Mã nhân viên"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(banHangKTVjTable);
        if (banHangKTVjTable.getColumnModel().getColumnCount() > 0) {
            banHangKTVjTable.getColumnModel().getColumn(0).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(1).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(2).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(3).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(4).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(5).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(6).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(7).setResizable(false);
            banHangKTVjTable.getColumnModel().getColumn(8).setResizable(false);
        }

        maDonHangBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maDonHangBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maDonHangBHKTVjLabel.setText("Mã đơn hàng");

        ngayMuaBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ngayMuaBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        ngayMuaBHKTVjLabel.setText("Ngày mua");

        hoTenBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        hoTenBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        hoTenBHKTVjLabel.setText("Họ tên");

        themBHKTVjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        themBHKTVjButton.setForeground(new java.awt.Color(0, 102, 102));
        themBHKTVjButton.setText("THÊM");

        xoaBHKTVjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xoaBHKTVjButton.setForeground(new java.awt.Color(0, 102, 102));
        xoaBHKTVjButton.setText("XÓA");

        nhapBHKTVjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nhapBHKTVjButton.setForeground(new java.awt.Color(0, 102, 102));
        nhapBHKTVjButton.setText("NHẬP");
        nhapBHKTVjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapBHKTVjButtonActionPerformed(evt);
            }
        });

        ngayMuaBHKTVjDateChooser.setForeground(new java.awt.Color(0, 102, 102));

        soDienThoaiBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        soDienThoaiBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        soDienThoaiBHKTVjLabel.setText("Số điện thoại");

        soLuongBHktvjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        soLuongBHktvjLabel.setForeground(new java.awt.Color(0, 102, 102));
        soLuongBHktvjLabel.setText("Số lượng");

        soLuongBHKTVjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuongBHKTVjTextFieldActionPerformed(evt);
            }
        });

        maSanPhamBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maSanPhamBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maSanPhamBHKTVjLabel.setText("Mã sản phẩm");

        maSanPhamBHKTVjComboBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maSanPhamBHKTVjComboBox.setForeground(new java.awt.Color(0, 102, 102));
        maSanPhamBHKTVjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maSanPhamBHKTVjComboBoxActionPerformed(evt);
            }
        });

        maNhanVienBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        maNhanVienBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        maNhanVienBHKTVjLabel.setText("Mã nhân viên");

        diaChiBHKTVjLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        diaChiBHKTVjLabel.setForeground(new java.awt.Color(0, 102, 102));
        diaChiBHKTVjLabel.setText("Địa chỉ");

        suaBHKTVjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        suaBHKTVjButton.setForeground(new java.awt.Color(0, 102, 102));
        suaBHKTVjButton.setText("SỬA");

        xuatBHKTVjButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        xuatBHKTVjButton.setForeground(new java.awt.Color(0, 102, 102));
        xuatBHKTVjButton.setText("XUẤT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(soDienThoaiBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(soDienThoaiBHKTVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(maDonHangBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(maDonHangBHKTVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
                        .addGap(272, 272, 272))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(hoTenBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hoTenBHKTVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addGap(275, 275, 275))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(diaChiBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(diaChiBHKTVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addGap(275, 275, 275)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(soLuongBHktvjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)
                                .addComponent(soLuongBHKTVjTextField))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(maSanPhamBHKTVjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ngayMuaBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maNhanVienBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ngayMuaBHKTVjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(maNhanVienBHKTVjTextField))))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(themBHKTVjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(suaBHKTVjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(xoaBHKTVjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(nhapBHKTVjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maSanPhamBHKTVjLabel))
                        .addContainerGap(47, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(xuatBHKTVjButton)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maDonHangBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maDonHangBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maSanPhamBHKTVjLabel)
                    .addComponent(maSanPhamBHKTVjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoTenBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoTenBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuongBHktvjLabel)
                    .addComponent(soLuongBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(diaChiBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaChiBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngayMuaBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soDienThoaiBHKTVjLabel)
                            .addComponent(soDienThoaiBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maNhanVienBHKTVjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ngayMuaBHKTVjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(maNhanVienBHKTVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themBHKTVjButton)
                    .addComponent(xoaBHKTVjButton)
                    .addComponent(nhapBHKTVjButton)
                    .addComponent(suaBHKTVjButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addComponent(xuatBHKTVjButton))
        );

        jTabbedPane1.addTab("KHÔNG THÀNH VIÊN", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void soLuongBHKTVjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuongBHKTVjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soLuongBHKTVjTextFieldActionPerformed

    private void maSanPhamBHKTVjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maSanPhamBHKTVjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maSanPhamBHKTVjComboBoxActionPerformed

    private void maDonHangBHtvjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maDonHangBHtvjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maDonHangBHtvjTextFieldActionPerformed

    private void soLuongBHtvjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuongBHtvjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soLuongBHtvjTextFieldActionPerformed

    private void maKhachHangBHtvjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maKhachHangBHtvjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maKhachHangBHtvjTextFieldActionPerformed

    private void maSanPhamBHtvjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maSanPhamBHtvjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maSanPhamBHtvjComboBoxActionPerformed

    private void nhapBHKTVjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapBHKTVjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nhapBHKTVjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable banHangKTVjTable;
    private javax.swing.JTable banhangTVjTable;
    private javax.swing.JLabel diaChiBHKTVjLabel;
    private javax.swing.JTextField diaChiBHKTVjTextField;
    private javax.swing.JLabel hoTenBHKTVjLabel;
    private javax.swing.JTextField hoTenBHKTVjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel maDonHangBHKTVjLabel;
    private javax.swing.JTextField maDonHangBHKTVjTextField;
    private javax.swing.JLabel maDonHangBHtvjLabel;
    private javax.swing.JTextField maDonHangBHtvjTextField;
    private javax.swing.JLabel maKhachHangBHtvjLabel;
    private javax.swing.JTextField maKhachHangBHtvjTextField;
    private javax.swing.JLabel maNhanVienBHKTVjLabel;
    private javax.swing.JTextField maNhanVienBHKTVjTextField;
    private javax.swing.JComboBox<String> maNhanVienBHtvjComboBox;
    private javax.swing.JLabel maNhanVienBHtvjLabel;
    private javax.swing.JComboBox<String> maSanPhamBHKTVjComboBox;
    private javax.swing.JLabel maSanPhamBHKTVjLabel;
    private javax.swing.JComboBox<String> maSanPhamBHtvjComboBox;
    private javax.swing.JLabel maSanPhamBHtvjLabel;
    private com.toedter.calendar.JDateChooser ngayMuaBHKTVjDateChooser;
    private javax.swing.JLabel ngayMuaBHKTVjLabel;
    private com.toedter.calendar.JDateChooser ngayMuaBHtvjDateChooser;
    private javax.swing.JLabel ngayMuaBHtvjLabel;
    private javax.swing.JButton nhapBHKTVjButton;
    private javax.swing.JButton nhapBHtvjButton;
    private javax.swing.JLabel soDienThoaiBHKTVjLabel;
    private javax.swing.JTextField soDienThoaiBHKTVjTextField;
    private javax.swing.JTextField soLuongBHKTVjTextField;
    private javax.swing.JLabel soLuongBHktvjLabel;
    private javax.swing.JLabel soLuongBHtvjLabel;
    private javax.swing.JTextField soLuongBHtvjTextField;
    private javax.swing.JButton suaBHKTVjButton;
    private javax.swing.JButton suaBHtvjButton;
    private javax.swing.JButton themBHKTVjButton;
    private javax.swing.JButton themBHtvjButton;
    private javax.swing.JButton xoaBHKTVjButton;
    private javax.swing.JButton xoaBHtvjButton;
    private javax.swing.JButton xuatBHKTVjButton;
    private javax.swing.JButton xuatBHtvjButton;
    // End of variables declaration//GEN-END:variables
}