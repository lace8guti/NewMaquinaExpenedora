
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

// Ventana emergente en caso de intento de eliminar una cuenta corriente

public class NonaryController {
    
    @FXML
    Text textEliminar;
    
    @FXML
    Button buttonAceptar;
    
    @FXML
    Button buttonCancelar;
    
    //función para volver al menú
    @FXML
    private void switchToSecondary() throws IOException {
        
        App.setRoot("secondary");
    }
    
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
