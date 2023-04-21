package com.mycompany.benzinerafx;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
   @FXML
   RadioButton rbgasolina;
    @FXML
   RadioButton rbdiesel;
   @FXML
   DatePicker datap;
   @FXML
   TextField preutxt;
   @FXML
   TextField apagartxt;
   @FXML
   TextField quantitattxt;
   @FXML
   TextField matriculatxt;
   @FXML
   TextArea resumtxt;
   
   public void initialize(){
       preu();
   }
   
    @FXML
   private double preu() {
       double preu;
       if (rbgasolina.isSelected()) {
           preu=1.53;
       }else{
           preu= 1.68;
       }
       preutxt.setText(String.valueOf(preu));
       return preu;
           
       }
   
   @FXML
   private void calcular(){
        
        try {
    double preu;
        System.out.println("has clickat el botó");
        double quantitat=Double.parseDouble(quantitattxt.getText());
            System.out.println(quantitat);
             preu= preu();
        double apagar = quantitat * preu;
        apagartxt.setText(String.valueOf(apagar));
        
        
        resumtxt.setText("Matricula: "+ matriculatxt.getText()+"\n"
        + "data compra: "+ dataCompra() + "\n"
        + "Preu a pagar" + preu
        );
    }
    catch(Exception e) {
           alerta();
}
    }

private void alerta() {
    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    alerta.setHeaderText(null);
    alerta.setTitle("Confirmació");
    alerta.setContentText("Error Dades!!");
    alerta.show();
}

private String dataCompra(){
    LocalDate data = datap.getValue();
    if (data==null) {
        data = LocalDate.now();
     }
    DateTimeFormatter formatData =
    DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String avuiFormat = data.format(formatData);
       return avuiFormat;
    
}
    
    
    
    
    
  

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
