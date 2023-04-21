/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple_classes2;

/**
 *
 * @author alumne
 */
public class Exemple_classes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        compteCorrent cc = new compteCorrent("1111111111",344.45);
        System.out.println(cc.getNumero()+" "+cc.getSaldo());  
        cc.setSaldo(500);
        
        
        compteCorrent cc2 = new compteCorrent("2222222222",444);
        System.out.println(cc2.getNumero()+" "+cc2.getSaldo());
        cc.transferencia(cc2,100);
        
        compteCorrent cc3 = new CompteCorrent ("22222222",444);
        compteCorrent cc4 = new CompteCorrent ("22222222",444);
        
        compteCorrent[] llistaCC = new compteCorrent[4];
        llistaCC[0] =cc;
        llistaCC[1] =cc2;
        llistaCC[2] =cc3;
        llistaCC[3] =cc4;
       
       
        
  
        }
    }
    

    
    

