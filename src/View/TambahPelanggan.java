/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author DHAFINDRA
 */
public class TambahPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form TambahPelanggan
     */
    public TambahPelanggan() {
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

        groupKelamin = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LabelTambahDataPelanggan2 = new javax.swing.JLabel();
        LabelNama2 = new javax.swing.JLabel();
        LabelAlamat2 = new javax.swing.JLabel();
        LabelnoTelp2 = new javax.swing.JLabel();
        LabelKelamin2 = new javax.swing.JLabel();
        buttonCowo = new javax.swing.JRadioButton();
        buttonCewe = new javax.swing.JRadioButton();
        TextFieldnoTelp = new javax.swing.JTextField();
        TextFieldAlamat = new javax.swing.JTextField();
        TextFieldNama = new javax.swing.JTextField();
        buttonSimpan2 = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel4.setBackground(new java.awt.Color(23, 23, 23));

        LabelTambahDataPelanggan2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        LabelTambahDataPelanggan2.setForeground(new java.awt.Color(255, 255, 255));
        LabelTambahDataPelanggan2.setText("Tambah Data Pelanggan");

        LabelNama2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelNama2.setForeground(new java.awt.Color(255, 255, 255));
        LabelNama2.setText("Nama");

        LabelAlamat2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelAlamat2.setForeground(new java.awt.Color(255, 255, 255));
        LabelAlamat2.setText("Alamat");

        LabelnoTelp2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelnoTelp2.setForeground(new java.awt.Color(255, 255, 255));
        LabelnoTelp2.setText("no. Telp");

        LabelKelamin2.setFont(new java.awt.Font("Yu Gothic UI", 0, 11)); // NOI18N
        LabelKelamin2.setForeground(new java.awt.Color(255, 255, 255));
        LabelKelamin2.setText("Jenis Kelamin");

        buttonCowo.setBackground(new java.awt.Color(23, 23, 23));
        groupKelamin.add(buttonCowo);
        buttonCowo.setForeground(new java.awt.Color(255, 255, 255));
        buttonCowo.setText("Laki-Laki");

        buttonCewe.setBackground(new java.awt.Color(23, 23, 23));
        groupKelamin.add(buttonCewe);
        buttonCewe.setForeground(new java.awt.Color(255, 255, 255));
        buttonCewe.setText("Perempuan");

        TextFieldnoTelp.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldnoTelp.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldnoTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldnoTelpActionPerformed(evt);
            }
        });

        TextFieldAlamat.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldAlamat.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAlamatActionPerformed(evt);
            }
        });

        TextFieldNama.setBackground(new java.awt.Color(0, 0, 0));
        TextFieldNama.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaActionPerformed(evt);
            }
        });

        buttonSimpan2.setBackground(new java.awt.Color(48, 48, 48));
        buttonSimpan2.setForeground(new java.awt.Color(255, 255, 255));
        buttonSimpan2.setText("Simpan");
        buttonSimpan2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonSimpan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpan2ActionPerformed(evt);
            }
        });

        buttonKembali.setBackground(new java.awt.Color(48, 48, 48));
        buttonKembali.setForeground(new java.awt.Color(255, 255, 255));
        buttonKembali.setText("Kembali");
        buttonKembali.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNama2)
                            .addComponent(LabelAlamat2)
                            .addComponent(LabelnoTelp2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNama, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(TextFieldnoTelp)
                            .addComponent(TextFieldAlamat)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTambahDataPelanggan2)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(LabelKelamin2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonCowo)
                                    .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonSimpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonCewe))))
                        .addGap(0, 82, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTambahDataPelanggan2)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNama2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelAlamat2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldnoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelnoTelp2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelKelamin2)
                    .addComponent(buttonCowo)
                    .addComponent(buttonCewe))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldnoTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldnoTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldnoTelpActionPerformed

    private void TextFieldAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAlamatActionPerformed

    private void TextFieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        // TODO add your handling code here:
        Home H = new Home();
        setVisible(false);
        H.setVisible(true);
    }//GEN-LAST:event_buttonKembaliActionPerformed

    private void buttonSimpan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpan2ActionPerformed
        // TODO add your handling code here:
        String namaPelanggan = TextFieldNama.getText();
        String alamatPelanggan = TextFieldAlamat.getText();
        String notelpPelanggan = TextFieldnoTelp.getText();
        
        String jeniskelamin;
        if (groupKelamin.getSelection().equals(buttonCowo.getModel())) {
            jeniskelamin = "Laki-Laki";
        } else if (groupKelamin.getSelection().equals(buttonCewe.getModel())) {
            jeniskelamin = "Perempuan";
        }
    }//GEN-LAST:event_buttonSimpan2ActionPerformed

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
            java.util.logging.Logger.getLogger(TambahPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAlamat2;
    private javax.swing.JLabel LabelKelamin2;
    private javax.swing.JLabel LabelNama2;
    private javax.swing.JLabel LabelTambahDataPelanggan2;
    private javax.swing.JLabel LabelnoTelp2;
    private javax.swing.JTextField TextFieldAlamat;
    private javax.swing.JTextField TextFieldNama;
    private javax.swing.JTextField TextFieldnoTelp;
    private javax.swing.JRadioButton buttonCewe;
    private javax.swing.JRadioButton buttonCowo;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonSimpan2;
    private javax.swing.ButtonGroup groupKelamin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
