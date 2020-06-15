/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyQuanCafe;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author namduong
 */
public class loginForm extends javax.swing.JFrame {
    Connection connection = null;
    ResultSet rs = null;
    PreparedStatement pstmt =  null;
    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        overlay.setBackground(new Color(0,0,0,150));
        btnLogin.setBackground(new Color(0,0,0,150));
        connection = ConnectDB.dbConnector();
    }
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:/Users/namduong/NetBeansProjects/QuanLiKhachHangg/src/database/database.db";
        try {
            connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
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
        loginBox = new javax.swing.JPanel();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        overlay = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBox.setBackground(new java.awt.Color(255, 255, 255));
        loginBox.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        loginBox.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 258, 30));

        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        loginBox.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 257, 30));

        jLabel4.setBackground(new java.awt.Color(33, 38, 54));
        jLabel4.setFont(new java.awt.Font("UTM Bebas", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 38, 54));
        jLabel4.setText("Dashboard Login");
        loginBox.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 198, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyQuanCafe/img/login-icon.png"))); // NOI18N
        loginBox.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 59, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");
        loginBox.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Password");
        loginBox.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Nhập");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        loginBox.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 40));

        getContentPane().add(loginBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 470, 530));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overlay.setBackground(new Color(0,0,0,100));
        overlay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyQuanCafe/img/logo-login.png"))); // NOI18N
        overlay.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 43, -1, 204));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome");
        overlay.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 265, -1, -1));
        overlay.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 160, -1));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Coffee management system ");
        overlay.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 314, -1, 35));

        jPanel1.add(overlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jLabel6.setBackground(new java.awt.Color(153, 153, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/QuanLyQuanCafe/img/background.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        jLabel6.setMaximumSize(new java.awt.Dimension(833, 531));
        jLabel6.setMinimumSize(new java.awt.Dimension(833, 531));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if (txtUser.getText().equals("") || txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            }
            else {
                String sql="Select * from USER where USERNAME =? and PASSWORD=?";
                try {
                    Connection conn = this.connect();
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString (1,txtUser.getText());
                    pstmt.setString (2,txtPass.getText());
                    rs= pstmt.executeQuery();
                    int count = 0;
                    while(rs.next()) {
                        count++;
                    }
                    if(count==1) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        this.dispose();
                    } else if(count>1) {
                        JOptionPane.showMessageDialog(this, "Username and password are dupllicated");
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập");
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER) {
            if (txtUser.getText().equals("") || txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
            }
            else {
                String sql="Select * from USER where USERNAME =? and PASSWORD=?";
                try {
                    Connection conn = this.connect();
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString (1,txtUser.getText());
                    pstmt.setString (2,txtPass.getText());
                    rs= pstmt.executeQuery();
                    int count = 0;
                    while(rs.next()) {
                        count++;
                    }
                    if(count==1) {
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                        this.dispose();
                    } else if(count>1) {
                        JOptionPane.showMessageDialog(this, "Username and password are dupllicated");
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập");
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String sql="Select * from USER where USERNAME =? and PASSWORD=?";
        try {
            Connection conn = this.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString (1,txtUser.getText());
            pstmt.setString (2,txtPass.getText());
            rs= pstmt.executeQuery();
            int count = 0;
            while(rs.next()) {
                count++;
            }
            if(count==1) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
                this.dispose();
            } else if(count>1) {
                JOptionPane.showMessageDialog(this, "Username and password are dupllicated");
            } else {
                JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel loginBox;
    private javax.swing.JPanel overlay;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
