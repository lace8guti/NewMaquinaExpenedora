
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

// Controlador de eliminación de cuentas corrientes

public class SeptaryController {
    
    @FXML
    ListView listviewComptes;
    
    @FXML
    Button buttonEliminarCompte;
    
    @FXML
    Button buttonSortir;
    
    
    //función para volver al menú
    @FXML
    private void switchToSecondary() throws IOException {
        
        App.setRoot("secondary");
    }
    
    //TODO
    /*
    
    //función que comprueba las cuentas que tienes creadas y las muestra en el listview
    //@FXML
    
    
    //función que comprueba la cuenta que has seleccionado para borrar, si contiene dinero, 
    //no te permite borrarla y te avisa de que no puedes borrarla y del dinero que te queda en ella
    //@FXML
    
    //función que abre una ventana emergente que te pregunta si quieres borrar la cuenta o no,
    // (envía datos a través de formulario)
    //@FXML
    
     y te borra 
    //lo que habías escrito
    //@FXML
    
    */
    
    
    

}
