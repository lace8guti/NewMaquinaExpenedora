/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loteria_1;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class loteriareintegrament extends Loteria_1 {
    
    private int reintegrament;
    private int apostaReintegrament;

    public int getApostaReintegrament() {
        return apostaReintegrament;
    }

    public void setApostaReintegrament(int apostaReintegrament) {
        this.apostaReintegrament = apostaReintegrament;
    }

    public int getReintegrament() {
        return reintegrament;
    }

    public void setReintegrament(int reintegrament) {
        this.reintegrament = reintegrament;
    }
    @Override
    public void sortejar(){
        
        Random generador = new Random();
        
        this.reintegrament = generador.nextInt(9)+1;
        super.sortejar();
     }
    public boolean setApostes(int[] apostes, int valorReintegrament) {
        this.reintegrament = valorReintegrament;
        if (this.reintegrament<1 || this.reintegrament>9) return false; {
            
        }
       return super.setApostes(apostes);
    }
    
}
