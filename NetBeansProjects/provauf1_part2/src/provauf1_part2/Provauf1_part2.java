/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provauf1_part2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Provauf1_part2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclat = new Scanner(System.in);
        String [] monedes ={"Corona xeca","corona danesa","corona noruega","corona sueca","florí húngar","franc suís","lliura","lira turca","ruble rus"};
        String[] valor = {"24.31","7.44","10.33","10,82","406.17","0.98","0.87","19.29","63.03"};
        
        int[] con = new int[valor.length];
        int mon = 0;
         String  nom = null;
         int i = 0;
         int quant_mon_final;
         //Iniciem les nostres variables
         while(i<valor.length){
            System.out.println("Entra nom moneda partida");
            nom=teclat.nextLine();  
             System.out.println("Entra quantitat");
        mon=teclat.nextInt();
        //Ficarem el nom de la moneda que volem i la quantitat a convertir
             System.out.println("Entra nom moneda final");
             nom=teclat.nextLine();
             quant_mon_final=((mon*con[valor]);
            
        i++;
         }
    }
    
}
