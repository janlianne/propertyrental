/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recieptPrinting;

import static admin.createuserForm.getHeightFromWidth;
import config.PanelPrinter;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import user.listTenants;

/**
 *
 * @author JULIANNE
 */
public class recieptPrint extends javax.swing.JFrame {

    /**
     * Creates new form recieptPrint
     */
    public recieptPrint() {
        initComponents();
    }

    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        page = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        pid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rid = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fn = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mr = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dr = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nr = new javax.swing.JLabel();
        print = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 453, -1, -1));

        page.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PROPERTY RENTAL");
        page.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Guadalajara, Guadalupe, Cebu City");
        page.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 39, -1, -1));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        page.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 548, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PROPERTY ID:");
        page.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, -1, -1));

        pid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 135, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ROOM ID:");
        page.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        rid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 135, 27));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("FIRST NAME:");
        page.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        fn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 135, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LAST NAME:");
        page.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        ln.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 135, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("EMAIL:");
        page.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        em.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 135, 27));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("CONTACT #");
        page.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        con.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 135, 27));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PROPERTY TYPE:");
        page.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        pt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(pt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 135, 27));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("MONTHLY RENT:");
        page.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        mr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(mr, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 135, 27));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("DATE RENTED:");
        page.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        dr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 135, 27));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("NO. OF ROOMS:");
        page.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        nr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        page.add(nr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 135, 27));

        print.setBackground(new java.awt.Color(0, 0, 0));
        print.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-print-30.png"))); // NOI18N
        print.setText("PRINT");
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
        });
        page.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-back-30.png"))); // NOI18N
        jLabel8.setText("BACK");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        page.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 492, 374));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        JPanel myPanel = new JPanel();
        PanelPrinter Pprint = new PanelPrinter(page);
        Pprint.printPanel();
    }//GEN-LAST:event_printMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
         listTenants lt = new listTenants();
        lt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(recieptPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recieptPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recieptPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recieptPrint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recieptPrint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel con;
    public javax.swing.JLabel dr;
    public javax.swing.JLabel em;
    public javax.swing.JLabel fn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel ln;
    public javax.swing.JLabel mr;
    public javax.swing.JLabel nr;
    private javax.swing.JPanel page;
    public javax.swing.JLabel pid;
    private javax.swing.JLabel print;
    public javax.swing.JLabel pt;
    public javax.swing.JLabel rid;
    // End of variables declaration//GEN-END:variables
}
