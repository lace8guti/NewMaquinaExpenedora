import java.util.Random;

public class GuessNumber {

    protected int numeroAleatori; // Número aleatori generat
    private int minValor; // valor mínim que pot tenir l'aleatori
    private int maxValor; // valor màxim que pot tenir l'aleatori
    protected String missatge; // Guardarà el missatge que es  mostrarà a l'usuari cada cop que es comprovi un número
private int maxIntents
    // Getters per als atributs que poden ser consultats des de fora de la classe
    // Tots excepte numeroAleatori

    /* Mètode generarAleatori
     *   @return  retorna un número comprès entre les atributs minValor i maxValor
     */
    private int generarAleatori() {
        Random generador = new Random();
        int numero = generador.nextInt(this.maxValor-this.minValor)+this.minValor;
        return numero;
    }
    
    
    // Diferents constructors

    // Constructor Sense paràmetres
    // El valor aleatori generat estarà entre 1 i 100
    public GuessNumber() {
        
       this.minValor=minim;
       this.maxValor=maxim;
       this.maxIntents

    }

    // Constructor per posar valors a minim i maxim
    // D'aquesta forma podem fer que endevinar el número ens consti més intents!
    public GuessNumber(int minim, int maxim) {
      
this.minValor = minim;
this.maxValor =maxim;
    }

   

    /** Mètode comprova, mira si s'ha encertat el número passat per paràmetre
     * @param numero: Número que volem comprovar si hem encertat o no.
     * @return Si no l'hem encertat retorna false. Si l'hem encertat retorna true.
     * En missatge s'hi guardarà "has guanyat, el número cercat era ..", "El numero que he pensat és més petit ..." o "El núemero que he pensat  és més gran..."
     */
    public boolean comprova(int numero) {
        if (numero==this.numeroAleatori) {
           this.missatge= "Has guanyat";
           return true;
        }
        
       this.intents++;
        if (this.intents==this.maxIntents) {
            
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



