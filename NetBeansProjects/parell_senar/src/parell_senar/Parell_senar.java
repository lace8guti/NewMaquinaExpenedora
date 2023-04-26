/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parell_senar;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Parell_senar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
        System.out.println("Entra un numero");
        int num=0;
        num=teclat.nextInt();
        int senar=num%2;
        if (senar==1) {
            System.out.println("Es un numero senar");
        }
        else{
            System.out.println("Es un numero parell");
        }

           
        
    }
    
}
