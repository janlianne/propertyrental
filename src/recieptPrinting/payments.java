/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recieptPrinting;

import admin.adminDashboard;
import admin.createuserForm;
import admin.propertyForm;
import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import user.rentersForm;

/**
 *
 * @author JULIANNE
 */
public class payments extends javax.swing.JFrame {

    /**
     * Creates new form listTenants
     */
    public payments() {
        initComponents();
        displayData();
    }

  Color   navcolor = new Color(102,102,102);    
       Color    hovercolor = new Color(51,51,51);    
public void displayData(){
   try{
       dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT  p_id, firstname,lastname, propertyType,MonthlyRent, date_rented FROM tbl_rent");
       payments.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
        
   }catch(SQLException ex){ 
       System.out.println("Errors: "+ex.getMessage());
       
   }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        D_add = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        view = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        D_print = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        payments = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PAYMENTS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, -1));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/usersb (1).png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_name.setText("USERS");
        jPanel4.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("CURRENT USER:");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        acc_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acc_id.setText("ID");
        jPanel4.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 397, -1, -1));

        jPanel5.setLayout(null);
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 139, -1, -1));

        jPanel6.setLayout(null);
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(245, 158, -1, -1));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 120, 120));

        D_add.setBackground(new java.awt.Color(102, 102, 102));
        D_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D_addMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-add-40.png"))); // NOI18N
        jLabel7.setText("ADD");

        javax.swing.GroupLayout D_addLayout = new javax.swing.GroupLayout(D_add);
        D_add.setLayout(D_addLayout);
        D_addLayout.setHorizontalGroup(
            D_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(D_addLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        D_addLayout.setVerticalGroup(
            D_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel7.add(D_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, -1, -1));

        view.setBackground(new java.awt.Color(102, 102, 102));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-view-40.png"))); // NOI18N
        jLabel3.setText("VIEW");

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, -1));

        D_print.setBackground(new java.awt.Color(102, 102, 102));
        D_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D_printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                D_printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                D_printMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-print-40.png"))); // NOI18N
        jLabel6.setText("PRINT");

        javax.swing.GroupLayout D_printLayout = new javax.swing.GroupLayout(D_print);
        D_print.setLayout(D_printLayout);
        D_printLayout.setHorizontalGroup(
            D_printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, D_printLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(19, 19, 19))
        );
        D_printLayout.setVerticalGroup(
            D_printLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel7.add(D_print, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 130, -1));

        jLabel4.setBackground(new java.awt.Color(77, 142, 181));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/bwb (1).jpg"))); // NOI18N
        jLabel4.setText("BACK");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 316, 64, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 370));

        jPanel3.setBackground(new java.awt.Color(51, 153, 0));

        payments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(payments);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 440, 350));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

    }//GEN-LAST:event_jPanel4MouseClicked

    private void D_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_addMouseClicked
        rentersForm crf = new rentersForm();
        crf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_D_addMouseClicked

    private void D_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_addMouseEntered
        D_add.setBackground(hovercolor);
    }//GEN-LAST:event_D_addMouseEntered

    private void D_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_addMouseExited
        D_add.setBackground(navcolor);
    }//GEN-LAST:event_D_addMouseExited

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        int rowIndex = payments.getSelectedRow();
        if(rowIndex<0){

            JOptionPane.showMessageDialog(null, "Please an select Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = payments.getModel();
                ResultSet rs =dbc.getData("SELECT * FROM tbl_rent WHERE p_id = '"+tbl.getValueAt(rowIndex,0)+"'");
                if(rs.next()){
                    view rp = new view();
                    rp.pid.setText(""+rs.getInt("p_id"));
                    rp.rid.setText(""+rs.getInt("r_id"));
                    rp.fn.setText(""+rs.getString("firstname"));
                    rp.ln.setText(""+rs.getString("lastname"));
                    rp.dr.setText(""+rs.getString("date_rented"));
                    rp.mr.setText(""+rs.getString("MonthlyRent"));
                   

                    rp.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }

        }  
    }//GEN-LAST:event_viewMouseClicked

    private void viewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseEntered
        view.setBackground(hovercolor);
    }//GEN-LAST:event_viewMouseEntered

    private void viewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseExited
        view.setBackground(navcolor);
    }//GEN-LAST:event_viewMouseExited

    private void D_printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_printMouseClicked
        int rowIndex = payments.getSelectedRow();
        if(rowIndex<0){

            JOptionPane.showMessageDialog(null, "Please an select Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = payments.getModel();
                ResultSet rs =dbc.getData("SELECT * FROM tbl_rent WHERE p_id = '"+tbl.getValueAt(rowIndex,0)+"'");
                if(rs.next()){
                    recieptPrint rp = new recieptPrint();
                    rp.pid.setText(""+rs.getInt("p_id"));
                    rp.rid.setText(""+rs.getInt("r_id"));
                    rp.fn.setText(""+rs.getString("firstname"));
                    rp.ln.setText(""+rs.getString("lastname"));
                    rp.em.setText(""+rs.getString("email"));
                    rp.con.setText(""+rs.getString("contact_num"));
                    rp.pt.setText(""+rs.getString("PropertyType"));
                    rp.mr.setText(""+rs.getString("MonthlyRent"));
                    rp.dr.setText(""+rs.getString("date_rented"));
                    rp.nr.setText(""+rs.getString("no_room"));

                    rp.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }

        }
    }//GEN-LAST:event_D_printMouseClicked

    private void D_printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_printMouseEntered
        D_print.setBackground(hovercolor);
    }//GEN-LAST:event_D_printMouseEntered

    private void D_printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_printMouseExited
        D_print.setBackground(navcolor);
    }//GEN-LAST:event_D_printMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        adminDashboard ds = new adminDashboard();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel D_add;
    private javax.swing.JPanel D_print;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable payments;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
