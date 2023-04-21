package com.mycompany.endevina_numero;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
   private GuessNumber jocEndevina;
    
    @FXML
    TextField maxim;
    @FXML
    TextField minim;
    @FXML
    TextField maxintents;
    @FXML
    TextField numero;
    @FXML
    TextField intents;
    @FXML
    Label missatge;
    
    @FXML
    Button comprovarBtn;

    @FXML
    private void comprovar() {
        System.out.println("Comprovem número");
    }
    
    @FXML
    private void iniciar() throws Exception {
        System.out.println("Inici joc...");
try{
        String max = maxim.getText();
        String min= minim.getText();
        String maxints = maxintents.getText();
        
        int imax = Integer.parseInt(max);
        int imin = Integer.parseInt(min);
        int imaxint= Integer.parseInt(maxints);
        
        if (imin<0) throw new Exception("Minim Incorrecte");
        if (imax<0) throw new Exception("Màxim incorrecte");
        if (imin>=imax) throw new Exception("Màxim ha de ser més gran que mínim");
  
        
        jocEndevina = new GuessNumber(imin,imax,imaxint);
        numero.setDisable(false);
        comprovarBtn.setDisable(false);
        missatge.setText(jocEndevina.getMissatge());
        intents.setText(maxints);
        
    }
    catch(Exception e) {
System.out.println(e.getMessage());
missatge.setText("Error en les dades entrades");
}
   
}
    
    @FXML
    private void comprova() {
        try {
        String num = numero.getText();
        int inum = Integer.valueOf(num);
            if (inum< jocEndevina.getMinValor()) throw new Exception("Numero incorrecte");
             if (inum> jocEndevina.getMaxValor()) throw new Exception("Numero incorrecte");
                
            boolean fi = jocEndevina.comprova(inum);
            if (fi) {
              comprovarBtn.setDisable(true);
            }
            missatge.setText(jocEndevina.getMissatge());
            intents.setText(jocEndevina.getIntents()+"");
    }
        catch(Exception e){
            missatge.setText("Error en número entrat");
    }
    }
    
    
     @FXML
    private void initialize() {
        missatge.setText("Iniciar partida...");
        numero.setDisable(true);
        comprovarBtn.setDisable(true);
        System.out.println("iniciant...");
        
    }
}
