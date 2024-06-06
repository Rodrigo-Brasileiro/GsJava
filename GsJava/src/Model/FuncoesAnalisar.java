
package Model;

import static Model.FuncoesInicio_DAO.nome_pesquisadores_amazonas;
import static Model.FuncoesInicio_DAO.nome_pesquisadores_parana;
import static Model.FuncoesInicio_DAO.pesquisador_amazonas;
import static Model.FuncoesInicio_DAO.pesquisador_parana;
import static Model.FuncoesInicio_DAO.usuarios;
import View.Analisar_GUI;
import static View.Analisar_GUI.email1_lbl;
import static View.Analisar_GUI.email2_lbl;
import static View.Analisar_GUI.email2_txt;
import static View.Analisar_GUI.email_txt;
import static View.Analisar_GUI.id1_lbl;
import static View.Analisar_GUI.id2_lbl;
import static View.Analisar_GUI.id2_txt;
import static View.Analisar_GUI.id_txt;
import static View.Analisar_GUI.nome1_lbl;
import static View.Analisar_GUI.nome2_lbl;
import static View.Analisar_GUI.nome2_txt;
import static View.Analisar_GUI.nome_txt;
import View.Gerente_GUI;


public class FuncoesAnalisar {
    
    public static void voltar(Analisar_GUI menuFrame){
        menuFrame.dispose();
        new Gerente_GUI().setVisible(true);}
    
    
    
    public static void pesquisadoramazonas(){
        id1_lbl.setVisible(false);
        nome1_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        id2_lbl.setVisible(false);
        nome2_lbl.setVisible(false);
        email2_lbl.setVisible(false);
        id_txt.setText("");
        nome_txt.setText("");
        email_txt.setText("");
        id2_txt.setText("");
        nome2_txt.setText("");
        email2_txt.setText("");
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
        if (lugarn == 2){ // se não tiver ningúem na estação
            id_txt.setText("Não existem pesquisadores designados a está estação!");
        }
        else if (lugarn == 1){
            id1_lbl.setVisible(true);
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            id_txt.setVisible(true);
            nome_txt.setVisible(true);
            email_txt.setVisible(true);
            nome_txt.setText(nome_pesquisadores_amazonas[0]);
            email_txt.setText(pesquisador_amazonas[0]);
            //id_txt.setText("");
            for ( int i = 0; i < usuarios.length; i++){
                if(nome_pesquisadores_amazonas[0] == usuarios[i]){
                    id_txt.setText(String.valueOf(i));
                }
            }
        }
        
        else{
            id1_lbl.setVisible(true);
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            id2_lbl.setVisible(true);
            nome2_lbl.setVisible(true);
            email2_lbl.setVisible(true);
            id_txt.setVisible(true);
            nome_txt.setVisible(true);
            email_txt.setVisible(true);
            id2_txt.setVisible(true);
            nome2_txt.setVisible(true);
            email2_txt.setVisible(true);
            
            
            
            nome_txt.setText(nome_pesquisadores_amazonas[0]);
            email_txt.setText(pesquisador_amazonas[0]);
            //id_txt.setText("");
            for ( int i = 0; i < usuarios.length; i++){
                if(nome_pesquisadores_amazonas[0] == usuarios[i]){
                    id_txt.setText(String.valueOf(i));
                }
            }
            
            
            nome2_txt.setText(nome_pesquisadores_amazonas[1]);
            email2_txt.setText(pesquisador_amazonas[1]);
            for ( int i = 0; i < usuarios.length; i++){
                if(nome_pesquisadores_amazonas[1].equals(usuarios[i])){
                    id2_txt.setText(String.valueOf(i));
                }
            }
        }
    
    }
    
    public static void pesquisadorparana(){
        id1_lbl.setVisible(false);
        nome1_lbl.setVisible(false);
        email1_lbl.setVisible(false);
        id2_lbl.setVisible(false);
        nome2_lbl.setVisible(false);
        email2_lbl.setVisible(false);
        id_txt.setText("");
        nome_txt.setText("");
        email_txt.setText("");
        id2_txt.setText("");
        nome2_txt.setText("");
        email2_txt.setText("");
        int lugarn = 0;
        int lugar = 0;
        for (int i = 0; i < nome_pesquisadores_parana.length; i++) {
            if (nome_pesquisadores_parana[i].equals("")) {
                lugarn++;        // variavel que define lugares vazios          
            }
            else{
                lugar ++; // variavel que define lugares ocupados
            }
        }
        if (lugarn == 2){ // se não tiver ningúem na estação
            id_txt.setText("Estação sem funcionários!");
        }
        else if (lugarn == 1){
            id1_lbl.setVisible(true);
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            id_txt.setVisible(true);
            nome_txt.setVisible(true);
            email_txt.setVisible(true);
            nome_txt.setText(nome_pesquisadores_parana[0]);
            email_txt.setText(pesquisador_parana[0]);
            for ( int i = 0; i < usuarios.length; i++){
                if(nome_pesquisadores_parana[0].equals(usuarios[i])){
                    id_txt.setText(String.valueOf(i));
                }
            }
        }
        
        else{
            id1_lbl.setVisible(true);
            nome1_lbl.setVisible(true);
            email1_lbl.setVisible(true);
            id2_lbl.setVisible(true);
            nome2_lbl.setVisible(true);
            email2_lbl.setVisible(true);
            id_txt.setVisible(true);
            nome_txt.setVisible(true);
            email_txt.setVisible(true);
            id2_txt.setVisible(true);
            nome2_txt.setVisible(true);
            email2_txt.setVisible(true);
            
            
            
            nome_txt.setText(nome_pesquisadores_parana[0]);
            email_txt.setText(pesquisador_parana[0]);
            
            for ( int i = 0; i < usuarios.length; i++){
                if(nome_pesquisadores_parana[0].equals(usuarios[i])){
                    id_txt.setText(String.valueOf(i));
                }
            }
            
            nome2_txt.setText(nome_pesquisadores_parana[1]);
            email2_txt.setText(pesquisador_parana[1]);
            for ( int i = 0; i < usuarios.length ; i++){
                if(nome_pesquisadores_parana[1].equals(usuarios[i])){
                    id2_txt.setText(String.valueOf(i));
                }
            }
            
        }
    
    
    
    
    
    
    
    }
    
        
    
}
