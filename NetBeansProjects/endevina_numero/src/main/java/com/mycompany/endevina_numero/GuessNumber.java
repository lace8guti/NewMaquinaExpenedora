package com.mycompany.endevina_numero;


import java.util.Random;

/**
 *
 * @author professor
 */
public class GuessNumber {
    private int numeroAleatori; // Número aleatori generat
    private int minValor; // valor mínim que pot tenir l'aleatori
    private int maxValor; // valor màxim que pot tenir l'aleatori

    public int getMinValor() {
        return minValor;
    }

    public void setMinValor(int minValor) {
        this.minValor = minValor;
    }

    public int getMaxValor() {
        return maxValor;
    }

    public void setMaxValor(int maxValor) {
        this.maxValor = maxValor;
    }
    private String missatge; // Guardarà el missatge que es  mostrarà a l'usuari cada cop que es comprovi un número

    private int maxIntents; // Màxim intents per endevinar el número    
    private int intents;
    
    public int getIntents(){
        return maxIntents- intents;
    }
    
    // Getters per als atributs que poden ser consultats des de fora de la classe
    // Tots excepte numeroAleatori

    public String getMissatge() {
        return missatge;
    }
    

    /* Mètode generarAleatori
     *   @return  retorna un número comprès entre les atributs minValor i maxValor
     */
    private int generarAleatori() {
        Random generador = new Random();
        int numero = generador.nextInt(this.maxValor-this.minValor+1)+this.minValor;
        return numero;
    }
    
    
    // Diferents constructors

    // Constructor Sense paràmetres
    // El valor aleatori generat estarà entre 1 i 100
    public GuessNumber() {
       this.minValor = 1;
       this.maxValor = 100;
       this.maxIntents = 10;
       this.intents = 0;
       this.numeroAleatori = this.generarAleatori();
        missatge ="He pensat un número entre "+ minValor
                +" i "+maxValor;
        //System.out.println(this.numeroAleatori);
    }

    // Constructor per posar valors a minim i maxim
    // D'aquesta forma podem fer que endevinar el número ens consti més intents!
    public GuessNumber(int minim, int maxim) {
      this.minValor = minim;
      this.maxValor = maxim;
      this.maxIntents = 10;
      this.intents = 0;
      this.numeroAleatori = this.generarAleatori();
      missatge ="He pensat un número entre "+ minValor
                +" i "+maxValor;
    }

    public GuessNumber(int minim, int maxim,int maxIntents) {
      this.minValor = minim;
      this.maxValor = maxim;
      this.maxIntents = maxIntents;
      this.intents = 0;
      this.numeroAleatori = this.generarAleatori();
      missatge ="He pensat un número entre "+ minValor
                +" i "+maxValor;
    }

    /** Mètode comprova, mira si s'ha encertat el número passat per paràmetre
     * @param numero: Número que volem comprovar si hem encertat o no.
     * @return Si no l'hem encertat retorna false. Si l'hem encertat retorna true.
     * En missatge s'hi guardarà "has guanyat, el número cercat era ..", "El numero que he pensat és més petit ..." o "El núemero que he pensat  és més gran..."
     */
    public boolean comprova(int numero) {
       
       
       
       if(numero==this.numeroAleatori) {
           this.missatge = "Has guanyat";
           return true;
       }
       
       this.intents++;
       if(this.intents==this.maxIntents) {
           this.missatge = "Has perdut";
           return true;
       }
       
       if(numero>this.numeroAleatori) {
            this.missatge = "El número ha endevinar és més petit";
       }
       else {
            this.missatge = "El número ha endevinar és més gran";
       }
      
       
       return false;

    }

    /** Mètode reiniciar()
     * Permet regenerar el número aleatori per si es vol tornar a jugar
     */
    public void reiniciar() {
        this.numeroAleatori = generarAleatori();
        missatge ="Joc Nou: He pensat un número entre "+ minValor
                +" i "+maxValor;
    }

}