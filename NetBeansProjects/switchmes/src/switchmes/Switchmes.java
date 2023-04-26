/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchmes;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Switchmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        int mes;
        System.out.println("Entra numero del mes");
        mes=teclat.nextInt();
        switch(mes){
            case 1:
                System.out.println("31 dies");
                break;
            case 2:
                System.out.println("28 dies");
                break;
            case 3:
                System.out.println("31 dies");
                break;
            case 4:
                System.out.println("30 dies");
                break;
            case 5:
                System.out.println("31 dies");
                break;
            case 6:
                System.out.println("30 dies");
                break;
            case 7:
                System.out.println("31 dies");
                break;
            case 8:
                System.out.println("31 dies");
                break;
            case 9:
                System.out.println("30 dies");
                break;
            case 10:
                System.out.println("31 dies");
                break;
            case 11:
                 System.out.println("30 dies");
                 break;
            case 12:
                System.out.println("31 dies");
    }
        if (mes>12|mes<1) {
            System.out.println("ERROR entra un valor valid,només hi han 12 mesos");
            
        }
    }
    
}
