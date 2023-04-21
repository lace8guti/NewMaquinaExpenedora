/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

import static com.mycompany.parking.parking.PREU_MINUT;

/**
 *
 * @author alumne
 */
public class cotxe extends vehicle {
    private double descompte=0.1;
       public  cotxe(){
           descompte = 0.1;
        
    }
    public double getdescompte() {
    
        return descompte;
    
}
    public void setdescompte(double descompte){
        
        this.descompte = descompte;
        
    }

    @Override
    public double calcularPreu() {
        return super.calcularPreu()*(1-descompte);
    }
    
    
    
   
    
    
}
  
        
        
    
   