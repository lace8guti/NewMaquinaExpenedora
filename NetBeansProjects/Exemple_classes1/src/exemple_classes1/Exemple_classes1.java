/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple_classes1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author alumne
 */
public class Exemple_classes1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cotxes = new ArrayList<String>();
        cotxes.add("Volvo");
        cotxes.add("Peugot");
        cotxes.add("BMW");
        cotxes.add("Seat");
        System.out.println(cotxes.get(0));
        System.out.println(cotxes.get(3));
        
        cotxes.set(0,"Ferrari");
        System.out.println(cotxes.get(0));
        
        System.out.println(cotxes);
        for (int i = 0; i <cotxes.size(); i++) {
            System.out.println(cotxes.get(i));
            
        }
        
        cotxes.remove(0);
        System.out.println(cotxes);
        cotxes.remove("seat");
        System.out.println(cotxes);

cotxes.clear();
        System.out.println(cotxes);
        
        Comptecorrent cc = new Comptecorrent(344.45);
        System.out.println(cc.getNumero()+" "+cc.getSaldo());  
        cc.setSaldo(500);
        
        
        Comptecorrent cc1 = new Comptecorrent(1);
        Comptecorrent cc2 = new Comptecorrent(1);
        Comptecorrent cc3 = new Comptecorrent(1);
        Comptecorrent cc4 = new Comptecorrent(1);
        Comptecorrent cc5 = new Comptecorrent(1);
       // System.out.println(cc2.getNumero()+" "+cc2.getSaldo());
       // cc.transferencia(cc2,100);
        ArrayList<Client> clients2 = new ArrayList<Client>();
        Client.add  = new Client("Joan", "Garcia Moreno", cc1,3);
        Client.add = new Client("Joan", "Garcia Moreno", cc1,3);
         Client.add = new Client("Joan", "Garcia Moreno", cc1,3);
          Client.add  = new Client("Joan", "Garcia Moreno", cc1,3);
           Client.add = new Client("Joan", "Garcia Moreno", cc1,3);
        
        
        
        
        
        
        
        
        
        
       // Client[] clients = {
       Client cli1 = new Client("Joan", "Garcia Moreno", cc1,3);
        Client cli2 = new Client("Joan", "Garcia Moreno", cc1,3);
         Client cli3 = new Client("Joan", "Garcia Moreno", cc1,3);
          Client cli4 = new Client("Joan", "Garcia Moreno", cc1,3);
           Client cli5 = new Client("Joan", "Garcia Moreno", cc1,3);
           
           Client[] clients =new Client[5];
           clients[0] = cli1;
            clients[1] = cli2;
             clients[2] = cli3;
              clients[3] = cli4;
               clients[4] = cli5;
              
               
               Banc banc = new Banc("banc@banc.com",clients);
               banc.afegirClient("Eva","Naranjo Olivar");
               banc.afegirClient("Santiago","Naranjo Olivar");
               banc.llistaClients();
               
               System.out.println(banc.getClients()[0].getCc().getSaldo());
                   
       
        System.out.println(cli1);
        System.out.println(cli1.getCc().getSaldo());
        Comptecorrent ccCli1 = cli1.getCc();
        double saldo =ccCli1.getSaldo();
        System.out.println(Comptecorrent.comptador);
    }

    private static class client {

        public client() {
        }
        void elTemps() {
            System.out.println("Fa fred!!!");
        }
        static void salutacio(){
            System.out.println("hola!!!");
        }
      
         
    }
    
    
}
