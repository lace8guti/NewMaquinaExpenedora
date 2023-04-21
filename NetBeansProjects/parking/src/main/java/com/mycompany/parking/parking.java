/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parking;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alumne
 */
public class parking {

     private plaça[] places;

    int numPlacesOcupades;
    static final double PREU_MINUT = 3;

    public plaça[] getPlaces() {
        return places;
    }
    
   

 public parking(int maxPlaces) {
        
       places = new plaça[maxPlaces];

        System.out.println(places.length);
        
        
     for (int i = 0; i < places.length; i++) {
         plaça p = new plaça();
         p.setNumero(i);
         p.setUbicació("Primera planta");
         
         places[i] = p;
         
         
     }
 
      for (int i = places.length/2; i < places.length; i++) {
         plaça p = new plaça();
         p.setNumero(i);
         p.setUbicació("Segona planta");
         
         places[i] = p;
         
         
     }

    }
 
 public boolean aparcar(vehicle vehicle){
     for(int i=0;i<places.length;i++){
         if (!places[i].isOcupada()) {
             vehicle.setDataHoraEntrada();
             places[i].setVehicle(vehicle);
             this.numPlacesOcupades++;
             return true;         
             
             
         }
       
     }
     return true;
 }
 
 
 
 public double desaparcar(String matricula) {
     return 0;
 }
 
 public double desaparcar(int codi){
     return 0;
 }
 void llistat(){
     
 }
 
 public int numPlacesLliures(){
     return places.length;
 }

 

}
