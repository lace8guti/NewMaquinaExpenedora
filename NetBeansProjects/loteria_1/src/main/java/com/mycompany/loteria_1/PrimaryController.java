package com.mycompany.loteria_1;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PrimaryController {
    
    private loteriareintegrament loto;
    
    public  PrimaryController(){
        
        loto= new loteriareintegrament();
    }
    @FXML
    TextField entrada1Txt;
    @FXML
    TextField entrada2Txt;
    @FXML
    TextField entrada3Txt;
    @FXML
    TextField entrada4Txt;
    @FXML
    TextField entrada5Txt;
    @FXML
    TextField entrada6Txt;
    @FXML
    TextField sortida1Txt;
    @FXML
    TextField sortida2Txt;
    @FXML
    TextField sortida3Txt;
    @FXML
    TextField sortida4Txt;
    @FXML
    TextField sortida5Txt;
    @FXML
    TextField sortida6Txt;
    @FXML
    Label missatgeLbl;
    @FXML
    Button comprovarResultatBtn;
    @FXML
    Button realitzarSorteigBtn;
    
    @FXML
    TextField complementariTxt;
    
    public void realitzarSorteig(){
        int[] aleatoris= loto.getAleatoris();
        sortida1Txt.setText(""+ aleatoris[0]);
        sortida2Txt.setText(""+ aleatoris[1]);
        sortida3Txt.setText(""+ aleatoris[2]);
        sortida4Txt.setText(""+ aleatoris[3]);
        sortida5Txt.setText(""+ aleatoris[4]);
        sortida6Txt.setText(""+ aleatoris[5]);
        
        comprovarResultatBtn.setDisable(true);
        realitzarSorteigBtn.setDisable(false);
        missatgeLbl.setText("Has encertat "+ loto.numeroEncerts()+" números.");
    }
    
    public void comprovarResultat() {
        int[] entrades= new int[6];
        try {
         entrades[0] = Integer.parseInt(entrada1Txt.getText());
         entrades[1] = Integer.parseInt(entrada2Txt.getText());
         entrades[2] = Integer.parseInt(entrada3Txt.getText());
         entrades[3] = Integer.parseInt(entrada4Txt.getText());
         entrades[4] = Integer.parseInt(entrada5Txt.getText());
         entrades[5] = Integer.parseInt(entrada6Txt.getText());
         
            if (!loto.setApostes(entrades)) {
             missatgeLbl.setText("Aposta incorrecta!");   
                
            }
            else{
                realitzarSorteigBtn.setDisable(false);
                comprovarResultatBtn.setDisable(true);
                loto.sortejar();
            }
        }catch (Exception e) {
          missatgeLbl.setText("Algun número és incorrecte");  
        }
    }
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
