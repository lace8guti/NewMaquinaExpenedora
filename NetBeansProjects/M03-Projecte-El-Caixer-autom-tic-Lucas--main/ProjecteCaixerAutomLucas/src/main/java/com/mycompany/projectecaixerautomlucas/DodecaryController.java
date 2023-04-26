
package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/**
 *
 * @author alumne
 */

// Controlador de canvio de contraseña

public class DodecaryController {
    
    @FXML
    Text textCanviarClau;
    
    @FXML
    Button textClauActual;
    
    @FXML
    Button textClauNova;
    
    @FXML
    Button buttonSortir;
    
    @FXML
    TextField textfieldClauActual;
    
    @FXML
    TextField textfieldClauNova;
    
    @FXML
    Button buttonCanviarClau;
    
    //función para volver al menú
    @FXML
    private void Sortir() throws IOException {
        
        App.setRoot("secondary");
    
    /*
    //función para ir al menú de retirar diners
    @FXML
    private void switchToRetirarDiners() throws IOException {
        
        App.setRoot("secondary");
    }
    
    //función para ir al menú d'ingressar diners
    @FXML
    private void switchToIngressarDiners() throws IOException {
        
        App.setRoot("secondary");
    }
    
    //función para ir al menú de consultar saldo
    @FXML
    private void switchToConsutarSaldo() throws IOException {
        
        App.setRoot("secondary");
    }
    
    
    */
    //TODO
    /*
    //función que si aceptas:
    //1. Lee los datos de la cuenta que estás borrando (los que le han enviado desde SeptaryController)
    //2. Borra la entrada del ArrayList de la cuenta que se está borrando
    //3. (OPCIONAL) envía los datos a través de formulario y los guarda en la BBDD
    // si cancelas:
    //1. Cierra la ventana.
    
    */
    
    }
    

}
