
package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
/**
 *
 * @author alumne
 */

//Controlador de la finestra per consultar el saldo d'un usuari del banc
public class QuartaryController {
    
    
    @FXML
    Button buttonComeBack;
    
    @FXML
    Text textSaldoTotal;
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
}
