/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act_reforç;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ACT_REFORÇ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        int num=0;
        System.out.println("Entra un numero");
        num=teclat.nextInt();
        int doble=(num*2);
        int triple=(num*3);
        System.out.println("El doble de "+ num +" es "+ doble);
        System.out.println("El triple de "+ num +" es "+triple);
        double velocitatkm_h=0;
        System.out.println("Entra una velocitat");
        velocitatkm_h=teclat.nextDouble();
        double velocitatm_s=((velocitatkm_h*0.2778));
        System.out.println("La velocitat en m/s serà "+velocitatm_s);
        int numero=0;
       System.out.println("Entra  numero");
         numero=teclat.nextInt();
        int cifra1=numero/100;
        int cifra2=(numero%100)/10;
        int cifra3=(numero%10);
        System.out.println("Les xifres son:"+cifra1+","+cifra2 +" i "+cifra3);
         
        
    }
    
}
