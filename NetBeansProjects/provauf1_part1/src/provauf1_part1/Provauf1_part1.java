/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provauf1_part1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Provauf1_part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat = new Scanner(System.in);
        System.out.println("Comença la marato");
        //Indicarem el text que volem que aparegui
        int i=0;
        
      String [] participants= {"Joan García","Anna Sants","Pere Gras","Manel Rodríguez","Sergi Fernández","Alicia Sanmillan","Jordi Gómez","Santiago Capilla","Carlos Sanchez","Pau Jardi"};
    int dorsal = 0;
    //Ficarem les variables que ens interesi per iniciar el programa
   
    
    while(i<participants.length){
        System.out.println("En la posicio 1 entra el participant amb dorsal nº?");
        dorsal=teclat.nextInt();
        System.out.println(participants[i]+"amb dorsal nº"+ dorsal+"ha fet un temps de");
            var temps= System.currentTimeMillis();
            System.out.println(temps);
            i++;
            //Entrem el nº de dorsal i també veurem el nom del participant
            // Apart aqui ens deuria apareixer el temps pero no me n'he sortit
        
    }
        if (dorsal>15) {
            System.out.println("Abandona");
            //Farem una condicio que si el dorsal es mes gran de 15 no acabara la cursa
        }
        
    }
    
    }
    

