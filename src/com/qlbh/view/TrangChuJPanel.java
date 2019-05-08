/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.view;

import com.qlbh.dao.NhanVienDAO;
import com.qlbh.model.NhanVien;
import com.qlbh.tools.DatesConversion;
import java.text.DecimalFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HoangDucTung
 */
public class TrangChuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TrangChuJPanel
     */
    NhanVien nhanVien = null;
    ImageIcon sai = new ImageIcon("tinhsai.png");
    ImageIcon dung = new ImageIcon("dau-check.png");
    DecimalFormat format = new DecimalFormat("### ### ###");

    

    public TrangChuJPanel(String username) {
        initComponents();
        nhanVien = NhanVienDAO.getNhanVien(username);
        loadNhanVien();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        doiMatKhaujLabel = new javax.swing.JLabel();
        capNhapjButton = new javax.swing.JButton();
        maNhanVienjTextField = new javax.swing.JTextField();
        hoTenjTextField = new javax.swing.JTextField();
        namjRadioButton = new javax.swing.JRadioButton();
        nujRadioButton = new javax.swing.JRadioButton();
        ngaySinhjDateChooser = new com.toedter.calendar.JDateChooser();
        soDienThoaijTextField = new javax.swing.JTextField();
        emailNVjTextField = new javax.swing.JTextField();
        diaChijTextField = new javax.swing.JTextField();
        chucVujTextField = new javax.swing.JTextField();
        luongNVjTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "THÔNG TIN NHÂN VIÊN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 3, 24), new java.awt.Color(255, 22, 84))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Giới tính");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Ngày sinh");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Địa chỉ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Chức vụ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Lương");

        doiMatKhaujLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        doiMatKhaujLabel.setText("Đổi mật khẩu");
        doiMatKhaujLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doiMatKhaujLabelMouseClicked(evt);
            }
        });

        capNhapjButton.setBackground(new java.awt.Color(255, 22, 84));
        capNhapjButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        capNhapjButton.setForeground(new java.awt.Color(255, 255, 255));
        capNhapjButton.setText("CẬP NHẬP");
        capNhapjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capNhapjButtonMouseClicked(evt);
            }
        });
        capNhapjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capNhapjButtonActionPerformed(evt);
            }
        });

        maNhanVienjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        hoTenjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup1.add(namjRadioButton);
        namjRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        namjRadioButton.setText("Nam");

        buttonGroup1.add(nujRadioButton);
        nujRadioButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nujRadioButton.setText("Nữ");

        ngaySinhjDateChooser.setDateFormatString("dd/MM/yyyy");
        ngaySinhjDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        soDienThoaijTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        emailNVjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        diaChijTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        chucVujTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        luongNVjTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(doiMatKhaujLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(capNhapjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoTenjTextField)
                            .addComponent(maNhanVienjTextField)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(namjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nujRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                            .addComponent(ngaySinhjDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soDienThoaijTextField))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(luongNVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(chucVujTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(diaChijTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(emailNVjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maNhanVienjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailNVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hoTenjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaChijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nujRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chucVujTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(luongNVjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ngaySinhjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soDienThoaijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(capNhapjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(doiMatKhaujLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void doiMatKhaujLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doiMatKhaujLabelMouseClicked
        // TODO add your handling code here:
        DoiMatKhauJFrame doiMatKhauJFrame = new DoiMatKhauJFrame(nhanVien.getMaNhanVien());
        doiMatKhauJFrame.setLocationRelativeTo(null);
        doiMatKhauJFrame.setResizable(false);
        doiMatKhauJFrame.setTitle("Đổi mật khẩu");
        doiMatKhauJFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        doiMatKhauJFrame.setVisible(true);
    }//GEN-LAST:event_doiMatKhaujLabelMouseClicked

    private void capNhapjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capNhapjButtonMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_capNhapjButtonMouseClicked

    private void capNhapjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capNhapjButtonActionPerformed
        // TODO add your handling code here:
        try {
            NhanVien nhanVien = new NhanVien();
            nhanVien.setMaNhanVien(maNhanVienjTextField.getText());
            nhanVien.setTenNhanVien(hoTenjTextField.getText());
            if (namjRadioButton.isSelected()) {
                nhanVien.setGioiTinh(true);
            } else if (nujRadioButton.isSelected()) {
                nhanVien.setGioiTinh(false);
            }
            nhanVien.setNgaySinh(DatesConversion.convertUtilToSql(ngaySinhjDateChooser.getDate()));
            nhanVien.setEmailNhanVien(emailNVjTextField.getText());
            nhanVien.setDiaChiNhanVien(diaChijTextField.getText());
            nhanVien.setSoDienThoai(soDienThoaijTextField.getText());
            nhanVien.setChucVu(chucVujTextField.getText());
            nhanVien.setLuongNhanVien(Double.parseDouble(luongNVjTextField.getText()));
            if (NhanVienDAO.suaNhanVien(nhanVien, maNhanVienjTextField.getText())) {
                JOptionPane.showMessageDialog(null, "Đã chỉnh sửa thông tin", "Message", JOptionPane.INFORMATION_MESSAGE, dung);
            } else {
                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra, thử lại sau", "Message", JOptionPane.INFORMATION_MESSAGE, sai);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null  , "Kiểm tra lại thông tin", "Message", JOptionPane.INFORMATION_MESSAGE , sai);

        }

    }//GEN-LAST:event_capNhapjButtonActionPerformed

    public void loadNhanVien() {
        maNhanVienjTextField.setText(nhanVien.getMaNhanVien());
        maNhanVienjTextField.setEditable(false);
        hoTenjTextField.setText(nhanVien.getTenNhanVien());
        if (nhanVien.isGioiTinh()) {
            namjRadioButton.setSelected(true);
        } else {
            nujRadioButton.setSelected(true);
        }
        ngaySinhjDateChooser.setDate((Date) nhanVien.getNgaySinh());
        soDienThoaijTextField.setText(nhanVien.getSoDienThoai());
        emailNVjTextField.setText(nhanVien.getEmailNhanVien());
        diaChijTextField.setText(nhanVien.getDiaChiNhanVien());
        chucVujTextField.setText(nhanVien.getChucVu());
        chucVujTextField.setEditable(false);
        luongNVjTextField.setText(String.valueOf(format.format(nhanVien.getLuongNhanVien())));
        luongNVjTextField.setEditable(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton capNhapjButton;
    private javax.swing.JTextField chucVujTextField;
    private javax.swing.JTextField diaChijTextField;
    private javax.swing.JLabel doiMatKhaujLabel;
    private javax.swing.JTextField emailNVjTextField;
    private javax.swing.JTextField hoTenjTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField luongNVjTextField;
    private javax.swing.JTextField maNhanVienjTextField;
    private javax.swing.JRadioButton namjRadioButton;
    private com.toedter.calendar.JDateChooser ngaySinhjDateChooser;
    private javax.swing.JRadioButton nujRadioButton;
    private javax.swing.JTextField soDienThoaijTextField;
    // End of variables declaration//GEN-END:variables
}
