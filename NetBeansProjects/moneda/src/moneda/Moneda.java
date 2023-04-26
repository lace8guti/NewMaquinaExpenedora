/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moneda;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Moneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        int cara = 0;
        
        Random generadorAleatoris = new Random();
        while(i<100){
            int moneda=generadorAleatoris.nextInt(2);
            System.out.println("cara o creu");
            System.out.println(moneda);
            i++;
              if (moneda==0) {
            cara++;
            
        }
             
        }
        System.out.println("nº cares i creus");
             System.out.println(cara);
             System.out.println(i-cara);
      
    }
    
}
