/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mysql.jdbc.PreparedStatement;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author G0pS
 */
public class HomeScreen1 extends javax.swing.JFrame {

    /**
     * Creates new form HomeScreen
     */
  public static String uname="";
    
    public HomeScreen1(){
        
//         setLayout(new BorderLayout());
//	JLabel background1=new JLabel(new ImageIcon("./1.jpg"));
//        background1.setSize(1000, 1000);
//	add(background1);
//	background1.setLayout(new FlowLayout());
// </editor-fold>                        
          
        } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1366, 768));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        jLabel2.setText("Predictable Convergant Solutions");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 120, 397, 110);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Up2.png"))); // NOI18N
        jButton3.setActionCommand("upload");
        jButton3.setMaximumSize(new java.awt.Dimension(223, 43));
        jButton3.setMinimumSize(new java.awt.Dimension(223, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(80, 440, 160, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vi.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 300, 160, 30);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextPane1.setText("This site makes you very easy for anyone to submit short videos with attached documents to the tool so that others can search and find these lessons. \n\n - Usage is recorded and users are encouraged to review the materials and assess  the usefulness for others (quality, relevance, etc.) \n   \n - Searching is possible by \n  \n      1) key words, \n  \n      2) what kind of project the material is for, \n  \n      3) when in the project life cycle the material is relevant, etc. \n  \n - Sorting of returned results by user ranking of quality and relevance must  be supported.");
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(300, 290, 700, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 2, 1360, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     //   SimpleSwingBrowser.main(uname);
    //    upl.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        videos.main(uname);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] username) {
        /* Set the Nimbus look and feel */
           //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        System.out.println(uname+"------");
      String user=uname;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            // uname=username;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                    new HomeScreen1().setVisible(true);
                   
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
