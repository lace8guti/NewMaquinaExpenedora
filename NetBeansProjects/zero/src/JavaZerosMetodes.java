import java.util.Random;
import java.util.Scanner;
  
public class JavaZerosMetodes {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            
            char[][] matriu=new char[5][5];
            
             inicialitzar(matriu);
             generarZeros(matriu);
             jugar(matriu);
        }

        /**
         * Emplena la matriu amb tot de caràcters 'X'
         * @param matriu una matriu de caràcters que representa el tauler
         */
         public static void inicialitzar(char[][] matriu) {
             for (int i = 0; i < matriu.length; i++) {
                 for (int j = 0; j < matriu[i].length; j++) {
                     matriu[i][j] = 'x';
                     
                     
                 }
   
             }
 
       
        }
            
        /**
         * Posa aleatòriament zeros a 5 posicions de la matriu
         * @param matriu una matriu de caràcters que representa el tauler
         */
         public static void generarZeros(char[][] matriu) {
            Random random = new Random();
            int i=0;
            while(i<5){
                int rand1=random.nextInt(matriu.length);
                int rand2=random.nextInt(matriu[0].length);
                
                if(matriu[rand1][rand2]=='x'){
                    matriu[rand1][rand2]='0';
                    i++;
                }
            }

        }

        /**
         * Amb el tauler passat com a paràmetre, demana com a màxim 8 cops 
         * fila i columna a l'usuari. Un cop exhaurides les 8 tirades o trobats
         * els 5 zeros acaba
         * @param matriu
         */
         public static void jugar(char[][] matriu) {
            // 
            int trobats=0;
            int intents = 0;
            int coord1, coord2;
            
            while(intents< 8 && trobats<5){
                imprimir(matriu);
            
                System.out.println("Entra coordenada 1 (1-"+ matriu.length +"):");
                coord1= llegirNumero(matriu.length);
                coord1--;
                System.out.println("Entra coordenada 2 (1-"+ matriu.length +"):");
                coord2 = llegirNumero(matriu.length);
                coord2--;
                
                boolean trobat= marcar(coord1,coord2,matriu);
                if(trobat) trobats++;
                
                intents++;
                
            }
        }

        /**Entra coordenada 1 (1-"+ matriu.length +"):");
         * Imprimeix el tauler de joc. Només s'imprimeix zeros si l'usuari els ha
         * trobat. Si un zero s'ha trobat hi haurà emmagatzemada una 'E' de encertat
         * Si una casella s'ha destapat ino hi havia un zero hi haurà una 'D' de destapat
         * @param matriu la matriu de caràcters que representa el tauler
         */
         public static void imprimir(char[][] matriu) {

            for(int i=0; i<matriu.length; i++){
            for(int j=0; j<matriu[i].length; j++){
                if(matriu[i][j]=='0') 
                    System.out.print('x');
                else System.out.print(matriu[i][j]);
                }
                System.out.println(" ");
            }
                }




          



        /**
         * Demana a l'usuari un número que sigui correcte. Si no ho és el
         * demana fins que sigui correcte.
         * @param entrada un escaner amb l'entrada de dades des del teclat
         * @param maxim un enter per indicar que el número és correcte si està entre 1 i màxim per exemple              
         * @return la fila o columna introduida per l'usuari
         */
         public static int llegirNumero(int maxim) {
            int numero = 0;
            Scanner entrada = new Scanner(System.in);
            boolean correcte = false;
            while(!correcte){
                
                numero = entrada.nextInt();
                if(numero>=1 && numero<=maxim) correcte = true;
            }
            
            // ...
            return numero;
        }

    private static boolean marcar(int coord1, int coord2, char[][] matriu) {
        
        if(matriu[coord1][coord2] =='E'){
            matriu[coord1][coord2] = 'D';
            System.out.println("Aquesta casella ja l'has marcat!!");
            return false;
        }
           
        if(matriu[coord1][coord2]=='0') {  
        matriu[coord1][coord2] = 'E';
       return true;
       }

        if(matriu[coord1][coord2]=='X') {  
        matriu[coord1][coord2] = 'D';
        }
       return false;
    }
 
}
    

        

    


