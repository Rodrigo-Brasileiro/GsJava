
package Model;

import View.Analisar_GUI;
import View.Cadastrar_GUI;
import View.Gerente_GUI;
import static View.Gerente_GUI.Cadastrar_btn;
import static View.Gerente_GUI.analisar_btn;
import static View.Gerente_GUI.email1_lbl;
import static View.Gerente_GUI.email2_lbl;
import static View.Gerente_GUI.id1_lbl;
import static View.Gerente_GUI.id2_lbl;
import static View.Gerente_GUI.nome1_lbl;
import static View.Gerente_GUI.nome2_lbl;
import static View.Gerente_GUI.sair_btn;
import static View.Gerente_GUI.voltar_btn;
import static View.Gerente_GUI.voltarmenu_btn;
import View.Inicio_GUI;
import javax.swing.JOptionPane;


public class FuncoesGerente_DAO {
    public static String [] nome_gerentes = {"Nikolas Rodrigues"};
    public static String [] local = {"Rio Amazonas", "Rio Paraná"};
    
    public static void informacoes(){
        analisar_btn.setVisible(false);
        Cadastrar_btn.setVisible(false);
        nome1_lbl.setVisible(true);
        nome2_lbl.setVisible(true);
        email1_lbl.setVisible(true);
        email2_lbl.setVisible(true);
        id1_lbl.setVisible(true);
        id2_lbl.setVisible(true);
        voltarmenu_btn.setVisible(false);
        voltar_btn.setVisible(true);
        sair_btn.setVisible(true);
        
        int numero = FuncoesInicio_DAO.numero;
        nome2_lbl.setText(nome_gerentes[numero]);
        email2_lbl.setText(FuncoesInicio_DAO.gerentes[numero]);
        id2_lbl.setText(Integer.toString(numero)); 
        
    }
    
    public static void voltarmenu(Gerente_GUI menuFrame){
    
    String x = JOptionPane.showInputDialog(null,"Você será deslogado, tem certeza?  \n 1 - Sim  \n 2 - Não");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
            menuFrame.dispose();
            new Inicio_GUI().setVisible(true);
        }
    }
    
    public static void fechar(){
        String x = JOptionPane.showInputDialog(null,"Deseja mesmo sair?  \n 1 - Sim  \n 2 - Voltar");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
               System.exit(0);
        }else{JOptionPane.showMessageDialog(null,"Voltando para o sistema");}
    }
    
    public static void voltar(){
        analisar_btn.setVisible(true);
        Cadastrar_btn.setVisible(true);
        nome1_lbl.setVisible(false);
        nome2_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        email2_lbl.setVisible(false);
        id1_lbl.setVisible(false);
        id2_lbl.setVisible(false);
        voltarmenu_btn.setVisible(true);
        voltar_btn.setVisible(false);
        sair_btn.setVisible(true);
    }
    
    public static void cadastrar(Gerente_GUI menuFrame){
        menuFrame.dispose();
        new Cadastrar_GUI().setVisible(true);
    }
    public static void analisar(Gerente_GUI menuFrame){
        menuFrame.dispose();
        new Analisar_GUI().setVisible(true);
    }
}
