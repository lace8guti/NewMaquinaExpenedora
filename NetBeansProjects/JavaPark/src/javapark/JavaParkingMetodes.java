/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapark;

/**
 *
 * @author alumne
 */

import java.util.Scanner;

public class JavaParkingMetodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       
        String opcio;
        String [] places = {"","",""};
        
         //System.out.println( aparcar(places,"1"));  
         //System.out.println( aparcar(places,"2"));
        // System.out.println( aparcar(places,"3"));
          // System.out.println( aparcar(places,"4"));
         
        mostrarMenu();
        opcio = entraParaula();
        String matricula ;
       
        Scanner teclat = new Scanner(System.in);
        while(!opcio.equals("fi")) {
            
            switch(opcio) {
                case "aparcar":
                   
                    System.out.println("Entra matricula");
                   matricula=teclat.nextLine();
                    // ...
                    aparcar(places,matricula);
                    break;
                case "desaparcar":
                   
                    System.out.println("Entra matricula");
                   matricula=teclat.nextLine();
                   //..
                   desaparcar(places,matricula);
                    break;
                // altres
                // ....
                default:
                    System.out.println("Opcio incorrecta!!");
            }
            mostrarMenu();
            opcio = entraParaula();
        }
        
    }
    
    

    //un mètode per mostrar el menú d'opcions:  
    public static void mostrarMenu() {
        System.out.println("Entra la opció d'aparcar o desaparcar");
    
    }
    
    //Un mètode per entrar per teclat una paraula
    // El mètode preguntarà a l'usuari per teclat un String
    public static String entraParaula() {
        Scanner teclat = new Scanner(System.in);
        String opcio;
        System.out.println("Entra opcio:");
        opcio=teclat.nextLine();
    
                    
        return opcio;
    }
    
    
    // un mètode per aparcar
    // Retorna cert si s'ha pogut aparcar el cotxe. Hi ha lloc. Es guarda la matrícula dins el lloc lliure.
    // retorna fals si no s'ha pogut aparcar. No hi ha lloc
    public static void opcio() {
    
}
    public static boolean aparcar(String places[], String matricula) {
       
        int i=0;
        while(i<places.length) {
            if (places[i].equals("")==true) {
                System.out.println("Hi han llocs disponibles");
                places[i]=matricula;
                 return true;

            }
           
                
                
            
            
       
                
           i++;
        }
        System.out.println("No hi han places disponibles");
        return false;
    
    }
    
    // un mètode per desaparcar
    // Retorna cert si s'ha trobat la matricula dins el pàrquing. Es deixa la plaça buida.
    // Retorna fals en cas contrari.
    public static boolean desaparcar(String places[], String matricula) {
         int i=0;
        while(i<places.length) {
            
                if (places[i].equals(matricula)) {
                      System.out.println("Pots desaparcar");                
                     places[i]="";  
                     return true;
                
            }               
        i++;
      }
    
             
         System.out.println("No he trobat la matricula");
         return false;
                        
    }
    

}
    
    
    
        
        
        
    
   
    



