/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.session;
import java.awt.Color;
import javax.swing.JOptionPane;
import user.listTenants;
import recieptPrinting.payments;
import registertration.regitrationform;
import rentlist.propertyType;
import testappm.loginApp1;
import user.rentersForm;
import user.userRentAcc;

/**
 *
 * @author JULIANNE
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public adminDashboard() {
        initComponents();
    }
       Color   navcolor = new Color(102,102,102);    
       Color    hovercolor = new Color(51,51,51);   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dash = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ot = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        te = new javax.swing.JPanel();
        tent = new javax.swing.JLabel();
        pey = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        user = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pey1 = new javax.swing.JPanel();
        pay = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jPanel1VetoableChange(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 153, 0));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROPERTY RENTAL SYSTEM");
        jPanel11.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 40));

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/usersb (1)_1.png"))); // NOI18N
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 78, -1));

        acc_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("NAME");
        jPanel14.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ADMIN");
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        dash.setBackground(new java.awt.Color(102, 102, 102));
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-dashboard-40.png"))); // NOI18N
        jLabel12.setText("DASHBOARD");

        javax.swing.GroupLayout dashLayout = new javax.swing.GroupLayout(dash);
        dash.setLayout(dashLayout);
        dashLayout.setHorizontalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        dashLayout.setVerticalGroup(
            dashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.add(dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 190, 60));

        ot.setBackground(new java.awt.Color(102, 102, 102));
        ot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                otMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                otMouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-property-40.png"))); // NOI18N
        jLabel13.setText("PROPERTY TYPE");

        javax.swing.GroupLayout otLayout = new javax.swing.GroupLayout(ot);
        ot.setLayout(otLayout);
        otLayout.setHorizontalGroup(
            otLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        otLayout.setVerticalGroup(
            otLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel14.add(ot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 190, 60));

        te.setBackground(new java.awt.Color(102, 102, 102));
        te.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teMouseExited(evt);
            }
        });

        tent.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tent.setForeground(new java.awt.Color(255, 255, 255));
        tent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-users-40 (1).png"))); // NOI18N
        tent.setText("TENANTS");

        javax.swing.GroupLayout teLayout = new javax.swing.GroupLayout(te);
        te.setLayout(teLayout);
        teLayout.setHorizontalGroup(
            teLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tent, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        teLayout.setVerticalGroup(
            teLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(tent))
        );

        jPanel14.add(te, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 190, 60));

        pey.setBackground(new java.awt.Color(102, 102, 102));
        pey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                peyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                peyMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-reports-40.png"))); // NOI18N
        jLabel15.setText("REPORTS");

        javax.swing.GroupLayout peyLayout = new javax.swing.GroupLayout(pey);
        pey.setLayout(peyLayout);
        peyLayout.setHorizontalGroup(
            peyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        peyLayout.setVerticalGroup(
            peyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, peyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.add(pey, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 200, 60));

        user.setBackground(new java.awt.Color(102, 102, 102));
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userMouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-users-40.png"))); // NOI18N
        jLabel16.setText("USERS");

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16))
        );

        jPanel14.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 180, 50));

        pey1.setBackground(new java.awt.Color(102, 102, 102));
        pey1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pey1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pey1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pey1MouseExited(evt);
            }
        });

        pay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pay.setForeground(new java.awt.Color(255, 255, 255));
        pay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/icons8-cash-and-credit-card-40.png"))); // NOI18N
        pay.setText("PAYMENTS");
        pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                payMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                payMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pey1Layout = new javax.swing.GroupLayout(pey1);
        pey1.setLayout(pey1Layout);
        pey1Layout.setHorizontalGroup(
            pey1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pey1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pay, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        pey1Layout.setVerticalGroup(
            pey1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pey1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.add(pey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 60));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 540));

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/building (1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL PROPERTIES");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 180, 190));

        jPanel6.setBackground(new java.awt.Color(255, 255, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL TENANTS");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/users(light).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 200, 190));

        jPanel7.setBackground(new java.awt.Color(51, 255, 0));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PROPERTY");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/rentlist.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(52, 52, 52))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 190, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      session sess = session.getInstance();  
      acc_name.setText(""+sess.getFirstname());   
      
    }//GEN-LAST:event_formWindowActivated

    private void jPanel1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_jPanel1VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1VetoableChange

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        userRentAcc ur = new userRentAcc();
        ur.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel14MouseClicked

    private void userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseExited
        user.setBackground(navcolor);
    }//GEN-LAST:event_userMouseExited

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        user.setBackground(hovercolor);
    }//GEN-LAST:event_userMouseEntered

    private void peyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peyMouseExited
        pey.setBackground(navcolor);
    }//GEN-LAST:event_peyMouseExited

    private void peyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peyMouseEntered
        pey.setBackground(hovercolor);
    }//GEN-LAST:event_peyMouseEntered

    private void teMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teMouseExited
        te.setBackground(navcolor);
    }//GEN-LAST:event_teMouseExited

    private void teMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teMouseEntered
        te.setBackground(hovercolor);
    }//GEN-LAST:event_teMouseEntered

    private void otMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otMouseExited
        ot.setBackground(navcolor);
    }//GEN-LAST:event_otMouseExited

    private void otMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otMouseEntered
        ot.setBackground(hovercolor);
    }//GEN-LAST:event_otMouseEntered

    private void otMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otMouseClicked
      propertyType pt = new propertyType();
      pt.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_otMouseClicked

    private void dashMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseExited
        dash.setBackground(navcolor);
    }//GEN-LAST:event_dashMouseExited

    private void dashMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseEntered
        dash.setBackground(hovercolor);
    }//GEN-LAST:event_dashMouseEntered

    private void dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseClicked
        adminDashboard ad = new adminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashMouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        usersForm us = new usersForm();
        us.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userMouseClicked

    private void peyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peyMouseClicked
       listTenants lt = new listTenants();
       lt.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_peyMouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        usersForm uf = new usersForm();
        uf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void pey1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pey1MouseClicked
      payments pay = new payments();
      pay.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_pey1MouseClicked

    private void pey1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pey1MouseEntered
        pey1.setBackground(hovercolor);  
    }//GEN-LAST:event_pey1MouseEntered

    private void pey1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pey1MouseExited
         pey1.setBackground(navcolor);
    }//GEN-LAST:event_pey1MouseExited

    private void payMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseEntered
        pay.setBackground(hovercolor);  
    }//GEN-LAST:event_payMouseEntered

    private void payMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payMouseExited
        pay.setBackground(navcolor);
    }//GEN-LAST:event_payMouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
       
    }//GEN-LAST:event_jPanel7MouseClicked

    private void teMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teMouseClicked
       rentersForm pf = new rentersForm();
       pf.setVisible(true);
       this.dispose();
        
    }//GEN-LAST:event_teMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JPanel dash;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPanel ot;
    private javax.swing.JLabel pay;
    private javax.swing.JPanel pey;
    private javax.swing.JPanel pey1;
    private javax.swing.JPanel te;
    private javax.swing.JLabel tent;
    private javax.swing.JPanel user;
    // End of variables declaration//GEN-END:variables
}
