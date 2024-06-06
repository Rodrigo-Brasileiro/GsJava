
package View;


public class Cadastrar_GUI extends javax.swing.JFrame {

    
    public Cadastrar_GUI() {
        initComponents();
        verifica_lbl.setVisible(false);
        nome1_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        senha1_lbl.setVisible(false);
        amazonas_btn.setVisible(true);
        parana_btn.setVisible(true);
        nome2_txt.setVisible(false);
        email2_txt.setVisible(false);
        senha2_txt.setVisible(false);
        vaga_lbl.setVisible(false);
        cadastrarparana_btn.setVisible(false);
        cadastraramazonas_btn.setVisible(false);
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
        titulo_lbl = new javax.swing.JLabel();
        nome1_lbl = new javax.swing.JLabel();
        email1_lbl = new javax.swing.JLabel();
        senha1_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        amazonas_btn = new javax.swing.JButton();
        parana_btn = new javax.swing.JButton();
        voltarGerente_btn = new javax.swing.JButton();
        cadastrarparana_btn = new javax.swing.JButton();
        verifica_lbl = new javax.swing.JLabel();
        senha2_txt = new javax.swing.JTextField();
        nome2_txt = new javax.swing.JTextField();
        email2_txt = new javax.swing.JTextField();
        vaga_lbl = new javax.swing.JLabel();
        cadastraramazonas_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(82, 148, 177));
        jPanel1.setLayout(null);

        titulo_lbl.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        titulo_lbl.setText("Tech Naut Rivers");
        jPanel1.add(titulo_lbl);
        titulo_lbl.setBounds(160, 0, 210, 34);

        nome1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nome1_lbl.setText("NOME:");
        jPanel1.add(nome1_lbl);
        nome1_lbl.setBounds(60, 160, 60, 30);

        email1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        email1_lbl.setText("E-MAIL: ");
        jPanel1.add(email1_lbl);
        email1_lbl.setBounds(50, 200, 60, 20);

        senha1_lbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        senha1_lbl.setText("SENHA:");
        jPanel1.add(senha1_lbl);
        senha1_lbl.setBounds(50, 240, 50, 30);

        jLabel2.setText("Local onde o pesquisador será associado:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(160, 40, 240, 14);

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

        voltarGerente_btn.setText("VOLTAR");
        voltarGerente_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarGerente_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voltarGerente_btn);
        voltarGerente_btn.setBounds(0, 343, 90, 20);

        cadastrarparana_btn.setText("CADASTRAR");
        cadastrarparana_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarparana_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrarparana_btn);
        cadastrarparana_btn.setBounds(410, 340, 120, 20);
        jPanel1.add(verifica_lbl);
        verifica_lbl.setBounds(150, 110, 210, 30);
        jPanel1.add(senha2_txt);
        senha2_txt.setBounds(110, 240, 250, 30);
        jPanel1.add(nome2_txt);
        nome2_txt.setBounds(110, 160, 250, 30);
        jPanel1.add(email2_txt);
        email2_txt.setBounds(110, 200, 250, 30);
        jPanel1.add(vaga_lbl);
        vaga_lbl.setBounds(170, 160, 190, 30);

        cadastraramazonas_btn.setText("CADASTRAR");
        cadastraramazonas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastraramazonas_btnActionPerformed(evt);
            }
        });
        jPanel1.add(cadastraramazonas_btn);
        cadastraramazonas_btn.setBounds(410, 340, 120, 20);

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

    private void voltarGerente_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarGerente_btnActionPerformed
        Model.FucoesCadastrar_DAO.voltarGerente(Cadastrar_GUI.this);
    }//GEN-LAST:event_voltarGerente_btnActionPerformed

    private void amazonas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amazonas_btnActionPerformed
        Model.FucoesCadastrar_DAO.amazonas();
    }//GEN-LAST:event_amazonas_btnActionPerformed

    private void parana_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parana_btnActionPerformed
        Model.FucoesCadastrar_DAO.parana();
    }//GEN-LAST:event_parana_btnActionPerformed

    private void cadastraramazonas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastraramazonas_btnActionPerformed
        Model.FucoesCadastrar_DAO.cadastraramazonas();
    }//GEN-LAST:event_cadastraramazonas_btnActionPerformed

    private void cadastrarparana_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarparana_btnActionPerformed
        Model.FucoesCadastrar_DAO.cadastrarparana();
    }//GEN-LAST:event_cadastrarparana_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton amazonas_btn;
    public static javax.swing.JButton cadastraramazonas_btn;
    public static javax.swing.JButton cadastrarparana_btn;
    public static javax.swing.JLabel email1_lbl;
    public static javax.swing.JTextField email2_txt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel nome1_lbl;
    public static javax.swing.JTextField nome2_txt;
    public static javax.swing.JButton parana_btn;
    public static javax.swing.JLabel senha1_lbl;
    public static javax.swing.JTextField senha2_txt;
    public static javax.swing.JLabel titulo_lbl;
    public static javax.swing.JLabel vaga_lbl;
    public static javax.swing.JLabel verifica_lbl;
    private javax.swing.JButton voltarGerente_btn;
    // End of variables declaration//GEN-END:variables
}
