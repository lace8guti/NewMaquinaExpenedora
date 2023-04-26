
package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 *
 * @author alumne
 */

// Controlador de la finestra per consultar informació referent als comptes que ofereix el banc

public class PentaryController {
    
    @FXML
    Button buttonComeBack;
    
    @FXML
    Button buttonCC;
    
    @FXML
    Button buttonCE;
    
    @FXML
    TextField textfieldInfo;
    
    
    
    //función para volver al menú
    @FXML
    private void switchToSecondary() throws IOException {
        
        App.setRoot("secondary");
    }
    
    //TODO
    //Hay que optimizar el texto que se muestra sobre cada uno de los tipos de cuenta
    
    //función que muestra la información sobre las CC o sobre las CE, según el botón que se pulse
    @FXML
    private void handleButtonInfo(ActionEvent event) {
        try{
            if (event.getSource() == buttonCC) {
                textfieldInfo.setText("Informació relacionada amb els Comptes Corrents");
            } else if (event.getSource() == buttonCE) {
                textfieldInfo.setText("Informació relacionada amb els Comptes d'Estalvis");
            }
        }catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }

}
