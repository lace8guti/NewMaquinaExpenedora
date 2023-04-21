package com.mycompany.parking;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    ListView listview;
    @FXML
    TextField matricula;
    @FXML
    RadioButton cotxeRadio;
    @FXML
    RadioButton motoRadio;
    @FXML
    RadioButton furgonetaRadio;
    
    
    
    private parking parking = new parking(10);
    
    public void initialize() {
        //TODO
        listview.getItems().setAll(parking.getPlaces());
        
    }
    
    @FXML
    public void desaparcar(){        
        int index = listview.getSelectionModel().getSelectedIndex();
        if (index!=-1) {
            
        }
    }
    
    @FXML
    public void aparcar(){
        
        if (! matricula.getText().equals("")) {
            vehicle vehicle = null ;
            if (cotxeRadio.isSelected()) {
                
            vehicle = new cotxe();
            
            }
            else if (motoRadio.isSelected()) {
                 vehicle = new motocicleta();
            }    
            else {
                vehicle = new furgoneta();
            }
            
            
            
            vehicle.setMatricula(matricula.getText());
            parking.aparcar(vehicle);
            
            listview.refresh();
        }
    }
}

