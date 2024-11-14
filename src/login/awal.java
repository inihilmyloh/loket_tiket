/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;
import Halaman.HalamanUtama;
import com.mysql.cj.jdbc.StatementImpl;
import com.mysql.cj.protocol.Resultset;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import database.Database;
import Halaman.*;

/**
 *
 * @author ASUS
 */
public class awal extends javax.swing.JFrame {
    public static Connection com;
    public static Statement stm; 
    int xx,xy;
    int x,y;

    
    public awal() {
        initComponents();
        hide.setVisible(false);
        keluar2.setVisible(false); 
        mini2.setVisible(false); 
        
        gae.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Membuka JFrame Login
            resgister register_uiFrame = new resgister();
            register_uiFrame.setVisible(true);
            dispose();
                }});
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gae = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        hide = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        mini = new javax.swing.JLabel();
        mini2 = new javax.swing.JLabel();
        keluar = new javax.swing.JLabel();
        keluar2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gae.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sign up.png"))); // NOI18N
        getContentPane().add(gae, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/eye.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                showMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                showMouseExited(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 20, 40));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hide.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hideMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hideMouseExited(evt);
            }
        });
        getContentPane().add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 380, 20, 40));

        login.setContentAreaFilled(false);
        login.setOpaque(false);
        login.setBorderPainted(false);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 460, 430, 60));

        user.setBackground(new java.awt.Color(58, 131, 188));
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setBorder(null);
        user.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 300, 380, 30));

        pass.setBackground(new java.awt.Color(58, 131, 188));
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setBorder(null);
        pass.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 350, 40));

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mini.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, -1, -1));

        mini2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mini 2.png"))); // NOI18N
        mini2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mini2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mini2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mini2MouseExited(evt);
            }
        });
        getContentPane().add(mini2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, -1, -1));

        keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar.png"))); // NOI18N
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keluarMouseExited(evt);
            }
        });
        getContentPane().add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, -1, -1));

        keluar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/keluar 2.png"))); // NOI18N
        keluar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                keluar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                keluar2MouseExited(evt);
            }
        });
        getContentPane().add(keluar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/sepele.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
      xx = evt.getX();
      xy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
      x=evt.getXOnScreen();
      y=evt.getYOnScreen();
      this.setLocation(x - xx,y - xy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
      //show.setVisible(false);
      //hide.setVisible(true);
      //pass.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseClicked
      show.setVisible(true);
      hide.setVisible(false);
      pass.setEchoChar('•');
    }//GEN-LAST:event_hideMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        
    }//GEN-LAST:event_passActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String nama,password,query,passDB=null;
       String url,suser,spass;
       url="jdbc:mysql://localhost:3306/loket_tiket";
       suser="root";
       spass="";
       int tidak=0;
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
            com =DriverManager.getConnection(url,suser,spass);
            stm =(Statement)com.createStatement();
            
             if("".equals(user.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Masukan Username", "Error", JOptionPane.ERROR_MESSAGE);
            }else if("".equals(pass.getText())){
                JOptionPane.showMessageDialog(new JFrame(), "Masukan Password", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                nama=user.getText();
                password=passhash(pass.getText());
                
                query="SELECT * FROM login WHERE username=  '"+nama+"'";
                ResultSet ler=stm.executeQuery(query);
                while(ler.next()){
                    passDB=ler.getString("password");
                    tidak=1;
                    Admin adminFrame=new Admin();
                    HalamanUtama utamaFrame=new HalamanUtama();
                     if("Admin".equals(ler.getString("level"))){
                    utamaFrame.setVisible(false);
                    adminFrame.setVisible(true);
                    adminFrame.pack();
                    adminFrame.setLocationRelativeTo(null);
                    this.dispose();;
                }
                     else if("Pegawai".equals(ler.getString("level"))){
                    adminFrame.setVisible(false);
                    utamaFrame.setVisible(true);
                    utamaFrame.pack();
                    utamaFrame.setLocationRelativeTo(null);
                    this.dispose();;
                     }
                     else{
                    JOptionPane.showMessageDialog(new JFrame(), "Username dan Password Salah", "Error", JOptionPane.ERROR_MESSAGE);
                    }
          
                }
                        
                        
                //if(tidak==1 && password.equals(passDB)){
                   
                //}else{
                    //JOptionPane.showMessageDialog(new JFrame(), "Username dan Password Salah", "Error", JOptionPane.ERROR_MESSAGE);
                //}
                
                user.setText("");
                pass.setText("");
               
            }
       }catch(ClassNotFoundException | SQLException e){
           System.out.println("error"+e.getMessage());
       }
    }//GEN-LAST:event_loginActionPerformed

    private void keluar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluar2MouseClicked
        dispose();
    }//GEN-LAST:event_keluar2MouseClicked

    private void keluar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluar2MouseEntered
      keluar.setVisible(false);
      keluar2.setVisible(true);
      setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_keluar2MouseEntered

    private void keluar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluar2MouseExited
      keluar.setVisible(true);
      keluar2.setVisible(false);
      setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_keluar2MouseExited

    private void keluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseEntered
        keluar.setVisible(false);
      keluar2.setVisible(true);
       setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_keluarMouseEntered

    private void keluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseExited
        keluar.setVisible(true);
      keluar2.setVisible(false);
       setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_keluarMouseExited

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
      mini.setVisible(false);
      mini2.setVisible(true);
       setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
      mini.setVisible(true);
      mini2.setVisible(false);
      setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_miniMouseExited

    private void mini2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini2MouseEntered
         mini.setVisible(false);
      mini2.setVisible(true);
      setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_mini2MouseEntered

    private void mini2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini2MouseExited
        mini.setVisible(true);
      mini2.setVisible(false);
      setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mini2MouseExited

    private void mini2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini2MouseClicked
       this.setState(awal.ICONIFIED);
    }//GEN-LAST:event_mini2MouseClicked

    private void showMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_showMouseEntered

    private void showMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_showMouseExited

    private void hideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_hideMouseEntered

    private void hideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseExited
         setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_hideMouseExited

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        show.setVisible(false);
      hide.setVisible(true);
      pass.setEchoChar((char)0);
    }//GEN-LAST:event_showMouseClicked

     public static String passhash(String password){
        try {
            MessageDigest md=MessageDigest.getInstance("SHA");
            md.update(password.getBytes());
            byte[] rbt=md.digest();
            StringBuilder sb=new StringBuilder();
            for(byte b:rbt){
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
        }
         return null;
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new awal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gae;
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel keluar;
    private javax.swing.JLabel keluar2;
    private javax.swing.JButton login;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel mini2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel show;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
