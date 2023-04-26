/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.maquinaexpenedora;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MaquinaExpenedora {

    public static void main(String[] args) {
        
    }
    private int saldo;
    private int quantitatProductes;

    public MaquinaExpenedora(int saldoInicial, int quantitatInicial) {
        saldo = saldoInicial;
        quantitatProductes = quantitatInicial;
    }
    /* Propongo que simular tres situaciones: 
    * 1. La quantitatProductes=0 -> La màquina ens ha de dir que ara mateix és buida i no pot vendre res.
    * 2. Si el preu>saldo -> La màquina ens ha de dir que el saldo és insuficient.
    * 3. 
    */
    
    public void realitzarCompra(int preu) {
      if (quantitatProductes == 0) {
    System.out.println("La màquina està buida i no pot vendre res.");
} else {
    saldo -= preu; // Resta el preu del producte al saldo del usuari
realitzarCompra( preu); // Crida a un métodoe per a  dispensar el producte

}

      if (preu > saldo) {
    System.out.println("Saldo insuficient, si us plau, recarregui el saldo.");
} else {
    if (saldo < preu) {
    System.out.println("Saldo insuficient, si us plau, recarregui el saldo.");
} else if (quantitatProductes == 0) {
    System.out.println("Ara mateix la màquina és buida i no pot vendre res.");
} else {
    saldo -= preu; // Resta el preu del producte al saldo del usuari
    quantitatProductes--; // Resta un a la quantitat de productes disponibles
    System.out.println("Compra realitzada.");
    realitzarCompra( preu); // Crida a un métode per a  dispensar el producte
}

}
      if (saldo >= preu) {
    System.out.println("Compra realitzada.");
   
} else {
    System.out.println("Saldo insuficient, si us plau, recarregui el saldo.");
    Scanner sc = new Scanner(System.in);
System.out.print("Introduïu la quantitat a recarregar: ");
double quantitatRecarrega = sc.nextDouble();

saldo += quantitatRecarrega; // Suma la quantitat de recàrrega al saldo del usuari
System.out.println("El saldo s'ha recarregat correctament. Saldo actual: " + saldo);

}



    }
    
    /* 
    * Método para restablecer la cantidad de productos que tiene la máquina,
    * sugiero utilizar quantitatProductes = quantitatInicial en este método, para actualizarla. 
    */
    public void reabastir(int quantitat) {
        int quantitatInicial = 0;
        quantitatProductes = quantitatInicial;
    System.out.println("La quantitat de productes s'ha restablert a " + quantitatInicial);

        
    }
    
     
    
    
}
