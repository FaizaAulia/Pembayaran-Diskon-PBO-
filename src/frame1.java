/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Moklet
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hbsatu = new javax.swing.JTextField();
        hbdua = new javax.swing.JTextField();
        hbtiga = new javax.swing.JTextField();
        diskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        hbempat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        proses = new javax.swing.JButton();
        proses1 = new javax.swing.JButton();
        proses2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pembayaran");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 20, 130, 17);

        jLabel2.setText("Diskon");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 290, 100, 14);

        jLabel3.setText("Harga Barang 1");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 100, 14);

        jLabel4.setText("Harga Barang 2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 130, 100, 14);

        jLabel5.setText("Harga Barang 3");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 190, 100, 14);
        getContentPane().add(hbsatu);
        hbsatu.setBounds(170, 60, 170, 30);
        getContentPane().add(hbdua);
        hbdua.setBounds(170, 120, 170, 30);
        getContentPane().add(hbtiga);
        hbtiga.setBounds(170, 180, 170, 30);
        getContentPane().add(diskon);
        diskon.setBounds(150, 280, 60, 30);

        jLabel6.setText("Harga Barang 4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 250, 100, 14);
        getContentPane().add(hbempat);
        hbempat.setBounds(170, 240, 170, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("%");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(220, 280, 40, 30);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 360, 280, 130);

        proses.setText("HAPUS");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(140, 320, 80, 23);

        proses1.setText("PROSES");
        proses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proses1ActionPerformed(evt);
            }
        });
        getContentPane().add(proses1);
        proses1.setBounds(40, 320, 90, 23);

        proses2.setText("TUTUP");
        proses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proses2ActionPerformed(evt);
            }
        });
        getContentPane().add(proses2);
        proses2.setBounds(240, 320, 80, 23);

        jLabel8.setText("Rp.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 250, 20, 14);

        jLabel9.setText("Rp.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 70, 20, 14);

        jLabel10.setText("Rp.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(150, 130, 20, 14);

        jLabel11.setText("Rp.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(150, 190, 20, 14);

        setBounds(0, 0, 394, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void proses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proses2ActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_proses2ActionPerformed

    private void proses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proses1ActionPerformed
        double satu = Double.parseDouble(hbsatu.getText().toString());
        double dua = Double.parseDouble(hbdua.getText().toString());
        double tiga = Double.parseDouble(hbtiga.getText().toString());
        double empat = Double.parseDouble(hbempat.getText().toString());
        double potong = Double.parseDouble(diskon.getText().toString());
        double tharga = satu + dua + tiga + empat;
        double dis = potong / 100 * tharga;
        double bayar = tharga - dis;
        
        hasil.setText("Harga Barang 1   : Rp." + satu +"\n"+ "Harga Barang 2   : Rp." + dua +
                "\n" + "Harga Barang 3   : Rp." + tiga +"\n"+ "Harga Barang 4   : Rp." + empat +
                "\n" + "Total Harga   : " + tharga +"\n"+ "Diskon    : " + potong +" %"+"\n"+ 
                "Total Bayar    : Rp. " + bayar);
        // TODO add your handling code here:
    }//GEN-LAST:event_proses1ActionPerformed

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        hbsatu.setText("");
        hbdua.setText("");
        hbtiga.setText("");
        hbempat.setText("");
        diskon.setText("");
        hasil.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diskon;
    private javax.swing.JTextArea hasil;
    private javax.swing.JTextField hbdua;
    private javax.swing.JTextField hbempat;
    private javax.swing.JTextField hbsatu;
    private javax.swing.JTextField hbtiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proses;
    private javax.swing.JButton proses1;
    private javax.swing.JButton proses2;
    // End of variables declaration//GEN-END:variables
}
