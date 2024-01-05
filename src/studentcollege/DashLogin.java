    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentcollege;
import java.awt.Color;
import java.awt.Image;
import java.sql.*;
import static java.lang.System.exit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PRATHABAN
 */
public class DashLogin extends javax.swing.JFrame {

    /**
     * Creates new form DashLogin
     */
    public DashLogin() {
        initComponents();
        Icon i=bgimlogo.getIcon();
        ImageIcon icon=(ImageIcon)i;
        Image image=icon.getImage().getScaledInstance(bgimlogo.getWidth(), bgimlogo.getHeight(), Image.SCALE_SMOOTH);
        bgimlogo.setIcon(new ImageIcon(image));
         Icon j=backcol.getIcon();
        ImageIcon icon1=(ImageIcon)j;
        Image image1=icon1.getImage().getScaledInstance(backcol.getWidth(), backcol.getHeight(), Image.SCALE_SMOOTH);
        backcol.setIcon(new ImageIcon(image1));
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        showpass = new javax.swing.JCheckBox();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bgimlogo = new javax.swing.JLabel();
        backcol = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1650, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(153, 153, 153)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setEnabled(false);
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(518, 178));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, 42));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 218, 42));

        username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        username.setNextFocusableComponent(password);
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 107, 218, 40));

        password.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 218, 42));

        showpass.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        showpass.setText("Show Password ?");
        showpass.setToolTipText("");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });
        jPanel2.add(showpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 162, 32));

        exit.setBackground(new java.awt.Color(153, 255, 153));
        exit.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black)));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 95, 35));

        reset.setBackground(new java.awt.Color(204, 255, 204));
        reset.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        reset.setText("RESET");
        reset.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black)));
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetMouseExited(evt);
            }
        });
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 95, 35));

        login.setBackground(new java.awt.Color(153, 255, 204));
        login.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        login.setText("LOGIN");
        login.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.black, java.awt.Color.black)));
        login.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                loginStateChanged(evt);
            }
        });
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginMouseDragged(evt);
            }
        });
        login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginFocusGained(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel2.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 95, 35));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Faculty Login");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 430, 59));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 340));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 520, 340));

        bgimlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bgimg.jpeg"))); // NOI18N
        jPanel1.add(bgimlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 130));

        backcol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pic.jpg"))); // NOI18N
        jPanel1.add(backcol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 770));

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Save As");
        jMenuItem1.setActionCommand("Save ");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("Save");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("Open");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jMenuItem4.setText("About ");
        jMenuItem4.setToolTipText("");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setText("Change Theme");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String pass = null;
        if(!username.getText().isEmpty()&& !password.getText().isEmpty()){
        try{Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/collegemanagement","root","prathab");
        PreparedStatement pst=con.prepareStatement("select * from faculty where name=?");
        pst.setString(1, username.getText());
        ResultSet rs=pst.executeQuery();
        if(rs.next()){
             pass=rs.getString("password");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Invalid Credentials", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        String p=password.getText();
       if(  pass.equals(p)){
           Menu m=new Menu();
           String s=username.getText().toString();
           m.my_update(s);
           m.setVisible(true);
           dispose();
           
       }
    }catch(ClassNotFoundException ex)
    { 
       System.out.println("Class not found");
    }
    catch(SQLException ex)
    { 
       System.out.println("SQL Error");
       
    }
        }
        else{
            
            JOptionPane.showMessageDialog(rootPane, "Please Enter All Fields", "Alert", JOptionPane.WARNING_MESSAGE);
        
        }
        
    }//GEN-LAST:event_loginActionPerformed
        
  
       
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
       
         username.setText("");
         password.setText("");
         
    
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Saved Successfully");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed
     int i=1;
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        
        switch(i){
            case 1:
                jPanel1.setBackground(Color.decode("#ff00ff"));
                i+=1;
                break;
            case 2:
                jPanel1.setBackground(Color.green);
                i+=1;
                break;
            case 3:
                 jPanel1.setBackground(Color.pink);
                break;
            
                 
        }
           if(i>3){
           jPanel1.setBackground(Color.gray);
               }  
   
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
        if(showpass.isSelected()){
            password.setEchoChar((char)0);
        }
        else{
           password.setEchoChar('*');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        // TODO add your handling code here:
         login.setBackground(Color.orange);
       
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_loginMouseDragged

    private void loginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginFocusGained
        // TODO add your handling code here:
         
    }//GEN-LAST:event_loginFocusGained

    private void loginStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_loginStateChanged
        // TODO add your handling code here:
         
    }//GEN-LAST:event_loginStateChanged

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        // TODO add your handling code here:
        
        login.setBackground(new Color(153,255,204));
    }//GEN-LAST:event_loginMouseExited

    private void resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseEntered
        // TODO add your handling code here:
        reset.setBackground(Color.orange);
    }//GEN-LAST:event_resetMouseEntered

    private void resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseExited
        // TODO add your handling code here:[204,255,204]
         reset.setBackground(new Color(204,255,204));
    }//GEN-LAST:event_resetMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
         exit.setBackground(Color.orange);

    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:[153,255,153]
         exit.setBackground(new Color(153,255,153));
    }//GEN-LAST:event_exitMouseExited

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, " Prathaban \n Premnath \n Priyanka \n Ravindhar \n Sabitha","Developed By P5",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(DashLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backcol;
    private javax.swing.JLabel bgimlogo;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
