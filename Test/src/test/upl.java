/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Gopi
 */
public class upl extends javax.swing.JFrame {

    /**
     * Creates new form upl
     */
    URL mediaURL = null;
    public static String uname="";
    public upl() {
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

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1399, 768));
        getContentPane().setLayout(null);

        jLabel2.setText("File Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 280, 80, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(530, 270, 200, 30);

        jLabel5.setText("Description");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 53, 14);

        jLabel3.setText("Description");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 53, 14);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 320, 200, 96);

        jLabel4.setText("Description:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 360, 70, 30);

        jLabel6.setText("Tags:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 460, 60, 14);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(530, 450, 200, 30);

        jButton1.setText("attach file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 520, 110, 23);

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 570, 47, 23);

        jLabel7.setText("Seperate tags with commas(,)");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 414, 200, 30);

        jLabel8.setText("Select only .mp4 files");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 494, 190, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/a.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(1399, 768));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -46, 1440, 860);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         JFileChooser filechooser = new JFileChooser();
        int result = filechooser.showOpenDialog(this);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            mediaURL = null;
             try {
                 mediaURL = filechooser.getSelectedFile().toURL();
             } catch (MalformedURLException ex) {
                 Logger.getLogger(upl.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("VideoFileName::--->"+jTextField1.getText());
        System.out.println("Video Description::--->"+jTextArea1.getText());
        System.out.println("VideoTags::--->"+jTextField3.getText());
        String file=mediaURL.toString();
        file=file.substring(6);
        System.out.println("File Path--->"+file);
        System.out.println("File type--->"+file.substring(file.length()-4));
        String extension=file.substring(file.length()-4);
        System.out.println("Extension--"+extension);
        if(extension.equals(".mp4")){
        try{
            System.out.println(".mp4");
		    FileOutputStream f=new FileOutputStream("D:/pcs/Files/"+jTextField1.getText()+".txt");

		    PrintStream p=new PrintStream(f);
                    p.println("VideoName-"+jTextField1.getText());
                    p.println("Descrition-"+jTextArea1.getText());
                    p.println("Tags-"+jTextField3.getText());
                    p.close();
		  }
		  catch(Exception e){}
        String[] paths={jTextField1.getText(),"D:/pcs/Files/"+jTextField1.getText()+".txt",file};
       ZipFiles.main(paths);
        try {
            try {
                FileCopy.main(file,jTextField1.getText().toString(),jTextArea1.getText(),jTextField3.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(upl.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(upl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(upl.class.getName()).log(Level.SEVERE, null, ex);
        }
        popup.main("Video uploaded Successfully");
        this.setVisible(false);
       // Home.main(uname);
        }
        else{
            System.out.println("Extension not mp4");
            this.setVisible(false);
            UploadError.main(uname);
           // upl.main(uname);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String username) {
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
            java.util.logging.Logger.getLogger(upl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(upl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(upl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(upl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        uname=username;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new upl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}