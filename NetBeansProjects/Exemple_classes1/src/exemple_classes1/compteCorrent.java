/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple_classes1;

/**
 *
 * @author alumne
 */
public class compteCorrent {
    
    private String numero;
   private double saldo;
   private boolean bloquejat;
   private Client client;

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

    public boolean isBloquejat() {
        return bloquejat;
    }
   
   
   public compteCorrent() {
       System.out.println("Compte creat");
       saldo = 1;
   }
   
    public compteCorrent(String numero, double saldo){
        this.numero = numero;
        this.saldo= saldo;
        this.bloquejat = false;
    }
    
    public void ingressar(double quantitat) {
        if (this.bloquejat==false) 
        this.saldo = this.saldo + quantitat;
        
    }
    public boolean treure(double quantitat){
        if (this.saldo>=quantitat) {
            this.saldo = this.saldo - quantitat;
            return true;
            
        }
        return false;
    }
    public void transferencia(Comptecorrent cc2,int quantitat) {
        
        if (this.treure(quantitat)) 
            cc2.ingressar(quantitat);
            
       }
    

}




    

