package com.mycompany.projectecaixerautomlucas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
* Controlador de la finestra de gestió de comptes i altres funcionalitats
*
*/

public class SecondaryController {
    /*
    @FXML
    void initialize(){
         System.out.println(App.nom);
    }
    */
    
    @FXML
    Button buttonLogout;
    
    @FXML
    Button buttonConsultSaldo;
    
    @FXML
    Button buttonCC;
    
    @FXML
    Button buttonAfegirCC;
    
    @FXML
    Button buttonEliminarCC;
    
    @FXML
    Button buttonCE;
    
    @FXML
    Button buttonAfegirCE;
    
    @FXML
    Button buttonEliminarCE;
    
    @FXML
    Button buttonMesInfo;
    
    @FXML
    Button buttonCanviarClau;
    
    
    @FXML
    public void logout() throws IOException{
        App.setRoot("primary");
    }
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    @FXML
    private void switchToQuartary() throws IOException {
        App.setRoot("quartary");
    }
    
    @FXML
    private void switchToPentary() throws IOException {
        App.setRoot("pentary");
    }
}