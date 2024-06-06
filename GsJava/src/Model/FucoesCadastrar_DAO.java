
package Model;

import static Model.FuncoesInicio_DAO.emails;
import static Model.FuncoesInicio_DAO.locais;
import static Model.FuncoesInicio_DAO.nome_pesquisadores_amazonas;
import static Model.FuncoesInicio_DAO.masenhas;

import static Model.FuncoesInicio_DAO.nome_pesquisadores_parana;
import static Model.FuncoesInicio_DAO.pasenhas;
import static Model.FuncoesInicio_DAO.pesquisador_amazonas;
import static Model.FuncoesInicio_DAO.pesquisador_parana;
import static Model.FuncoesInicio_DAO.senhas;

import static Model.FuncoesInicio_DAO.usuarios;
import View.Cadastrar_GUI;
import static View.Cadastrar_GUI.cadastraramazonas_btn;
import static View.Cadastrar_GUI.cadastrarparana_btn;
import static View.Cadastrar_GUI.email1_lbl;
import static View.Cadastrar_GUI.email2_txt;
import static View.Cadastrar_GUI.nome1_lbl;
import static View.Cadastrar_GUI.nome2_txt;
import static View.Cadastrar_GUI.senha1_lbl;
import static View.Cadastrar_GUI.senha2_txt;
import static View.Cadastrar_GUI.vaga_lbl;
import static View.Cadastrar_GUI.verifica_lbl;
import View.Gerente_GUI;
import javax.swing.JOptionPane;


public class FucoesCadastrar_DAO {
    
       
    public static void voltarGerente(Cadastrar_GUI menuFrame){
        menuFrame.dispose();
        new Gerente_GUI().setVisible(true);
        
    }
    
    public static void amazonas(){
        verifica_lbl.setVisible(true);
        vaga_lbl.setText("");
        int lugarn = 0;
        int lugar = 0;
        for (int i = 0; i < nome_pesquisadores_amazonas.length; i++) {
            if (nome_pesquisadores_amazonas[i].equals("")) {
                lugarn++;        // variavel que define lugares vazios          
            }
            else{
                lugar ++; // variavel que define lugares ocupados
            }
        }
        String mensagem = "Existem " + lugarn + " lugares vazios nesse local";
        verifica_lbl.setText(mensagem);
        if (lugarn > 0){
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            senha1_lbl.setVisible(true);
            nome2_txt.setVisible(true);
            email2_txt.setVisible(true);
            senha2_txt.setVisible(true);
            cadastraramazonas_btn.setVisible(true);
            cadastrarparana_btn.setVisible(false);
        } else{
            nome1_lbl.setVisible(false);
            email1_lbl.setVisible(false);
            senha1_lbl.setVisible(false);
            nome2_txt.setVisible(false);
            email2_txt.setVisible(false);
            senha2_txt.setVisible(false);
            vaga_lbl.setVisible(true);
            vaga_lbl.setText("Escolha outra estação, por favor");
        }    
    }
    public static void parana(){
        verifica_lbl.setVisible(true);
        vaga_lbl.setText("");
        int lugarn = 0;
        int lugar = 0;
        int[] vetor = new int[5];
        int indiceVazio = 0;
        for (int i = 0; i < nome_pesquisadores_parana.length; i++) {
            if (nome_pesquisadores_parana[i].equals("")) {
                lugarn++;        // variavel que define lugares vazios   
                vetor[indiceVazio] = i;
                indiceVazio++;
            }
            else{
                lugar ++; // variavel que define lugares ocupados
            }
        }
        String mensagem = "Existem " + lugarn + " lugares vazios nesse local";
        verifica_lbl.setText(mensagem);
        if (lugarn > 0){
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            senha1_lbl.setVisible(true);
            nome2_txt.setVisible(true);
            email2_txt.setVisible(true);
            senha2_txt.setVisible(true);
            cadastrarparana_btn.setVisible(true);
            cadastraramazonas_btn.setVisible(false);
        } else{// fazer o else que printa em outra label estação completa
            nome1_lbl.setVisible(false);
            email1_lbl.setVisible(false);
            senha1_lbl.setVisible(false);
            nome2_txt.setVisible(false);
            email2_txt.setVisible(false);
            senha2_txt.setVisible(false);
            vaga_lbl.setVisible(true);
            vaga_lbl.setText("Escolha outra estação, por favor");
            }
    }
    
    public static void cadastraramazonas(){ 
        
    boolean inserted = false; // variável de controle
    boolean adicionado = false;
    String x = nome2_txt.getText();
    
    String xnome = nome2_txt.getText().trim();
    String xemail = email2_txt.getText().trim();
    String xsenha = senha2_txt.getText().trim();
    
    if (xnome.isEmpty() || xemail.isEmpty() || xsenha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
        return; // Interrompe a função se algum campo estiver vazio
    }
    
    for (int i = 0; i < pesquisador_amazonas.length && !inserted; i++) { // adiciona condição no for
        if(pesquisador_amazonas[i].equals("")) {
            for (int j = 0; j < usuarios.length && !adicionado ; j++){
                    if (usuarios[j].equals("")){
                        usuarios[j] = x;
                        JOptionPane.showMessageDialog(null,"Pesquisador cadastrado com sucesso! \n ID do pesquisador: " + j);
                        x = email2_txt.getText();
                        emails[j] = x;
                        x = senha2_txt.getText();
                        senhas[j] = x;
                        locais[j] = "Estação rio amazonas";
                        adicionado = true;
                    }
                }
            x = nome2_txt.getText();
            nome_pesquisadores_amazonas[i] = x;
            x = email2_txt.getText();
            pesquisador_amazonas[i] = x;    
            x = senha2_txt.getText();
            masenhas[i] = x;
            inserted = true; // seta a variável de controle para sair do loop
        }
    nome1_lbl.setVisible(false);
    email1_lbl.setVisible(false);
    senha1_lbl.setVisible(false);
    nome2_txt.setVisible(false);
    email2_txt.setVisible(false);
    senha2_txt.setVisible(false);
    verifica_lbl.setVisible(false);
    cadastraramazonas_btn.setVisible(false);
    verifica_lbl.setText("");
    verifica_lbl.setVisible(false);
    
    }
         
 }
    
    public static void cadastrarparana(){
        
    boolean inserted = false; // variável de controle
    boolean adicionado = false;
    String x = nome2_txt.getText();
    
    String xnome = nome2_txt.getText().trim();
    String xemail = email2_txt.getText().trim();
    String xsenha = senha2_txt.getText().trim();
    
    if (xnome.isEmpty() || xemail.isEmpty() || xsenha.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos!");
        return; // Interrompe a função se algum campo estiver vazio
    }
    
    
        for (int i = 0; i < pesquisador_parana.length && !inserted; i++) { // adiciona condição no for
            if (pesquisador_parana[i].equals("")) {
                for (int j = 0; j < usuarios.length && !adicionado ; j++){
                    if (usuarios[j].equals("")){
                        usuarios[j] = x;
                        JOptionPane.showMessageDialog(null,"Pesquisador cadastrado com sucesso! \n ID do pesquisador: " + j); 
                        x = email2_txt.getText();
                        emails[j] = x;
                        x = senha2_txt.getText();
                        senhas[j] = x;
                        locais[j] = "Estação rio paraná";
                        adicionado = true;
                    }
                }
                x = nome2_txt.getText();
                nome_pesquisadores_parana[i] = x;
                x = email2_txt.getText();
                pesquisador_parana[i] = x;
                x = senha2_txt.getText(); 
                pasenhas[i] = x;
                inserted = true; // seta a variável de controle para sair do loop
            }
            
        }  
    nome1_lbl.setVisible(false);
    email1_lbl.setVisible(false);
    senha1_lbl.setVisible(false);
    nome2_txt.setVisible(false);
    email2_txt.setVisible(false);
    senha2_txt.setVisible(false);
    verifica_lbl.setVisible(false);
    cadastrarparana_btn.setVisible(false);
    verifica_lbl.setText("");
    verifica_lbl.setVisible(false);
    }
}

// fazer um if lugarn > 0, aparecer os campos de texto para salvar nas variáveis
// fazer o relatório e analisar pesquisadores
