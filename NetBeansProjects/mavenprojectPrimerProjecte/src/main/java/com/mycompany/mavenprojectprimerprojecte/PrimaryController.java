package com.mycompany.mavenprojectprimerprojecte;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    public void sumar() {
        System.out.println("Sumar!!!!");
        System.out.println(camp1.getText());
        try{
            double num1 = Double.parseDouble(camp1.getText());
            System.out.println(num1);
      
    }
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
