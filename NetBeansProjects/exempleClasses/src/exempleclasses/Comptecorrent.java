/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleclasses;

/**
 *
 * @author alumne
 */
public class Comptecorrent {
    // Definir Atributs
   public String numero;
   public double saldo;

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isBloquejat() {
        return bloquejat;
    }
   private boolean bloquejat;
   
   public Comptecorrent() {
       System.out.println("Compte creat");
       saldo = 1;
   }
    public Comptecorrent(String numero, double saldo){
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

