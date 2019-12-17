/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.User;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author PC
 */
public class Home extends javax.swing.JFrame implements Session{

    private User currentUser;
    private boolean password = false;
    private boolean passwordRepeat = false;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    
    public void setHome(User user){
        currentUser = user;
        String[] nama = currentUser.getNama().split(" ");
        labelNama.setText("Hello, " + nama[0]);
        labelNIM.setText(String.valueOf(currentUser.getNim()));
        labelNIMProfile.setText(String.valueOf(currentUser.getNim()));
        inputNamaProfile.setText(currentUser.getNama());
        inputAlamat.setText(currentUser.getAlamat());
        inputPassword.setText(currentUser.getPassword());
        inputPasswordUlang.setText(currentUser.getPassword());
    }
    
    public boolean isLogin(){
       return ( currentUser == null );
    }
    
    public void doLogin(){
        this.setVisible(false);
        Login login = new Login();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        btnLogout = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelNIMProfile = new javax.swing.JLabel();
        inputNamaProfile = new javax.swing.JTextField();
        inputAlamat = new javax.swing.JTextField();
        btnUbah = new javax.swing.JLabel();
        inputPasswordUlang = new javax.swing.JPasswordField();
        inputPassword = new javax.swing.JPasswordField();
        buttonSeePasswordAgain = new javax.swing.JLabel();
        buttonSeePassword = new javax.swing.JLabel();
        labelNotice = new javax.swing.JLabel();
        btnLihatKrs = new javax.swing.JLabel();
        btnAmbilKrs = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JLabel();
        btnLihatMatkul1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelNIM.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        labelNIM.setForeground(new java.awt.Color(255, 255, 255));
        labelNIM.setText("1831710119");
        getContentPane().add(labelNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 60, -1, -1));

        labelNama.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Ananda Dwi Prayoga");
        getContentPane().add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 40, -1, -1));

        labelNIMProfile.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        labelNIMProfile.setForeground(new java.awt.Color(105, 105, 105));
        labelNIMProfile.setText("1831710119");
        getContentPane().add(labelNIMProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 210, 200, 25));

        inputNamaProfile.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        inputNamaProfile.setText("Ananda Dwi Prayoga");
        inputNamaProfile.setBorder(null);
        inputNamaProfile.setOpaque(false);
        inputNamaProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaProfileActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 250, 200, 25));

        inputAlamat.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        inputAlamat.setText("Dusun Demangan Rt 02 Rw 03");
        inputAlamat.setBorder(null);
        inputAlamat.setOpaque(false);
        getContentPane().add(inputAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 293, 200, 25));

        btnUbah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUbahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUbahMouseEntered(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 425, 194, 34));

        inputPasswordUlang.setText("jPasswordField1");
        inputPasswordUlang.setBorder(null);
        inputPasswordUlang.setOpaque(false);
        inputPasswordUlang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordUlangActionPerformed(evt);
            }
        });
        getContentPane().add(inputPasswordUlang, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 376, 180, 25));

        inputPassword.setText("jPasswordField1");
        inputPassword.setBorder(null);
        inputPassword.setOpaque(false);
        getContentPane().add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 336, 180, 25));

        buttonSeePasswordAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSeePasswordAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSeePasswordAgainMouseClicked(evt);
            }
        });
        getContentPane().add(buttonSeePasswordAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 376, 21, 21));

        buttonSeePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSeePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSeePasswordMouseClicked(evt);
            }
        });
        getContentPane().add(buttonSeePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 333, 21, 21));

        labelNotice.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        labelNotice.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(labelNotice, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 188, 200, 20));

        btnLihatKrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihatKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLihatKrsMouseClicked(evt);
            }
        });
        getContentPane().add(btnLihatKrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 126, 80, 20));

        btnAmbilKrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmbilKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAmbilKrsMouseClicked(evt);
            }
        });
        getContentPane().add(btnAmbilKrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 195, 80, 20));

        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 93, 34));

        btnLihatMatkul1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihatMatkul1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLihatMatkul1MouseClicked(evt);
            }
        });
        getContentPane().add(btnLihatMatkul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 100, 20));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/custom – 4.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaProfileActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        doLogin();
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void inputPasswordUlangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordUlangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordUlangActionPerformed

    private void buttonSeePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeePasswordMouseClicked
        // TODO add your handling code here:
        //to handle when user password is empty
        if(currentUser.getPassword() == null) currentUser.setPassword("Login First");
        
        //retrive password
        String strPassword = getPasswordString(inputPassword);
        
        if (!password) {
            //menampilkan password 
            inputPassword.setEchoChar((char)0);
            inputPassword.setText(strPassword);
            password = true;
            return;
        }else{
            //untuk mengembalikan ke mode password
            inputPassword.setEchoChar('*');
            inputPassword.setText(strPassword);
            password = false;
        }
        
        
    }//GEN-LAST:event_buttonSeePasswordMouseClicked
    
    public String getPasswordString(JPasswordField jPasswordField){
        char[] textPassword = jPasswordField.getPassword();
        return new String(textPassword);
    }
    private void buttonSeePasswordAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSeePasswordAgainMouseClicked
        // TODO add your handling code here:
        String strPassword = getPasswordString(inputPasswordUlang);
        
         //to handle when user password is empty
        if(currentUser.getPassword() == null) currentUser.setPassword("Login First");
        if(!passwordRepeat){
            inputPasswordUlang.setEchoChar((char)0);
            inputPasswordUlang.setText(strPassword);
            passwordRepeat = true;
            return;
        }else{
            inputPasswordUlang.setEchoChar('*');
            inputPasswordUlang.setText(strPassword);
            passwordRepeat = false;
        }
    }//GEN-LAST:event_buttonSeePasswordAgainMouseClicked

    private void btnUbahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnUbahMouseEntered

    private void btnUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUbahMouseClicked
        // TODO add your handling code here:
        if (!getPasswordString(inputPassword).equals(getPasswordString(inputPasswordUlang))) {
            labelNotice.setText("Input Password harus sama");
            return;
        }
        
        labelNotice.setText("");
        currentUser.setNama(inputNamaProfile.getText());
        currentUser.setAlamat(inputAlamat.getText());
        currentUser.setPassword(getPasswordString(inputPassword));
        currentUser.ubah();
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
        setHome(currentUser);
    }//GEN-LAST:event_btnUbahMouseClicked

    private void btnLihatKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatKrsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        LihatKRS lihatKRS = new LihatKRS();
        lihatKRS.setAtribute(currentUser);
        lihatKRS.setLocationRelativeTo(null);
        lihatKRS.setVisible(true);
    }//GEN-LAST:event_btnLihatKrsMouseClicked

    private void btnAmbilKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmbilKrsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        TampilAmbilMatkul ambilMatkul = new TampilAmbilMatkul();
        ambilMatkul.setAtribute(currentUser);
        ambilMatkul.setLocationRelativeTo(null);
        ambilMatkul.setVisible(true);
    }//GEN-LAST:event_btnAmbilKrsMouseClicked

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        // TODO add your handling code here:
        doLogin();
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnLihatMatkul1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatMatkul1MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        lihatMatkul lihatMatkul1 = new lihatMatkul();
        lihatMatkul1.setAtribute(currentUser);
        lihatMatkul1.setLocationRelativeTo(null);
        lihatMatkul1.setVisible(true);
    }//GEN-LAST:event_btnLihatMatkul1MouseClicked


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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Home home = new Home();
                
                //check current
                if(home.isLogin()){
                    home.doLogin();
                    return;
                }
                home.setLocationRelativeTo(null);
                home.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel btnAmbilKrs;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnLihatKrs;
    private javax.swing.JLabel btnLihatMatkul1;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel btnUbah;
    private javax.swing.JLabel buttonSeePassword;
    private javax.swing.JLabel buttonSeePasswordAgain;
    private javax.swing.JTextField inputAlamat;
    private javax.swing.JTextField inputNamaProfile;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JPasswordField inputPasswordUlang;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNIMProfile;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNotice;
    // End of variables declaration//GEN-END:variables
}
