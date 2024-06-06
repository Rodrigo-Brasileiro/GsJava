
package View;


public class Inicio_GUI extends javax.swing.JFrame {


    public Inicio_GUI() {
        initComponents();
        titulo_lbl.setVisible(true);
        subtitulo_lbl.setVisible(true);
        subtitulo2_lbl.setVisible(true);
        email_txt.setVisible(true);
        senha_txt.setVisible(true);
        email_lbl.setVisible(true);
        senha_lbl.setVisible(true);
        titulo_lbl.setVisible(true);
        subtitulo_lbl.setVisible(true);
        sair_btn.setVisible(true);
        logar_btn.setVisible(true);
        esqueceu_btn.setVisible(true);
        sair_btn.setVisible(true);
        voltar_btn.setVisible(false);
        enviar_btn.setVisible(false);
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titulo_lbl = new javax.swing.JLabel();
        subtitulo_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        senha_lbl = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        senha_txt = new javax.swing.JTextField();
        subtitulo2_lbl = new javax.swing.JLabel();
        sair_btn = new javax.swing.JButton();
        logar_btn = new javax.swing.JButton();
        esqueceu_btn = new javax.swing.JButton();
        enviar_btn = new javax.swing.JButton();
        voltar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(82, 148, 177));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoGsJava.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-20, 10, 140, 120);

        titulo_lbl.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        titulo_lbl.setText("Tech Naut Rivers");
        jPanel1.add(titulo_lbl);
        titulo_lbl.setBounds(190, 10, 210, 34);

        subtitulo_lbl.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        subtitulo_lbl.setText("Navegando rumo a oceanos mais limpos.");
        jPanel1.add(subtitulo_lbl);
        subtitulo_lbl.setBounds(190, 60, 200, 14);

        email_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email_lbl.setText("E-mail:");
        jPanel1.add(email_lbl);
        email_lbl.setBounds(140, 160, 50, 30);

        senha_lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        senha_lbl.setText("Senha:");
        jPanel1.add(senha_lbl);
        senha_lbl.setBounds(140, 210, 60, 20);

        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        jPanel1.add(email_txt);
        email_txt.setBounds(190, 160, 210, 30);

        senha_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_txtActionPerformed(evt);
            }
        });
        jPanel1.add(senha_txt);
        senha_txt.setBounds(190, 210, 210, 30);

        subtitulo2_lbl.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        subtitulo2_lbl.setText("Plataforma para Pesquisadores e Gerentes de projeto");
        jPanel1.add(subtitulo2_lbl);
        subtitulo2_lbl.setBounds(140, 100, 310, 40);

        sair_btn.setText("SAIR");
        sair_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_btnActionPerformed(evt);
            }
        });
        jPanel1.add(sair_btn);
        sair_btn.setBounds(450, 340, 80, 23);

        logar_btn.setText("Logar");
        logar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(logar_btn);
        logar_btn.setBounds(320, 250, 80, 23);

        esqueceu_btn.setText("Esqueceu a senha");
        esqueceu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esqueceu_btnActionPerformed(evt);
            }
        });
        jPanel1.add(esqueceu_btn);
        esqueceu_btn.setBounds(170, 250, 140, 23);

        enviar_btn.setText("Enviar");
        enviar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(enviar_btn);
        enviar_btn.setBounds(400, 160, 90, 30);

        voltar_btn.setText("VOLTAR");
        voltar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar_btnActionPerformed(evt);
            }
        });
        jPanel1.add(voltar_btn);
        voltar_btn.setBounds(360, 340, 90, 23);

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

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        
    }//GEN-LAST:event_email_txtActionPerformed

    private void sair_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_btnActionPerformed
        Model.FuncoesInicio_DAO.fechar();
    }//GEN-LAST:event_sair_btnActionPerformed

    private void senha_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_txtActionPerformed

    private void logar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logar_btnActionPerformed
       Model.FuncoesInicio_DAO.pesquisador(Inicio_GUI.this);
    }//GEN-LAST:event_logar_btnActionPerformed

    private void esqueceu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esqueceu_btnActionPerformed
        Model.FuncoesInicio_DAO.esqueceu();
    }//GEN-LAST:event_esqueceu_btnActionPerformed

    private void voltar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar_btnActionPerformed
        Model.FuncoesInicio_DAO.voltar();
    }//GEN-LAST:event_voltar_btnActionPerformed

    private void enviar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_btnActionPerformed
        Model.FuncoesInicio_DAO.enviar();
    }//GEN-LAST:event_enviar_btnActionPerformed

 
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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel email_lbl;
    public static javax.swing.JTextField email_txt;
    public static javax.swing.JButton enviar_btn;
    public static javax.swing.JButton esqueceu_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JButton logar_btn;
    public static javax.swing.JButton sair_btn;
    public static javax.swing.JLabel senha_lbl;
    public static javax.swing.JTextField senha_txt;
    public static javax.swing.JLabel subtitulo2_lbl;
    public static javax.swing.JLabel subtitulo_lbl;
    public static javax.swing.JLabel titulo_lbl;
    public static javax.swing.JButton voltar_btn;
    // End of variables declaration//GEN-END:variables
}
