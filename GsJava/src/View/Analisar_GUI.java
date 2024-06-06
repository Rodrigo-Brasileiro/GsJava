
package View;


public class Analisar_GUI extends javax.swing.JFrame {
    

    
    public Analisar_GUI() {
        initComponents();
        id1_lbl.setVisible(false);
        nome1_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        id2_lbl.setVisible(false);
        nome2_lbl.setVisible(false);
        email2_lbl.setVisible(false);
        id_txt.setVisible(false);
        nome_txt.setVisible(false);
        email_txt.setVisible(false);
        id2_txt.setVisible(false);
        nome2_txt.setVisible(false);
        email2_txt.setVisible(false);
        voltarGerente_btn.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo_lbl = new javax.swing.JLabel();
        amazonas_btn = new javax.swing.JButton();
        parana_btn = new javax.swing.JButton();
        nome2_lbl = new javax.swing.JLabel();
        email2_lbl = new javax.swing.JLabel();
        id2_lbl = new javax.swing.JLabel();
        nome1_lbl = new javax.swing.JLabel();
        email1_lbl = new javax.swing.JLabel();
        id1_lbl = new javax.swing.JLabel();
        voltarGerente_btn = new javax.swing.JButton();
        email2_txt = new javax.swing.JLabel();
        id_txt = new javax.swing.JLabel();
        nome_txt = new javax.swing.JLabel();
        email_txt = new javax.swing.JLabel();
        id2_txt = new javax.swing.JLabel();
        nome2_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(82, 148, 177));
        jPanel1.setLayout(null);

        titulo_lbl.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        titulo_lbl.setText("Tech Naut Rivers");
        jPanel1.add(titulo_lbl);
        titulo_lbl.setBounds(160, 0, 210, 34);

        amazonas_btn.setText("Rio Amazonas");
        amazonas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amazonas_btnActionPerformed(evt);
            }
        });
        jPanel1.add(amazonas_btn);
        amazonas_btn.setBounds(90, 70, 140, 23);

        parana_btn.setText("Rio Paraná");
        parana_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parana_btnActionPerformed(evt);
            }
        });
        jPanel1.add(parana_btn);
        parana_btn.setBounds(300, 70, 140, 23);

        nome2_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome2_lbl.setText("NOME:");
        jPanel1.add(nome2_lbl);
        nome2_lbl.setBounds(30, 250, 60, 30);

        email2_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email2_lbl.setText("E-MAIL: ");
        jPanel1.add(email2_lbl);
        email2_lbl.setBounds(30, 290, 60, 20);

        id2_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id2_lbl.setText("IDpesquisador:");
        jPanel1.add(id2_lbl);
        id2_lbl.setBounds(30, 220, 120, 20);

        nome1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome1_lbl.setText("NOME:");
        jPanel1.add(nome1_lbl);
        nome1_lbl.setBounds(30, 140, 60, 30);

        email1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email1_lbl.setText("E-MAIL: ");
        jPanel1.add(email1_lbl);
        email1_lbl.setBounds(30, 180, 60, 20);

        id1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id1_lbl.setText("IDpesquisador:");
        jPanel1.add(id1_lbl);
        id1_lbl.setBounds(30, 110, 120, 20);

        voltarGerente_btn.setText("VOLTAR");
        voltarGerente_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarGerente_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voltarGerente_btn);
        voltarGerente_btn.setBounds(0, 343, 90, 20);
        jPanel1.add(email2_txt);
        email2_txt.setBounds(160, 290, 220, 20);
        jPanel1.add(id_txt);
        id_txt.setBounds(170, 110, 200, 20);
        jPanel1.add(nome_txt);
        nome_txt.setBounds(160, 140, 220, 30);
        jPanel1.add(email_txt);
        email_txt.setBounds(160, 180, 220, 20);
        jPanel1.add(id2_txt);
        id2_txt.setBounds(160, 220, 220, 20);
        jPanel1.add(nome2_txt);
        nome2_txt.setBounds(160, 250, 220, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(525, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amazonas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amazonas_btnActionPerformed
        Model.FuncoesAnalisar.pesquisadoramazonas();
    }//GEN-LAST:event_amazonas_btnActionPerformed

    private void parana_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parana_btnActionPerformed
        Model.FuncoesAnalisar.pesquisadorparana();
    }//GEN-LAST:event_parana_btnActionPerformed

    private void voltarGerente_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarGerente_btnActionPerformed
        Model.FuncoesAnalisar.voltar(Analisar_GUI.this);
    }//GEN-LAST:event_voltarGerente_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Analisar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analisar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analisar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analisar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analisar_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton amazonas_btn;
    public static javax.swing.JLabel email1_lbl;
    public static javax.swing.JLabel email2_lbl;
    public static javax.swing.JLabel email2_txt;
    public static javax.swing.JLabel email_txt;
    public static javax.swing.JLabel id1_lbl;
    public static javax.swing.JLabel id2_lbl;
    public static javax.swing.JLabel id2_txt;
    public static javax.swing.JLabel id_txt;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel nome1_lbl;
    public static javax.swing.JLabel nome2_lbl;
    public static javax.swing.JLabel nome2_txt;
    public static javax.swing.JLabel nome_txt;
    public static javax.swing.JButton parana_btn;
    public static javax.swing.JLabel titulo_lbl;
    public static javax.swing.JButton voltarGerente_btn;
    // End of variables declaration//GEN-END:variables
}
