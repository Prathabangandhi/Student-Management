/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentcollege;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.*;

import java.sql.Connection;
import javax.swing.JPanel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PRATHABAN
 */
public class stud_search extends javax.swing.JFrame {
    public int count=0;
        public int select=0;

    /**
     * Creates new form stud_search
     */
    public stud_search() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        u1 = new javax.swing.JLabel();
        u2 = new javax.swing.JLabel();
        u3 = new javax.swing.JLabel();
        u4 = new javax.swing.JLabel();
        u5 = new javax.swing.JLabel();
        sdat = new javax.swing.JLabel();
        sadd = new javax.swing.JLabel();
        sname = new javax.swing.JLabel();
        sreg = new javax.swing.JLabel();
        sdep = new javax.swing.JLabel();
        smobile = new javax.swing.JLabel();
        semail = new javax.swing.JLabel();
        sdate = new javax.swing.JLabel();
        cgpashow = new javax.swing.JLabel();
        cgparesult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saddres = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        selectsem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Search  Student  Records");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Register No            :");
        jLabel2.setToolTipText("");

        regno.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        regno.setToolTipText("");
        regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnoActionPerformed(evt);
            }
        });
        regno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regnoKeyPressed(evt);
            }
        });

        search.setBackground(new java.awt.Color(255, 255, 153));
        search.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        search.setText("SEARCH");
        search.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black)));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));

        u1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u1.setText("Student Name        :");
        u1.setToolTipText("");

        u2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u2.setText("Register Number   :");
        u2.setToolTipText("");

        u3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u3.setText("Department            :");
        u3.setToolTipText("");

        u4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u4.setText("Mobile Number     :");
        u4.setToolTipText("");

        u5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        u5.setText("Email Id                  :");
        u5.setToolTipText("");

        sdat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sdat.setText("Admission Date     :");
        sdat.setToolTipText("");

        sadd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sadd.setText("Address                 :");
        sadd.setToolTipText("");

        sname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sname.setForeground(new java.awt.Color(0, 0, 204));
        sname.setToolTipText("");

        sreg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sreg.setForeground(new java.awt.Color(0, 0, 204));
        sreg.setToolTipText("");

        sdep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sdep.setForeground(new java.awt.Color(0, 0, 204));
        sdep.setToolTipText("");

        smobile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        smobile.setForeground(new java.awt.Color(0, 0, 204));
        smobile.setToolTipText("");

        semail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        semail.setForeground(new java.awt.Color(0, 0, 204));
        semail.setToolTipText("");

        sdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sdate.setForeground(new java.awt.Color(0, 0, 204));
        sdate.setToolTipText("");

        cgpashow.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cgpashow.setToolTipText("");

        cgparesult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cgparesult.setForeground(new java.awt.Color(0, 0, 204));

        saddres.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        saddres.setForeground(new java.awt.Color(0, 0, 204));
        saddres.setToolTipText("");
        jScrollPane1.setViewportView(saddres);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(u5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(u4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(smobile, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(u3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sdep, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sreg, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cgpashow, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cgparesult, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sadd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sdat, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(u1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cgparesult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cgpashow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(u2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sreg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(u3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdep, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(u4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(smobile, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(u5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sdat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(sadd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        back.setBackground(new java.awt.Color(0, 255, 51));
        back.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        selectsem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectsem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT SEMSTER", "SEM 1", "SEM 2", "SEM 3" }));
        selectsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectsemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(580, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectsem, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(79, 79, 79)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(selectsem, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnoActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_regnoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        
        
        Menu m=new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
         searchaction();
                    
        
    }//GEN-LAST:event_searchActionPerformed

    private void regnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regnoKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_regnoKeyPressed

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            searchaction();
        }
    }//GEN-LAST:event_searchKeyPressed

    private void selectsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectsemActionPerformed

         String h=selectsem.getSelectedItem().toString();
            if(h.equals("SELECT SEMESTER")){
                select=0;
            }
             if(h.equals("SEM 1")){
                select=1;
                u2.setText("MC4111                :");
                u3.setText("MC4112                :");
                u4.setText("MC4113                :");
                u5.setText("MC4114                :");
                sdat.setText("MC4115                :");
                sadd.setText("MC4116                :");
            }
              if(h.equals("SEM 2")){
                select=2;
                
                u2.setText("MC4221                :");
                u3.setText("MC4222                :");
                u4.setText("MC4223                :");
                u5.setText("MC4224                :");
                sdat.setText("MC4225                :");
                sadd.setText("MC4226                :");
              }
               if(h.equals("SEM 3")){
                select=3;
                
                u2.setText("MC4331                :");
                u3.setText("MC4332                :");
                u4.setText("MC4333                :");
                u5.setText("MC4334                :");
                sdat.setText("MC4335                :");
                sadd.setText("MC4336                :");
            }



        // TODO add your handling code here:
    }//GEN-LAST:event_selectsemActionPerformed

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        // TODO add your handling code here:
        search.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_searchMouseExited

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        // TODO add your handling code here:
        search.setBackground(new Color(255,0,255));
    }//GEN-LAST:event_searchMouseEntered

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setBackground(new Color(255,255,153));
    }//GEN-LAST:event_backMouseEntered

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
            java.util.logging.Logger.getLogger(stud_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stud_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stud_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stud_search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stud_search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel cgparesult;
    private javax.swing.JLabel cgpashow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField regno;
    private javax.swing.JLabel sadd;
    private javax.swing.JLabel saddres;
    private javax.swing.JLabel sdat;
    private javax.swing.JLabel sdate;
    private javax.swing.JLabel sdep;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> selectsem;
    private javax.swing.JLabel semail;
    private javax.swing.JLabel smobile;
    private javax.swing.JLabel sname;
    private javax.swing.JLabel sreg;
    private javax.swing.JLabel u1;
    private javax.swing.JLabel u2;
    private javax.swing.JLabel u3;
    private javax.swing.JLabel u4;
    private javax.swing.JLabel u5;
    // End of variables declaration//GEN-END:variables

    void my_update(int i) {
         if(i==1){
        sdat.setText("Admission Date      :");
        sadd.setText("Address                  :");
        count=i;
        selectsem.setVisible(false);
        }
        if(i==2){
        sdat.setText("Date                       :");
        sadd.setText("Amount                  :");
        count=i;
        selectsem.setVisible(false);
        }
        if(i==3){
               u1.setText("Register No          :");
                u2.setText("MC4111              :");
                u3.setText("MC4111              :");
                u4.setText("MC4111              :");
                u5.setText("MC4111              :");
                sdat.setText("MC4111            :");
                sadd.setText("MC4111            :");
             cgpashow.setText("CGPA :");
             selectsem.setVisible(true);
             count=i;
        }
    }

    private void searchaction() {
    if(count==1){
            if(!regno.getText().isEmpty()){
             try{Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
            PreparedStatement pst=con.prepareStatement("select * from studentinfo where RegisterNo=?");
            pst.setString(1,regno.getText() );
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                sname.setText(rs.getString("Name"));
                sreg.setText(rs.getString("RegisterNo"));
                sdep.setText(rs.getString("Dep"));
                smobile.setText(rs.getString("Mobile"));
                semail.setText(rs.getString("Email"));
                sdate.setText(rs.getString("AdmissionDate"));
                saddres.setText(rs.getString("Address"));
                   
                
            }
            else{
            
            JOptionPane.showMessageDialog(rootPane, "Plz Enter Valid Reg NO","Failed",JOptionPane.WARNING_MESSAGE);
             }
           
                }
            catch(ClassNotFoundException ex)
        { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error"+ex);
       
    }
        }
        else{
                JOptionPane.showMessageDialog(rootPane, "Plz Enter Register No","Alert",JOptionPane.WARNING_MESSAGE);
        
        }
        
        
        }
    if(count==2){
            if(!regno.getText().isEmpty()){
             try{Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
            PreparedStatement pst=con.prepareStatement("select * from feereport where Regno=?");
            pst.setString(1,regno.getText() );
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                sname.setText(rs.getString("Name"));
                sreg.setText(rs.getString("Regno"));
                sdep.setText(rs.getString("Dep"));
                smobile.setText(rs.getString("Mobile"));
                semail.setText(rs.getString("Email"));
                sdate.setText(rs.getString("Date"));
                saddres.setText(rs.getString("Amount"));
                   
                
            }
            else{
            
            JOptionPane.showMessageDialog(rootPane, "Plz Enter Valid Reg NO","Failed",JOptionPane.WARNING_MESSAGE);
             }
           
                }
            catch(ClassNotFoundException ex)
        { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error"+ex);
       
    }
        }
        else{
                JOptionPane.showMessageDialog(rootPane, "Plz Enter Register No","Alert",JOptionPane.WARNING_MESSAGE);
        
        }
        }
    
    if(count==3 ){
            if(!regno.getText().isEmpty()){
                try{
                    Double.parseDouble(regno.getText().toString());
                    if(select==0){
                     JOptionPane.showMessageDialog(rootPane, "Plz Select Semester","Failed",JOptionPane.WARNING_MESSAGE);
                   }
            if(select==1){
                
             try{Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
            PreparedStatement pst=con.prepareStatement("select * from sem1 where Regno=?");
            pst.setString(1,regno.getText() );
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                sname.setText(rs.getString("Regno"));
                sreg.setText(rs.getString("MC4111"));
                sdep.setText(rs.getString("MC4112"));
                smobile.setText(rs.getString("MC4113"));
                semail.setText(rs.getString("MC4114"));
                sdate.setText(rs.getString("MC4115"));
                saddres.setText(rs.getString("MC4116"));
                cgparesult.setText(rs.getString("cgpa"));
                   
                
            }
            else{
            
            JOptionPane.showMessageDialog(rootPane, "Reg NO Does n't Match From DB","Failed",JOptionPane.WARNING_MESSAGE);
             }
           
                }
            catch(ClassNotFoundException ex)
        { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error"+ex);
       
    }
                }
            if(select==2){
                
             try{Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
            PreparedStatement pst=con.prepareStatement("select * from sem2 where Regno=?");
            pst.setString(1,regno.getText() );
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                sname.setText(rs.getString("Regno"));
                sreg.setText(rs.getString("MC4221"));
                sdep.setText(rs.getString("MC4222"));
                smobile.setText(rs.getString("MC4223"));
                semail.setText(rs.getString("MC4224"));
                sdate.setText(rs.getString("MC4225"));
                saddres.setText(rs.getString("MC4226"));
                cgparesult.setText(rs.getString("cgpa"));
                   
                
            }
            else{
            
            JOptionPane.showMessageDialog(rootPane, "Reg NO Does n't Match From DB","Failed",JOptionPane.WARNING_MESSAGE);
             }
           
                }
            catch(ClassNotFoundException ex)
        { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error"+ex);
       
    }
                }
             if(select==3){
                
             try{Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
            PreparedStatement pst=con.prepareStatement("select * from sem3 where Regno=?");
            pst.setString(1,regno.getText() );
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
                sname.setText(rs.getString("Regno"));
                sreg.setText(rs.getString("MC4331"));
                sdep.setText(rs.getString("MC4332"));
                smobile.setText(rs.getString("MC4333"));
                semail.setText(rs.getString("MC4334"));
                sdate.setText(rs.getString("MC4335"));
                saddres.setText(rs.getString("MC4336"));
                cgparesult.setText(rs.getString("cgpa"));
                   
                
            }
            else{
            
            JOptionPane.showMessageDialog(rootPane, "Reg NO Does n't Match From DB","Failed",JOptionPane.WARNING_MESSAGE);
             }
           
                }
            catch(ClassNotFoundException ex)
        { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error"+ex);
       
    }
                }
                }
                catch(Exception e){
                     JOptionPane.showMessageDialog(rootPane, "Plz Enter Valid Reg NO","Failed",JOptionPane.WARNING_MESSAGE);
                    
                }
            }
            
            
         else{
                JOptionPane.showMessageDialog(rootPane, "Plz Enter Register No","Alert",JOptionPane.WARNING_MESSAGE);
        
        }
        }
    }
           
}