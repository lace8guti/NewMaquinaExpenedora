/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleclasses;

/**
 *
 * @author alumne
 */
public class ExempleClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Comptecorrent cc = new Comptecorrent("1111111111",344.45);
              
        
        cc.numero = "1111111111";
        cc.saldo = 344.45;
        
        System.out.println(cc.numero+" "+ cc.saldo);
        
        Comptecorrent cc2 = new Comptecorrent();
        cc2.numero = "2222222";
        cc2.saldo = 444;
        System.out.println(cc2.numero+" "+cc2.saldo);
        
        Comptecorrent cc3;
        cc3 = cc2;
        System.out.println(cc3.numero+" "+cc3.saldo);
        
        cc3.saldo = 100;
        System.out.println(cc2.numero+" "+cc2.saldo);
        
        
        System.out.println(cc);
        System.out.println(cc2);
        System.out.println(cc3);
        
        Comptecorrent cc4 = new Comptecorrent();
        System.out.println(cc4.saldo);
        
        Comptecorrent cc5 = new Comptecorrent("555555555" , 1000);
        System.out.println(cc5.numero+" "+cc5.saldo);
        cc5.ingressar(500);
        System.out.println(cc5.numero+" "+cc5.saldo);
        cc5.saldo = cc5.saldo *500;
        if (cc5.treure(100)){
        System.out.println("ok");
        
    }
        System.out.println(cc5.numero+" "+cc5.saldo);
    }

   
    }
    

