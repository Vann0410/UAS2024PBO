import com.mysql.cj.jdbc.PreparedStatementWrapper;
import java.sql.*;
import javax.swing.*;
import koneksi.koneksi;



import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class abid_laundry extends javax.swing.JFrame {
//    private Connection conn = koneksi.getkoneksi();
//    ResultSet rs = null;
//    PreparedStatement pst= null;
    /**
     * Creates new form abid_laundry
     */
    public abid_laundry() {
            
        initComponents();
    }
    private Connection conn = new koneksi().Connect();
    
    public int total_harga;
    public void reset(){
        combo_jenis.setSelectedItem("pilih jenis");
        txt_harga.setText("");
        txt_berat.setText("");
        txt_total.setText("");
        txt_bayar.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        combo_jenis = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_batal = new javax.swing.JButton();
        txt_bayar = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        txt_berat = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        btn_transaksi1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("        LAUNDRY BRAY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 290, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("bayar");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 60, 20));

        combo_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pilih jenis", "cuci basah", "cuci kering", "cuci setrika" }));
        combo_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisActionPerformed(evt);
            }
        });
        jPanel1.add(combo_jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 160, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("jenis cuci");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("harga");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("berat");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 60, 20));

        btn_batal.setText("batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 80, 50));
        jPanel1.add(txt_bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 160, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("total harga");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 90, 20));

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 160, 30));

        txt_berat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_beratActionPerformed(evt);
            }
        });
        jPanel1.add(txt_berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 160, 30));

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, 30));

        btn_transaksi1.setText("transaksi");
        btn_transaksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksi1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_transaksi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 510);

        setSize(new java.awt.Dimension(459, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        reset();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_transaksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksi1ActionPerformed
        String url = "insert into tb_laundry values(?,?,?,?,?)";
//            pst.setString(1, txt_harga.getText());
//            pst.setString(2, String.ValueOf(txt_berat.get()));
//            rs = pst.executeQuery();
//            if (rs.next()) {
//                JOptionPane.showMessageDialog(null,"koneksi berhasl");
//            }else
//                JOptionPane.showMessageDialog(null,"koneksi gagal");
        if(txt_harga.getText().isEmpty() ||txt_bayar.getText().isEmpty() || txt_total.getText().isEmpty() ||txt_bayar.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"data harus diisi bro");
        }else{
            int bayar = Integer.parseInt(txt_bayar.getText());
            int kembalian = bayar - total_harga;
            try{
                PreparedStatement stat = conn.prepareStatement(url);
            stat.setString(1, String.valueOf(combo_jenis.getSelectedItem()));
            stat.setString(2, txt_harga.getText());
            stat.setString(3, txt_berat.getText());
            stat.setString(4, txt_total.getText());
            stat.setString(5, txt_bayar.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,"kembaliannya segini bro :\n"+kembalian);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"transaksi gagal" +e);
            
        }
            reset();
        }
    }//GEN-LAST:event_btn_transaksi1ActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void txt_beratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_beratActionPerformed
        if(txt_berat.getText().equals("")){
            txt_total.setText("0");
        }else{
            int harga = Integer.parseInt(txt_harga.getText());
            int berat = Integer.parseInt(txt_berat.getText());
            total_harga = harga*berat;
            txt_total.setText(String.valueOf(total_harga));
        }
    }//GEN-LAST:event_txt_beratActionPerformed

    private void combo_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jenisActionPerformed
        if(combo_jenis.getSelectedItem().equals("pilih jenis")){
            txt_harga.setText("0");
        }else if(combo_jenis.getSelectedItem().equals("cuci basah")){
            txt_harga.setText("10000");
        }else if(combo_jenis.getSelectedItem().equals("cuci kering")){
            txt_harga.setText("20000");
        }else if(combo_jenis.getSelectedItem().equals("cuci setrika")){
            txt_harga.setText("30000");
        }
    }//GEN-LAST:event_combo_jenisActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

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
            java.util.logging.Logger.getLogger(abid_laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abid_laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abid_laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abid_laundry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abid_laundry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_transaksi1;
    private javax.swing.JComboBox<String> combo_jenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_berat;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
