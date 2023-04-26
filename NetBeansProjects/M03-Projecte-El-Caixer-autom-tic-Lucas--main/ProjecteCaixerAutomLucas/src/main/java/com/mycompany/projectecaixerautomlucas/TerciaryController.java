package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

/*
* Controlador de la finestra de bloqueig d'inici de sessió
*
*/

public class TerciaryController {
    
    @FXML
    Button buttonComeBack;
    
    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
