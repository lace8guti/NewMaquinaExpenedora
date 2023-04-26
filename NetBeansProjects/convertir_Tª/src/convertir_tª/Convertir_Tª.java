/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertir_tª;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Convertir_Tª {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        double Tª;
        int i = 0;
        
        while(i<5){
            System.out.println("Entra Tª");
         Tª=teclat.nextDouble();
            System.out.println("La Tª en Farenhait es:"+((Tª-32)*5)/9);
           i++;
            
        }
    }
    
}
