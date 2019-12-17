/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.AmbilMatkul;
import backend.User;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sun.swing.ImageIconUIResource;

/**
 *
 * @author PC
 */
public class LihatKRS extends javax.swing.JFrame implements Session{

    /**
     * Creates new form LihatKRS
     */
    
    private User currentUser;
    private String[] semester;
    
    public LihatKRS() {
        initComponents();
        tampilSemester();
        krsTampilAwal();
    }
    
    public void setAtribute(User curUser){
        currentUser = curUser;
        String[] nama = currentUser.getNama().split(" ");
        labelNama.setText("Hello, " + nama[0]);
        labelNIM.setText(String.valueOf(currentUser.getNim()));
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

        btnKeluar = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        labelNama = new javax.swing.JLabel();
        labelNIM = new javax.swing.JLabel();
        btnProfile = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        labelPilihSmster = new javax.swing.JLabel();
        btnLihatKrs = new javax.swing.JLabel();
        btnAmbilKrs = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnKeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeluarMouseClicked(evt);
            }
        });
        getContentPane().add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 93, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setOpaque(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 650, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 650, 280));

        labelNama.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setText("Ananda Dwi Prayoga");
        getContentPane().add(labelNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 40, -1, -1));

        labelNIM.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        labelNIM.setForeground(new java.awt.Color(255, 255, 255));
        labelNIM.setText("1831710119");
        getContentPane().add(labelNIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 60, -1, -1));

        btnProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfileMouseClicked(evt);
            }
        });
        getContentPane().add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 36, 40, 40));

        btnHapus.setBackground(new java.awt.Color(209, 154, 46));
        btnHapus.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(785, 450, 93, 34));
        getContentPane().add(labelPilihSmster, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 315, 252));

        btnLihatKrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLihatKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLihatKrsMouseClicked(evt);
            }
        });
        getContentPane().add(btnLihatKrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 160, 100, 20));

        btnAmbilKrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAmbilKrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAmbilKrsMouseClicked(evt);
            }
        });
        getContentPane().add(btnAmbilKrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 195, 80, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/custom – 3.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeluarMouseClicked
        // TODO add your handling code here:
        doLogin();
    }//GEN-LAST:event_btnKeluarMouseClicked

    private void btnProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfileMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Home home = new Home();
        home.setHome(currentUser);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }//GEN-LAST:event_btnProfileMouseClicked

     private void tampilSemester(){
         
          String[] smtr =  {"Pilih Semester","Semester 1","Semester 2","Semester 3","Semester 4","Semester 5","Semester 6","Semester 7","Semester 8"};
          semester = smtr;
          jComboBox1.setModel(new DefaultComboBoxModel(semester));
     }
     
    public void krsTampilAwal(){
        //new javax.swing.ImageIcon(getClass().getResource("/org/me/myimageapp/newpackage/image.png")
        labelPilihSmster.setIcon(new ImageIcon(getClass().getResource("pilihSemester.png")));
        jScrollPane1.setVisible(false);
        btnHapus.setVisible(false);        
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        for(int i = 0; i < semester.length;i++){
            //untuk mennghandle jika yang dipilih combo pilih menu
            if(jComboBox1.getSelectedIndex() == 0){
                krsTampilAwal();
                return;
            }
            
            if (String.valueOf(jComboBox1.getSelectedItem()).equals(semester[i])) {
                AmbilMatkul  ambilMatkul = new AmbilMatkul(i,currentUser);
                if (ambilMatkul.getMatkulByUsrSmtr().isEmpty()) {
                    jScrollPane1.setVisible(false);
                    labelPilihSmster.setIcon(new ImageIcon(getClass().getResource("krskosong.png")));
                    btnHapus.setVisible(false);
                    return;
                }
                jScrollPane1.setVisible(true);
                btnHapus.setVisible(true);
                tampilkanTable(ambilMatkul.getMatkulByUsrSmtr());
                break;
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
//        System.out.println(jTable1.getSelectedRow());
        int row = jTable1.getSelectedRow();
        if ( row == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris terlebih dahulu");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        AmbilMatkul ambilMatkul = new AmbilMatkul();
        ambilMatkul.setUser(currentUser);
        ambilMatkul.setSemester(jComboBox1.getSelectedIndex());
        ambilMatkul.setId(Integer.parseInt(model.getValueAt(row, 0).toString()));
        ambilMatkul.deleteMatkulByUsrSmtr();
        tampilkanTable(ambilMatkul.getMatkulByUsrSmtr());
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnLihatKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLihatKrsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        lihatMatkul lihatMatkul1 = new lihatMatkul();
        lihatMatkul1.setAtribute(currentUser);
        lihatMatkul1.setLocationRelativeTo(null);
        lihatMatkul1.setVisible(true);
    }//GEN-LAST:event_btnLihatKrsMouseClicked

    private void btnAmbilKrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAmbilKrsMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        TampilAmbilMatkul ambilMatkul = new TampilAmbilMatkul();
        ambilMatkul.setAtribute(currentUser);
        ambilMatkul.setLocationRelativeTo(null);
        ambilMatkul.setVisible(true);
    }//GEN-LAST:event_btnAmbilKrsMouseClicked

     public void tampilkanTable(ArrayList<AmbilMatkul> list){
         String kolom[] = {"ID SKS", "Nama Mata Kuliah","Bobot SKS"};
         Object object[] = new Object[3];
         jTable1.setModel(new DefaultTableModel(new Object[][]{}, kolom));
         
         for(AmbilMatkul ambilMatkul : list){
             object[0] = ambilMatkul.getId();
             object[1] = ambilMatkul.getNamaMatkul();
             object[2] = ambilMatkul.getJumlahSks();
             
             ((DefaultTableModel)jTable1.getModel()).addRow(object);
         } 
         
     }
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
            java.util.logging.Logger.getLogger(LihatKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LihatKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LihatKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LihatKRS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LihatKRS lihatKRS = new LihatKRS();
                
                if(lihatKRS.isLogin()){
                    lihatKRS.doLogin();
                    return;
                }
                lihatKRS.setLocationRelativeTo(null);
                lihatKRS.setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel btnAmbilKrs;
    private javax.swing.JButton btnHapus;
    private javax.swing.JLabel btnKeluar;
    private javax.swing.JLabel btnLihatKrs;
    private javax.swing.JLabel btnProfile;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelNIM;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelPilihSmster;
    // End of variables declaration//GEN-END:variables
}
