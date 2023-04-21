/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tens_febre;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Tens_febre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclat=new Scanner (System.in);
        int Tª=0;
        
        System.out.println("Entra la Tª");
        Tª=teclat.nextInt();
        if (Tª>=38) {
            System.out.println("Tens febre,has d'anar a casa a recuperarte");
            
        }
        else{
            System.out.println("Estás perfectament!!");
        }
        
    }
    
}
