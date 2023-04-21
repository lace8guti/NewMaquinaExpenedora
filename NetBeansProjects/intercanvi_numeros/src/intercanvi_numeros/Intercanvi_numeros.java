/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intercanvi_numeros;

/**
 *
 * @author alumne
 */
public class Intercanvi_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int a = 10;
        int b = 20;
        int temp;
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("Valor de a: "+ a);
        System.out.println("Valor de b: "+ b);
    }
    
}
