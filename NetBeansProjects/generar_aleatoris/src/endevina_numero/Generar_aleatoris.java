/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endevina_numero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Generar_aleatoris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        int num;
        System.out.println("Entra numero entre 1 i 10");
        num=teclat.nextInt();
        Random generadorAleatoris = new Random();
        int numero=generadorAleatoris.nextInt(9)+1;
        System.out.println("El numero generat es:"+numero);
           if (num==numero) {
               System.out.println("Has encertat el numero");
            
        }
           else{
               System.out.println("Segueix intentant-ho");
           }
            
    }
    
}
