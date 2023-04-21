/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loteria;

import com.mycompany.loteria_1.Loteria;

/**
 *
 * @author alumne
 */
public class ProjecteLoteria {

    public static void main(String[] args) {
       

        // Creo un objecte de la classe Loteria
        Loteria loto = new Loteria();       
       
        
        // Deso en un array els números als que aposto
        int[] apostes = {2,12,25,34,36,26};
        // faig l'aposta
        if(!loto.setApostes(apostes)) {
            System.out.println("Hi ha errors en la teva aposta!!");
            return;
        }
        
        // Comença el sorteig!!! Bona sort!;        
        loto.sortejar();
        
        // Recupero el número d'encerts
        int encerts = loto.numeroEncerts();
        System.out.println("N'he encertat "+ encerts);
        
        // Vull saber quins números han estat els agraciats
        System.out.println("Els números sorteig han estat:");
        int[] resultats = loto.getAleatoris();
        for(int i=0; i<resultats.length;i++) {
            System.out.print(resultats[i]+" ");
        }

    }
}
