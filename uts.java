package uts;

import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iqbal
 */
public class uts extends javax.swing.JFrame {

    /**
     * Creates new form uts
     */
    public uts() {
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

        open = new javax.swing.JButton();
        openfile = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        open1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        op = new javax.swing.JTextField();
        cv2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        open.setLabel("open fie");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });

        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });

        jButton1.setText("convert doc");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        open1.setText("open file");
        open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("                    txt to doc");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("doc to txt");

        cv2.setText("convert txt");
        cv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(open))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(openfile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(cv2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(open1)
                                .addComponent(jButton1)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(openfile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(open)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(open1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cv2)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String readtxt() {
        String filepath = "D:\\balian.txt";
        BufferedReader br = null;
        String content = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
                sb.append(System.lineSeparator());

            }
            content = sb.toString();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {

            try {
                br.close();
            } catch (IOException e) {
            }
        }
        return content;
    }

    public static void writer(String a) {
        java.io.File newTextFile = new java.io.File("D:\\apa.doc");
        //String NewTextFile = null;
        try (FileWriter fwl = new FileWriter(newTextFile)) {
            fwl.write(a);
        } catch (IOException iox) {
        }
    }

    private static String readdoc() {

        String filepath = "D:\\apa.doc";
        BufferedReader br = null;
        String content = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                line = br.readLine();
                sb.append(System.lineSeparator());

            }
            content = sb.toString();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {

            try {
                br.close();
            } catch (IOException e) {
            }
        }
        return content;

//       File filenya = new File("D:\\apa1.doc");
//        WordExtractor extractor = null;
//        try {
//            FileInputStream fis = new FileInputStream(filenya.getAbsolutePath());
//            HWPFDocument document = new HWPFDocument(fis);
//            extractor = new WordExtractor(document);
//            String fileText = extractor.getText();
//            //System.out.println(fileText);
//        } catch (Exception exep) {
//            exep.printStackTrace();
//        }
//        
//        return null;
    }

    public static void writertxt(String a) {
        java.io.File newTextFile = new java.io.File("D:\\balian.txt");
        //String NewTextFile = null;
        try (FileWriter fwl = new FileWriter(newTextFile)) {
            fwl.write(a);
        } catch (IOException iox) {
        }
    }


    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        JFileChooser chooser = new JFileChooser("");
        File filenya;

        int buka_dialog = chooser.showOpenDialog(uts.this);

        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            openfile.setText(filenya.getPath());
            String file = filenya.getPath();
            readtxt();

        }
    }//GEN-LAST:event_openActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        writer(readtxt());
        System.out.println(readtxt());
        JOptionPane.showMessageDialog(this,"Convert Berhasil");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open1ActionPerformed
        JFileChooser chooser = new JFileChooser("");
        File filenya;

        int buka_dialog = chooser.showOpenDialog(uts.this);

        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            op.setText(filenya.getPath());
            String file = filenya.getPath();
            readdoc();

        }
    }//GEN-LAST:event_open1ActionPerformed

    private void cv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cv2ActionPerformed
        writertxt(readdoc());
        System.out.println(readdoc());
         JOptionPane.showMessageDialog(this,"Convert Berhasil");
    }//GEN-LAST:event_cv2ActionPerformed

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_openfileActionPerformed

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
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cv2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField op;
    private javax.swing.JButton open;
    private javax.swing.JButton open1;
    private javax.swing.JTextField openfile;
    // End of variables declaration//GEN-END:variables

}
