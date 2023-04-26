/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectecaixerautomlucas;

/**
 *
 * @author alumne
 */
public class CompteCorrent {
    private String numero;
    private double saldo;
    private boolean bloquejat;
    private Client client;
    //cuando un atrib es static, significa que este atrib no se creará por cada uno de los objetos, será compartido
    //por todos los objetos de la clase
    static int comptador= 0;
    static final String  format ="ES59348509834058-";
    
    //normalmente declararemos todos los atributos de forma privada
    
    //CONSTRUCTOR VAMOOOOOOOOOOOOOOOOOOOOS INSERT CODE->CONSTRUCTOR

    public CompteCorrent() {
        System.out.println("compte creat");
        saldo=1;
    }

    public CompteCorrent(String numero, double saldo) {
        //this.ATRIBUTO DE LA CLASE = LO QUE ME APETEZCA
        this.numero = numero;
        this.saldo = saldo;
        this.bloquejat=false;
        //no se puede utilizar el this con un atributo static
        comptador=comptador+1;
        
    }

    public CompteCorrent(double saldo) {
        comptador=comptador+1;
        this.numero = format + comptador;
        this.saldo = saldo;
        this.bloquejat=false;
    }    
    
    public void ingressar(double quantitat){
        if(this.bloquejat==false)
            this.saldo=this.saldo + quantitat;
    }
    
    public boolean treure(double quantitat){
        if(this.saldo>=quantitat){
            this.saldo=this.saldo-quantitat;
            return true;
        }
        return false;
    }
    
    //getter y setter
    
    //get lo que hace es devolver un atributo de la clase
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    //cuando el getter es boolean, se llama is"..."()
    public boolean isBloquejat() {
        return bloquejat;
    }

    public void setBloquejat(boolean bloquejat) {
        this.bloquejat = bloquejat;
    }

    public void transferencia(CompteCorrent cc2, int quantitat) {
        if(this.treure(quantitat))
            cc2.ingressar(quantitat);
    }

    @Override
    public String toString() {
        return "CompteCorrent{" + "numero=" + numero + ", saldo=" + saldo + ", bloquejat=" + bloquejat + ", client=" + client + '}';
        
    
      
        
    }
    
    public static void mostrarOficina(){
        System.out.println("Oficina 100");
    }  
}
