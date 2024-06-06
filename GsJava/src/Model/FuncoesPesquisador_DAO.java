
package Model;


import static Model.FuncoesInicio_DAO.locais;
import static Model.FuncoesInicio_DAO.usuarios;
import static Model.FuncoesRelatorio_DAO.Conteudo;
import static Model.FuncoesRelatorio_DAO.NivelAlerta;
import static Model.FuncoesRelatorio_DAO.datas;
import static Model.FuncoesRelatorio_DAO.meuVetor;
import static Model.FuncoesRelatorio_DAO.titulo;
import View.Inicio_GUI;
import View.Pesquisador_GUI;
import static View.Pesquisador_GUI.analisar_btn;
import static View.Pesquisador_GUI.email1_lbl;
import static View.Pesquisador_GUI.email2_lbl;
import static View.Pesquisador_GUI.id1_lbl;
import static View.Pesquisador_GUI.id2_lbl;
import static View.Pesquisador_GUI.local1_lbl;
import static View.Pesquisador_GUI.local2_lbl;
import static View.Pesquisador_GUI.nome1_lbl;
import static View.Pesquisador_GUI.nome2_lbl;
import static View.Pesquisador_GUI.realizar_btn;
import static View.Pesquisador_GUI.relatorio1_lbl;
import static View.Pesquisador_GUI.relatorio2_lbl;
import static View.Pesquisador_GUI.subtextorelatorio_lbl;
import static View.Pesquisador_GUI.subtitulo2_lbl;
import static View.Pesquisador_GUI.subtitulo_lbl;
import static View.Pesquisador_GUI.titulo_lbl;
import static View.Pesquisador_GUI.voltar_btn;
import static View.Pesquisador_GUI.voltarmenu_btn;
import View.Relatorio_GUI;
import View.Sensor_GUI;
import javax.swing.JOptionPane;



public class FuncoesPesquisador_DAO {
    public static String [] nome_pesquisadores = {"Rodrigo Brasileiro", "", "", ""};
    //public static String [] nome_pesquisadores_amazonas = {"", ""};
    //public static String [] nome_pesquisadores_parana = {"",""};
    //public static String [] local = {"Rio Amazonas", "Rio Paraná"};

    
    //String [] email = FuncoesInicio_DAO.usuarios; possivelmente uma variável inútil, analisar com calma
   
    
    public static void fechar(){
    String x = JOptionPane.showInputDialog(null,"Deseja mesmo sair?  \n 1 - Sim  \n 2 - Voltar");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
               System.exit(0);
        }else{JOptionPane.showMessageDialog(null,"Voltando para o sistema");}
    }
    
    public static void informacoes(){
        String id = "";
        // colocar todas as informações vísiveis
        titulo_lbl.setVisible(true);
        subtitulo_lbl.setVisible(true);
        subtitulo2_lbl.setVisible(true);
        View.Pesquisador_GUI.nome1_lbl.setVisible(true);
        nome2_lbl.setVisible(true);
        local1_lbl.setVisible(true);
        local2_lbl.setVisible(true);
        email1_lbl.setVisible(true);
        email2_lbl.setVisible(true);
        id1_lbl.setVisible(true);
        id2_lbl.setVisible(true);
        relatorio1_lbl.setVisible(true); 
        analisar_btn.setVisible(false);
        realizar_btn.setVisible(false);
        voltar_btn.setVisible(true);
        voltarmenu_btn.setVisible(false);
        subtextorelatorio_lbl.setVisible(true);
        
        // Informações do pesquisador revisar
        int numero = FuncoesInicio_DAO.numero;
        nome2_lbl.setText(usuarios[numero]); // criar email com todos e todos os locais 
        email2_lbl.setText(FuncoesInicio_DAO.emails[numero]); // refazer // refeito
        local2_lbl.setText(locais[numero]);
        id2_lbl.setText(Integer.toString(numero)); 
        
        id = Integer.toString(numero);
        boolean inserted = false;
        
        for (int i = meuVetor.length - 1; i >= 0 && !inserted; i--) {
            if (meuVetor[i].equals(id)) {
                relatorio2_lbl.setVisible(true);
                relatorio2_lbl.setText(titulo[i]);
                inserted = true;
            }
        }   
    }
    
    public static void mostrarelatorio(){
        // Recupera o número do relatório atual (último)
    int numero = FuncoesInicio_DAO.numero;
    String id = Integer.toString(numero);
    
    // Inicializa as variáveis para armazenar os dados do último relatório
    String ultimoTitulo = "";
    String ultimoNivelAlerta = "";
    String ultimoConteudo = "";
    String dia = "";
    
    // Percorre o vetor de trás para frente para encontrar o último relatório do usuário
    for (int i = meuVetor.length - 1; i >= 0; i--) {
        if (meuVetor[i].equals(id)) {
            ultimoTitulo = titulo[i];
            ultimoNivelAlerta = NivelAlerta[i];
            ultimoConteudo = Conteudo[i];
            dia = datas[i];
            break;
        }
    }
    
    // Cria a mensagem a ser exibida
    String mensagem = "Título: " + ultimoTitulo + "\n" +
                      "Nível de Alerta: " + ultimoNivelAlerta + "\n" +
                      "Conteúdo: " + ultimoConteudo+ "\n" +
                      "Data: " + dia;
                      
    
    // Exibe a mensagem em um JOptionPane
    JOptionPane.showMessageDialog(null, mensagem, "Relatório", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public static void voltar(){
        titulo_lbl.setVisible(true);
        subtitulo_lbl.setVisible(true);
        subtitulo2_lbl.setVisible(true);
        nome1_lbl.setVisible(false);
        nome2_lbl.setVisible(false);
        local1_lbl.setVisible(false);
        local2_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        email2_lbl.setVisible(false);
        id1_lbl.setVisible(false);
        id2_lbl.setVisible(false);
        relatorio1_lbl.setVisible(false);
        relatorio2_lbl.setVisible(false);
        analisar_btn.setVisible(true);
        realizar_btn.setVisible(true);
        voltar_btn.setVisible(false);
        voltarmenu_btn.setVisible(true);
        subtextorelatorio_lbl.setVisible(false);
    }
    
    public static void voltarmenu(Pesquisador_GUI menuFrame) {
        String x = JOptionPane.showInputDialog(null,"Você será deslogado, tem certeza?  \n 1 - Sim  \n 2 - Não");
        int escolha = Integer.parseInt(x);
        if (escolha == 1) {
            menuFrame.dispose();
            new Inicio_GUI().setVisible(true);
        }
    }
    
    public static void relatorios(Pesquisador_GUI menuFrame){
        menuFrame.dispose();
        new Relatorio_GUI().setVisible(true);  // Sai do loop se o usuário foi encontrado
    }
    
    public static void sensor(Pesquisador_GUI menuFrame){
        menuFrame.dispose();
        new Sensor_GUI().setVisible(true);
        
    }

}
