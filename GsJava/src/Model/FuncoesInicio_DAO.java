package Model;

import View.Gerente_GUI;
import View.Inicio_GUI;
import static View.Inicio_GUI.email_lbl;
import static View.Inicio_GUI.email_txt;
import static View.Inicio_GUI.enviar_btn;
import static View.Inicio_GUI.esqueceu_btn;
import static View.Inicio_GUI.logar_btn;
import static View.Inicio_GUI.sair_btn;
import static View.Inicio_GUI.senha_lbl;
import static View.Inicio_GUI.senha_txt;
import static View.Inicio_GUI.subtitulo2_lbl;
import static View.Inicio_GUI.subtitulo_lbl;
import static View.Inicio_GUI.titulo_lbl;
import static View.Inicio_GUI.voltar_btn;
import View.Pesquisador_GUI;
import javax.swing.JOptionPane;


public class FuncoesInicio_DAO {
    public static String [] usuarios = {"Rodrigo Brasileiro","","",""}; // variavel responsável por identificar o id do usuário
    public static String [] emails = {"pesquisador@fiap.com", "", "", ""};
    public static String [] locais = {"Estação do rio amazonas","", "", ""};
    public static String [] senhas = {"1234","","",""};
    
    public static String [] pesquisador_amazonas = {"pesquisador@fiap.com", ""}; // antes era usuarios o nome da variavel
    public static String [] masenhas = {"1234", ""};
    
    public static String [] pesquisador_parana = {"", ""}; // antes era usuarios o nome da variavel
    public static String [] pasenhas = {"", "" };
    
    public static String [] gerentes = {"gerente@fiap.com", ""};
    public static String [] gsenhas = {"1234", ""};
    
    public static String [] nome_pesquisadores_amazonas = {"Rodrigo Brasileiro", ""};
    public static String [] nome_pesquisadores_parana = {"",""};
    public static int numero;
        
    
    
    
    public static void fechar(){
        String x = JOptionPane.showInputDialog(null,"Deseja mesmo sair?  \n 1 - Sim  \n 2 - Voltar");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
               System.exit(0);
        }else{
               JOptionPane.showMessageDialog(null,"Voltando para o sistema");
       }
    }
    
    public static void pesquisador(Inicio_GUI menuFrame){ // arrumar para verificar por pesquisador amazonas e pesquisador parana
        String xemail = View.Inicio_GUI.email_txt.getText();
        String xsenha = View.Inicio_GUI.senha_txt.getText();
        
        boolean usuarioEncontrado = false;
        
        
        
        for (int i = 0; i < emails.length; i++) { 
            if (!emails[i].isEmpty() && !senhas[i].isEmpty()) { // Verifica se a posição do vetor está preenchida
                if (emails[i].equals(xemail) && senhas[i].equals(xsenha)) {
                    numero = i;
                    usuarioEncontrado = true;
                    JOptionPane.showMessageDialog(null, "Acesso concedido");
                    menuFrame.dispose();
                    new Pesquisador_GUI().setVisible(true);  // Sai do loop se o usuário foi encontrado
                }
            }
        }
        
        
        
        for (int i = 0; i < gerentes.length; i++){
            if (!gerentes[i].isEmpty() && !gsenhas[i].isEmpty()){
                if (gerentes[i].equals(xemail) && gsenhas[i].equals(xsenha)){
                numero = i;
                usuarioEncontrado = true;
                JOptionPane.showMessageDialog(null, "Acesso concedido");
                menuFrame.dispose();
                new Gerente_GUI().setVisible(true);
                }
            }
        }
        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos");
        }
    }
    
    public static void esqueceu(){
        email_txt.setVisible(true);
        senha_txt.setVisible(false);
        email_lbl.setVisible(true);
        senha_lbl.setVisible(false);
        sair_btn.setVisible(true);
        logar_btn.setVisible(false);
        esqueceu_btn.setVisible(false);
        voltar_btn.setVisible(true);
        enviar_btn.setVisible(true);
        subtitulo2_lbl.setText("Digite o e-mail o qual você esqueceu a senha");  
    }
    
    public static void enviar(){
        String x = email_txt.getText();
        if (x.equals("")){
        JOptionPane.showMessageDialog(null, "Digite o e-mail, por favor");
        } else{JOptionPane.showMessageDialog(null, "Redefinição de senha enviada \n Verifique seu e-mail, por favor");}
    }
    
    public static void voltar(){
        titulo_lbl.setVisible(true);
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
        subtitulo2_lbl.setText("Plataforma para Pesquisadores e Gerentes de projeto"); 
    }
    
    
}