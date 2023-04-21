/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

/**
 *
 * @author alumne
 */
public class plaça {
    private int numero;
     private String ubicació;
     
     private vehicle vehicle;
     
     public boolean isOcupada(){
         if (vehicle==null) return false;{
         return true;
     
             
         }
     }
     
     
     @Override
    public String toString() {
        if(this.isOcupada())
            return numero+" "+ this.vehicle.getMatricula();
        else return numero+" lliure";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicació() {
        return ubicació;
    }

    public void setUbicació(String ubicació) {
        this.ubicació = ubicació;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(vehicle vehicle) {
        this.vehicle = vehicle;
    }
    

}
       
        
        
    
      
        
    
    
    
