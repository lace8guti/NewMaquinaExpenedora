/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sou_antiguetat;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Sou_antiguetat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        int sou;
        System.out.println("Entra el sou");
        sou=teclat.nextInt();
        int antiguetat;
        System.out.println("Entra els anys d'antiguet");
        antiguetat=teclat.nextInt();
        if (sou<500&antiguetat>=10) {
            System.out.println("Aument del 20% "+"aument de "+(sou*0.2)+"euros");
            
        }
        if (sou<500&antiguetat<10) {
            System.out.println("Augment del 5% " +", " + "Augment de "+ (sou*0.05)+" euros ");
            
        }
        if (sou>500) {
            System.out.println("No toquem el sou "+ ","+ "Tindra un sou de:"+(sou)+" euros ");
            
        }
    }
    
}
