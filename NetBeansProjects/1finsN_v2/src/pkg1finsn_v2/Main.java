/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1finsn_v2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);
        int n;
        System.out.println("entra un numero");
        n=teclat.nextInt();
        int i = 1;
        while(i<n+1){
            System.out.println("El resultat es:"+i); 
             i=i+1;
        }
       
        
    }
    
}
