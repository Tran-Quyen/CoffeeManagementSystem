/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyQuanCafe;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namduong
 */
public class quanLyKho extends javax.swing.JFrame {

    /**
     * Creates new form quanLiKhacHang
     */
    public quanLyKho() {
        initComponents();
        setVisible(true);
        this.taoTable();
    }
    DefaultTableModel tblModelTT;
    public void taoTable() {
        tblModelTT = new DefaultTableModel();
        String tieuDe[] = {"ID", "Họ và tên", "Tuổi", "Địa chỉ", "SDT", "Email"};
        tblModelTT.setColumnIdentifiers(tieuDe);
        tbKhachHang.setModel(tblModelTT);
        setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();
        inputBox = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtHoVaTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtDiaChi = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        actionBox = new javax.swing.JPanel();
        themNhanVien = new javax.swing.JButton();
        xoaNhanVien = new javax.swing.JButton();
        suaNhanVien = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDatMon = new javax.swing.JMenu();
        menuQuanLyMon = new javax.swing.JMenu();
        menuQuanLyKhachHang = new javax.swing.JMenu();
        menuQuanLyNhanVien = new javax.swing.JMenu();
        menuQuanLyKho = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quản Lý Khách Hàng");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 70));

        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Tuổi", "Địa chỉ", "SDT", "Email"
            }
        ));
        tbKhachHang.setAutoscrolls(false);
        tbKhachHang.setSelectionBackground(new java.awt.Color(0, 102, 204));
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhachHang);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 780, 140));

        inputBox.setForeground(new java.awt.Color(255, 255, 255));
        inputBox.setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Họ và tên:");
        jPanel1.add(jLabel4);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tuổi:");
        jPanel1.add(jLabel3);

        inputBox.add(jPanel1);

        jPanel3.setLayout(new java.awt.GridLayout(0, 1));

        txtID.setMinimumSize(new java.awt.Dimension(10, 20));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtID);

        txtHoVaTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoVaTenActionPerformed(evt);
            }
        });
        jPanel3.add(txtHoVaTen);

        txtTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuoiActionPerformed(evt);
            }
        });
        jPanel3.add(txtTuoi);

        inputBox.add(jPanel3);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Địa chỉ:");
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SDT:");
        jPanel2.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email:");
        jPanel2.add(jLabel8);

        inputBox.add(jPanel2);

        jPanel5.setLayout(new java.awt.GridLayout(0, 1));

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });
        jPanel5.add(txtDiaChi);

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        jPanel5.add(txtSDT);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel5.add(txtEmail);

        inputBox.add(jPanel5);

        getContentPane().add(inputBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 780, 130));

        actionBox.setLayout(new java.awt.GridLayout(2, 1));

        themNhanVien.setText("Thêm");
        themNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themNhanVienActionPerformed(evt);
            }
        });
        actionBox.add(themNhanVien);

        xoaNhanVien.setText("Xoá");
        xoaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaNhanVienActionPerformed(evt);
            }
        });
        actionBox.add(xoaNhanVien);

        suaNhanVien.setText("Sửa");
        actionBox.add(suaNhanVien);

        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setText("Reset thông tin đã điền");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        actionBox.add(jButton1);

        getContentPane().add(actionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 780, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/namduong/Downloads/2p5mv0.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(833, 531));
        jLabel1.setMinimumSize(new java.awt.Dimension(833, 531));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 510));

        menuDatMon.setText("Đặt Món");
        menuDatMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDatMonMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuDatMon);

        menuQuanLyMon.setText("Quản Lý Món");
        menuQuanLyMon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQuanLyMonMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuQuanLyMon);

        menuQuanLyKhachHang.setText("Quản Lý Khách Hàng");
        menuQuanLyKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQuanLyKhachHangMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuQuanLyKhachHang);

        menuQuanLyNhanVien.setText("Quản Lý Nhân Viên");
        menuQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQuanLyNhanVienMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuQuanLyNhanVien);

        menuQuanLyKho.setText("Quản Lý Kho");
        menuQuanLyKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuQuanLyKhoMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuQuanLyKho);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTuoiActionPerformed

    private void txtHoVaTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoVaTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoVaTenActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void themNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themNhanVienActionPerformed
        String row[] = new String[6];
        row[0] = txtID.getText();
        row[1] = txtHoVaTen.getText();
        row[2] = txtTuoi.getText();
        row[3] = txtDiaChi.getText();
        row[4] = txtSDT.getText();
        row[5] = txtEmail.getText();
//        if (txtID.getText().equals("") || txtHoVaTen.getText().equals("") || txtTuoi.getText().equals("") || txtDiaChi.getText().equals("") || txtSDT.getText().equals("") || txtEmail.getText().equals("")) {
//            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin");
//        }
//        else {
            tblModelTT.addRow(row);
            txtID.setText(null);
            txtHoVaTen.setText(null);
            txtTuoi.setText(null);  
            txtDiaChi.setText(null);
            txtSDT.setText(null);
            txtEmail.setText(null);   
//        }
    }//GEN-LAST:event_themNhanVienActionPerformed

    private void xoaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaNhanVienActionPerformed
        int indexTB = tbKhachHang.getSelectedRow();
        tblModelTT.removeRow(indexTB);        // TODO add your handling code here:
    }//GEN-LAST:event_xoaNhanVienActionPerformed

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        
    }//GEN-LAST:event_tbKhachHangMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtID.setText(null);
        txtHoVaTen.setText(null);
        txtTuoi.setText(null);  
        txtDiaChi.setText(null);
        txtSDT.setText(null);
        txtEmail.setText(null); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menuDatMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDatMonMouseClicked
        // TODO add your handling code here:
        new menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuDatMonMouseClicked

    private void menuQuanLyMonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQuanLyMonMouseClicked
        // TODO add your handling code here:
        new quanLyMon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuQuanLyMonMouseClicked

    private void menuQuanLyKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQuanLyKhachHangMouseClicked
        new quanLyKho().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuQuanLyKhachHangMouseClicked

    private void menuQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQuanLyNhanVienMouseClicked
        new quanLyNhanVien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuQuanLyNhanVienMouseClicked

    private void menuQuanLyKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuQuanLyKhoMouseClicked
        new quanLyKho().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuQuanLyKhoMouseClicked

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
            java.util.logging.Logger.getLogger(quanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quanLyKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionBox;
    private javax.swing.JPanel inputBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuDatMon;
    private javax.swing.JMenu menuQuanLyKhachHang;
    private javax.swing.JMenu menuQuanLyKho;
    private javax.swing.JMenu menuQuanLyMon;
    private javax.swing.JMenu menuQuanLyNhanVien;
    private javax.swing.JButton suaNhanVien;
    private javax.swing.JTable tbKhachHang;
    private javax.swing.JButton themNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JButton xoaNhanVien;
    // End of variables declaration//GEN-END:variables
}
