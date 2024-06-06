
package Model;

import static Model.FuncoesInicio_DAO.emails;
import static Model.FuncoesInicio_DAO.usuarios;
import static View.Inicio_GUI.email_txt;
import View.Pesquisador_GUI;
import View.Relatorio_GUI;
import static View.Relatorio_GUI.autor_txt;
import static View.Relatorio_GUI.conteudo_txt;
import static View.Relatorio_GUI.data_lbl;
import static View.Relatorio_GUI.idautor_txt;
import static View.Relatorio_GUI.nivel_txt;
import static View.Relatorio_GUI.titulo_txt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class FuncoesRelatorio_DAO {
    public static String [] titulo = {"Primeiro relatorio","","","","","","","","","","",""};
    public static String[] NivelAlerta = {"5 - preocupante","","","","","","","","","","",""};
    public static String[] Conteudo = {"Nível do oxigênio abaixo do normal, Salinidade Ok e ph muito alto","","","","","","","","","","",""};
    public static String [] datas = {"05 / 06 / 2024","","","","","","","","","","",""};
    public static String[] meuVetor = {"0","","","","","","","","","","",""};
    
    public static void enviar(){
        String tituloAtual = titulo_txt.getText();
        String Nivel_Alerta = nivel_txt.getText();
        String relatorios = conteudo_txt.getText();
        boolean inserted = false;
        String id = "";
        String x = email_txt.getText();
        
        if (tituloAtual.isEmpty() || Nivel_Alerta.isEmpty() || relatorios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos antes de enviar o relatório.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Busca o ID do email
        for (int i = 0; i < emails.length; i++){
            if(x.equals(emails[i])){
                id = String.valueOf(i);
            }}
        
        for (int i = 0; i < titulo.length && !inserted; i++) {
            if(titulo[i].equals("")){
                titulo[i] = tituloAtual;
                NivelAlerta[i] = Nivel_Alerta;
                Conteudo[i] = relatorios;
                meuVetor[i] = id;
                JOptionPane.showMessageDialog(null,"Relatório enviado com sucesso!");
                inserted = true;
            }
        }
    }
    
    public static void nome(){
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd / LL / yyyy");
        String data = localDate.format(formatter);
        data_lbl.setText(data);
        String x = email_txt.getText();
        for (int i = 0; i < emails.length; i++){
            if(x.equals(emails[i])){
                idautor_txt.setText(String.valueOf(i));
                autor_txt.setText(usuarios[i]);
                datas[i] = data; // rever
            }
        }
        
    }
    
    public static void voltapesquisador(Relatorio_GUI menuFrame){
    String x = JOptionPane.showInputDialog(null,"Tem certeza de que quer voltar?  \n 1 - Sim  \n 2 - Não");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
            menuFrame.dispose();
            new Pesquisador_GUI().setVisible(true);
        }
        
    }
        
}
