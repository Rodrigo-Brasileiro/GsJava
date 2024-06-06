
package Model;

import View.Pesquisador_GUI;
import View.Relatorio_GUI;
import View.Sensor_GUI;
import static View.Sensor_GUI.mediaoxi_lbl;
import static View.Sensor_GUI.mediaph_lbl;
import static View.Sensor_GUI.mediasal_lbl;
import static View.Sensor_GUI.oxigenio2_lbl;
import static View.Sensor_GUI.oxigenio3_lbl;
import static View.Sensor_GUI.oxigenio4_lbl;
import static View.Sensor_GUI.oxigenio5_lbl;
import static View.Sensor_GUI.oxigenio_lbl;
import static View.Sensor_GUI.ph2_lbl;
import static View.Sensor_GUI.ph3_lbl;
import static View.Sensor_GUI.ph4_lbl;
import static View.Sensor_GUI.ph5_lbl;
import static View.Sensor_GUI.ph_lbl;
import static View.Sensor_GUI.salinidade2_lbl;
import static View.Sensor_GUI.salinidade3_lbl;
import static View.Sensor_GUI.salinidade4_lbl;
import static View.Sensor_GUI.salinidade5_lbl;
import static View.Sensor_GUI.salinidade_lbl;
import java.util.Random;


public class FuncoesSensor_DAO {
    
    
    public static void oxigenio(){
        oxigenio_lbl.setVisible(true);
        oxigenio2_lbl.setVisible(true);
        oxigenio3_lbl.setVisible(true);
        oxigenio4_lbl.setVisible(true);
        oxigenio5_lbl.setVisible(true);
        mediaoxi_lbl.setVisible(true);
        
        double media = 0;
        
        Random random = new Random();
        
        double oxi = random.nextDouble() * (8 - 3) + 3;
        media = oxi + media;
        oxigenio_lbl.setText(String.format("%.2f mg/L", oxi));
        //JOptionPane.showMessageDialog(null, oxi);
        
        oxi = random.nextDouble() * (8 - 3) + 3;
        media = oxi + media;
        oxigenio2_lbl.setText(String.format("%.2f mg/L", oxi));
        
        
        oxi = random.nextDouble() * (8 - 3) + 3;
        media = oxi + media;
        oxigenio3_lbl.setText(String.format("%.2f mg/L", oxi));
        
        oxi = random.nextDouble() * (8 - 3) + 3;
        media = oxi + media;
        oxigenio4_lbl.setText(String.format("%.2f mg/L", oxi));
        
        oxi = random.nextDouble() * (8 - 3) + 3;
        media = oxi + media;
        oxigenio5_lbl.setText(String.format("%.2f mg/L", oxi));
         
        double mediaFinal = media / 5;
        mediaoxi_lbl.setText(String.format("Média: %.2f ppt", mediaFinal));
    }
    
    public static void salinidade() {
        salinidade_lbl.setVisible(true);
        salinidade2_lbl.setVisible(true);
        salinidade3_lbl.setVisible(true);
        salinidade4_lbl.setVisible(true);
        salinidade5_lbl.setVisible(true);
        mediasal_lbl.setVisible(true);
        
        double media = 0;

        Random random = new Random();
        
        double salinidade = random.nextDouble() * (37 - 30) + 30;
        media = salinidade + media;
        salinidade_lbl.setText(String.format("%.2f ppt", salinidade));
    
        salinidade = random.nextDouble() * (37 - 30) + 30;
        media = salinidade + media;
        salinidade2_lbl.setText(String.format("%.2f ppt", salinidade));
        
        salinidade = random.nextDouble() * (37 - 30) + 30;
        media = salinidade + media;
        salinidade3_lbl.setText(String.format("%.2f ppt", salinidade));
        
        salinidade = random.nextDouble() * (37 - 30) + 30;
        media = salinidade + media;
        salinidade4_lbl.setText(String.format("%.2f ppt", salinidade));
        
        salinidade = random.nextDouble() * (37 - 30) + 30;
        media = salinidade + media;
        salinidade5_lbl.setText(String.format("%.2f ppt", salinidade));
        
        double mediaFinal = media / 5;
        mediasal_lbl.setText(String.format("Média: %.2f ppt", mediaFinal));
        
    }
    
    public static void ph() {
        ph_lbl.setVisible(true);
        ph2_lbl.setVisible(true);
        ph3_lbl.setVisible(true);
        ph4_lbl.setVisible(true);
        ph5_lbl.setVisible(true);
        mediaph_lbl.setVisible(true);
        
        double media = 0;
        
        Random random = new Random();
        
        double ph = random.nextDouble() * (8.4 - 8.0) + 8.0;
        media = ph + media;
        ph_lbl.setText(String.format("%.2f ph", ph)); 
        
        ph = random.nextDouble() * (8.4 - 8.0) + 8.0;
        media = ph + media;
        ph2_lbl.setText(String.format("%.2f ph", ph));
        
        ph = random.nextDouble() * (8.4 - 8.0) + 8.0;
        media = ph + media;
        ph3_lbl.setText(String.format("%.2f ph", ph));
        
        ph = random.nextDouble() * (8.4 - 8.0) + 8.0;
        media = ph + media;
        ph4_lbl.setText(String.format("%.2f ph", ph));
        
        ph = random.nextDouble() * (8.4 - 8.0) + 8.0;
        media = ph + media;
        ph5_lbl.setText(String.format("%.2f ph", ph));
    
        double mediaFinal = media / 5;
        mediaph_lbl.setText(String.format("Média: %.2f ph", mediaFinal));
    }
    
    public static void voltarpesquisador(Sensor_GUI menuFrame){
        menuFrame.dispose();
        new Pesquisador_GUI().setVisible(true);
    }
    
    public static void relatorios(Sensor_GUI menuFrame){
        menuFrame.dispose();
        new Relatorio_GUI().setVisible(true); 
    }
    
}
