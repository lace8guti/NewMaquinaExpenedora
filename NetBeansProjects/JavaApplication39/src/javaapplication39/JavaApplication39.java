/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner(System.in);;
        int i=0;
        char lletra='a';
       
        while(i<10){
            System.out.println("entra una lletra");
            lletra=teclat.next().charAt(0);
            if (lletra>=97  && lletra<=122) {
                System.out.println("Lletra minuscula");
                
            }
            else if (lletra>64  && lletra<91) {
                System.out.println("lletra majuscula");
                
            }
            else{
                System.out.println("no es una lletra");
            }
            i++;
            
        }
    }
    
}
