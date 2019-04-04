/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbh.view;

import com.qlbh.dao.AdminDAO;
import com.qlbh.dao.UserDAO;
import com.qlbh.tools.MD5;
import java.awt.Color;

/**
 *
 * @author HoangDucTung
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginJFrame
     */
    public LoginJFrame() {
        initComponents();
        LoginJFrame.super.setLocationRelativeTo(null);
        LoginJFrame.super.setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernamejTextField = new javax.swing.JTextField();
        passwordjPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        xacNhanjLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        thongBaojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbh/images/account.png"))); // NOI18N

        usernamejTextField.setBackground(new java.awt.Color(229, 229, 229));
        usernamejTextField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        usernamejTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernamejTextField.setBorder(null);
        usernamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamejTextFieldActionPerformed(evt);
            }
        });

        passwordjPasswordField.setBackground(new java.awt.Color(229, 229, 229));
        passwordjPasswordField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        passwordjPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordjPasswordField.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 33, 61));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ĐĂNG NHẬP");

        xacNhanjLabel.setBackground(new java.awt.Color(20, 33, 61));
        xacNhanjLabel.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        xacNhanjLabel.setForeground(new java.awt.Color(255, 255, 255));
        xacNhanjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xacNhanjLabel.setText("XÁC NHẬN");
        xacNhanjLabel.setOpaque(true);
        xacNhanjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xacNhanjLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xacNhanjLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xacNhanjLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xacNhanjLabelMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel3.setText("Tên đăng nhập");

        jLabel4.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel4.setText("Mật khẩu");

        thongBaojLabel.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        thongBaojLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(xacNhanjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(passwordjPasswordField)
                    .addComponent(usernamejTextField)
                    .addComponent(thongBaojLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(thongBaojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xacNhanjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        usernamejTextField.getAccessibleContext().setAccessibleDescription("");
        passwordjPasswordField.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xacNhanjLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xacNhanjLabelMouseEntered
        // TODO add your handling code here:
        xacNhanjLabel.setBackground(new Color(252, 163, 17));
        xacNhanjLabel.setForeground(new Color(20, 33, 61));

    }//GEN-LAST:event_xacNhanjLabelMouseEntered

    private void usernamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamejTextFieldActionPerformed

    private void xacNhanjLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xacNhanjLabelMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_xacNhanjLabelMousePressed

    private void xacNhanjLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xacNhanjLabelMouseExited
        // TODO add your handling code here:
        xacNhanjLabel.setBackground(new Color(20, 33, 61));
        xacNhanjLabel.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_xacNhanjLabelMouseExited

    private void xacNhanjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xacNhanjLabelMouseClicked
        // TODO add your handling code here:
        String username = usernamejTextField.getText();
        String password = String.valueOf(passwordjPasswordField.getPassword());
        if (username.equals("") || password.equals("")) {
            thongBaojLabel.setText("Vui lòng điền đầy đủ thông tin");
        } else {

            if (username.equals("administrator")) {
                if (AdminDAO.checkLogin(username, password)) {
                    AccountManager accountManager = new AccountManager(username);
                    //accountManager.setUsername(username);
                    accountManager.setLocationRelativeTo(null);
                    accountManager.setResizable(false);
                    accountManager.setVisible(true);
                    this.dispose();

                } else {
                    thongBaojLabel.setText("Mật khẩu không đúng");
                }
            } else {
                if (UserDAO.checkUser(username, password)) {
                    MainJFrame mainJFrame = new MainJFrame(username);
                    mainJFrame.setLocationRelativeTo(null);
                    mainJFrame.setVisible(true);
                    this.dispose();
                } else {
                    thongBaojLabel.setText("Tên đăng nhập hoặc mật khẩu không đúng");

                }
            }
        }

    }//GEN-LAST:event_xacNhanjLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordjPasswordField;
    private javax.swing.JLabel thongBaojLabel;
    private javax.swing.JTextField usernamejTextField;
    private javax.swing.JLabel xacNhanjLabel;
    // End of variables declaration//GEN-END:variables
}
