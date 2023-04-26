package com.mycompany.projectecaixerautomlucas;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/*
* Controlador de la finestra d'inici de sessió
*
*/

public class PrimaryController {
    
    /*TODO
    * 
    * 1. Gestionar los usuarios con nombresUsuario y contraseñasUsuario
    * 2. Gestionar el tema de los intentos con un contador y un timmer de timeout de 1 hora.
    */
    
    @FXML
    TextField textfieldUser;
    
    @FXML
    TextField textfieldPassword;
    
    @FXML
    Text textInfo;
    
    @FXML
    Button buttonAccept;
    
    /*
    @FXML
    void initialize(){
        System.out.println(App.nom);
        App.nom="Carles";
    }
    */
    
    @FXML
    public void iniciarSessio(){
        
        //comptador d'errors
        int comptadorErrors=0;
        boolean correcte =false;
        //nom de l'usuari que vol iniciar sessió
        String nomUsuariEntrat = textfieldUser.getText();
        
        //contrasenya de l'usuari que vol iniciar sessió
        String passwordEntrat = textfieldPassword.getText();
        
        /*try-catch per tractar d'iniciar sessió
        *si usuari i contrasenya concorden: inicia sessió i t'envia a secondary controller
        *si l'usuari i contrasenya no concorden: t'envia a terciary controller
        *
        */
        try{
        {
            if(!nomUsuariEntrat.equals("lucas") 
               &&
               !passwordEntrat.equals("hola")){
                comptadorErrors++;
                textInfo.setText("patata "+comptadorErrors);
            }else if(nomUsuariEntrat.equals("lucas") 
                    &&
                    passwordEntrat.equals("hola")){
                    App.setRoot("secondary");
            }
            
            if(comptadorErrors==1){
                correcte=true;
            }
        }
        
        if(correcte==true){
            App.setRoot("terciary");
        }
        }catch(Exception e){
            textInfo.setText("L'execució de l'inici de sessió és incorrecte");
        }
        
        /*
        try{
            //en cas que comptadorErrors<3, username i contra incorrectes -> Missatge d'error
            if(!nomUsuariEntrat.equals("lucas") 
               &&
               !passwordEntrat.equals("hola")
              ){
                // afegim 1 a comptadorErrors
                comptadorErrors++;
                textInfo.setText("patata"+comptadorErrors);
               }
            //en cas que comptadorErrors=3 i que s'intenti iniciar sessió, t'enviarà a TerciaryController  
            else if(!nomUsuariEntrat.equals("lucas") 
                    &&
                    !passwordEntrat.equals("hola")
                    &&  
                    comptadorErrors==3    
                    ){
                    //t'envia a TerciaryController
                    App.setRoot("terciary");
                    }
            //en cas que comptadorErrors<3 i que s'intenti iniciar sessió, t'enviarà a SecondaryController
            else if(nomUsuariEntrat.equals("lucas") 
                    &&
                    passwordEntrat.equals("hola")
                    &&  
                    comptadorErrors<3){
                    //t'envia a SecondaryController
                    App.setRoot("secondary");
            }        
        }
        catch(Exception e){
            textInfo.setText("L'execució de l'inici de sessió és incorrecte");
        }
        */
        }
        /*
        try{
            if(nomUsuariEntrat.equals("lucas")
            && passwordEntrat.equals("hola")){
                
                //control
                if(nomUsuariEntrat.equals("")){
                    textInfo.setText("El nom d'usuari és buit");
                }
                
                //t'envia a SecondaryController
               App.setRoot("secondary");
               
              
               
            }else{
                
               
              App.setRoot("terciary");
            }
        }catch(Exception e){
            textInfo.setText("L'execució de l'inici de sessió és incorrecte");
        }
       */ 
    
    
    /*
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    */
}
