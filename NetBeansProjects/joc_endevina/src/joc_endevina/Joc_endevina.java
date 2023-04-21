/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joc_endevina;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Joc_endevina {

    private static int numeroAleatori;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int num= Joc_endevina.numeroAleatori;
        //Joc_endevina.generarAleatori;
        GuessNumber jocEndevina = new GuessNumber(1,200);


        Scanner teclat = new Scanner(System.in);
        int numero;


        // Mentre no acabi el joc: No s'endevini el número
        System.out.println(jocEndevina.getMissatge());
        boolean fiJoc = false;
        while(!fiJoc) {
            // Es demana per teclat un número
            System.out.println("Entra un número:");
            numero = teclat.nextInt();
            // Es comprova si s'ha endevinat o no i es mostra el missatge
            // segons l'estat del joc.
            fiJoc = jocEndevina.comprova(numero);
            System.out.println(jocEndevina.getMissatge());
        }
    }
}
    
    

