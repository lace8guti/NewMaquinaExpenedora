
package com.mycompany.projectecaixerautomlucas;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/**
 *
 * @author alumne
 */

// Controlador de creación de cuentas corrientes

public class SextaryController {
    
    @FXML
    Text textCrearCompte;
    
    @FXML
    Text textNomCompte;
    
    @FXML
    Button buttonCrear;
    
    @FXML
    Button buttonSortir;
    
    @FXML
    TextField textfieldCrearCompte;
    
    
    
    //función para volver al menú
    @FXML
    private void switchToSecondary() throws IOException {
        
        App.setRoot("secondary");
    }
    
    //TODO
    /*
    //crear clase cuentaBancaria con dos hijas (extends cuentaCorriente y cuentaAhorros).
    
    //función que comprueba las cuentas que tienes creadas y valida el nombre de la cuenta o lo deniega
    //@FXML
    
    
    //función que genere una ventana emergente que te pregunte si quieres crear la cuenta o no
    //si aceptas, la crea; si cancelas, no la crea, cierra la ventana emergente y borra el texto
    //que habías escrito
    //@FXML
    
    
    */
    
    
    

}
