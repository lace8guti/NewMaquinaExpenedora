/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loteria;

import java.util.Random;
import java.util.Scanner;
import static loteria.LoteriaUF2.cercaNumero;

/**
 *
 * @author alumne
 */
public class LoteriaUF2 {

   
    public static void main(String[] args) {
        
        // Utilitzar les funcions implementades posteriorment per implementar el programa de la loteria:
        int[] apostes = new int [6];
        inicialitzarVectorDiferentsTeclat(apostes,1,49);
        mostrarArray(apostes);
        
        int[] sorteig = new int[6];
        inicialitzarVectorDiferentsAleatoris(sorteig,1,49);
        mostrarArray(sorteig);
        
        int encerts = numRepetitsVectors (apostes,sorteig);
        System.out.println("Has encertat" +encerts+" numeros");
        
        
        
            
        }
    
        // Un jugador fa una aposta de 6 números compresos entre 1 i 49 comprovant que els valors introduïts no estan repetits.
        // L'ordinador genera una combinació de loteria de 6 números diferents en el rang 1-49.
        // Visualitzar el resultat de la loteria i imprimir quants encerts ha fet el jugador.
        
        
    

    // Implementar una funció anomenada numeroAleatoriLoteria que 
    // retorni un enter aleatori comprès entre dos números passats per paràmetre     
    public static  int numeroAleatoriLoteria(int minim, int maxim) {
        
         Random random = new Random();
         int num = random.nextInt(maxim-minim+1)+minim;
         return num;
    }

    // Implementar una funció per mostrar el contingut d'un vector d'enters
    // en una mateixa línia
    // en el format: num1 num2 num3 ....
    public static void mostrarArray(int vector[]) {
        int i=0;
        while(i < vector.length){
            System.out.println(vector[i]+" ");
            i++;
        }
        System.out.println("");
        
    }
    // Implementar una funció anomenada cercaNumero 
    // que retorna cert si un número passat per paràmetre es troba dins d’un vector 
    // també passat per paràmetre.
    public static boolean cercaNumero(int numero, int vector[]) {
        int i=0;
        while(i<vector.length){
            if (vector[i] == numero) {
                
            }
        return true;
        }
        return false;
}

    // Implementar una funció que inicialitzi per teclat un vector de números de forma 
    // que tots siguin diferents.
    public static void inicialitzarVectorDiferentsTeclat(int vector[] ,int minim,int maxim) {
        
                Scanner teclat= new Scanner(System.in);
                int i=0;
                while(i<vector.length){
                    System.out.println("Entra numero");
                    int numero = teclat.nextInt();
                    if (numero>=minim && numero <=maxim) {
                        if (!cercaNumero(numero,vector)) {
                            vector[i] =numero;
                            i++;
                        }
                        else{
                            System.out.println("Aquest numer esta entrat");
                        }
                    }
                        else{
                                System.out.println("Numero incorrecte");
                                }
                            
                        }
                    }
                        
                    
                

        
       

    // Implementar una funció que inicialitzi aleatòriament un vector de números de forma
    // que tots siguin diferents.
    public static void inicialitzarVectorDiferentsAleatoris(int vector[], int minim,int maxim) {
        
        int i=0;
        while(i<vector.length){
            int numero = numeroAleatoriLoteria (minim,maxim);
            
            if (!cercaNumero(numero,vector)) {
                vector[i] = numero;
                i++;
                
            }
        }
    }


    

// Implementar una funció que passats dos vectors ens retorni la quantitat de números 
    // del primer vector que es troben dins el segon vector. Utilitzar la funció cercaNumero.
    public static int numRepetitsVectors(int vector1[], int vector2[]) {
        int comptador=0;
        int i=0;
        while(i<vector1.length){
            if (cercaNumero(vector1[i], vector2)) {
               comptador++; 
            }
        }
        return comptador;
    }

   

   

}

