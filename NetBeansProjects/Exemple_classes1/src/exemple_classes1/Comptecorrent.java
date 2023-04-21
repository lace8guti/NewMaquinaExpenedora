/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple_classes1;

/**
 *
 * @author alumne
 */
class Comptecorrent {

   private String numero;
   private double saldo;
   private boolean bloquejat;
   private Client client;
   static int comptador = 0;
   static String format = "ES430011006363-";
   public static void mostraOficina(){
       System.out.println("oficina 100");
   }
   

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
   
   
   public Comptecorrent() {
       System.out.println("Compte creat");
       saldo = 1;
   }
   public Comptecorrent( double saldo){
       comptador=comptador +1; 
       this.numero = format + comptador;
        this.saldo= saldo;
        this.bloquejat = false;
        
    }
   
    public Comptecorrent(String numero, double saldo){
        this.numero = numero;
        this.saldo= saldo;
        this.bloquejat = false;
        comptador=comptador +1;
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

    @Override
    public String toString() {
        return "Comptecorrent{" + "numero=" + numero + ", saldo=" + saldo;
                
    }
    
    

}



