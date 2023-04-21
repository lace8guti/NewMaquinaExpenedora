import java.util.Random;

public class Loteria {

    private int[] aleatoris = new int[6]; // guardarà els 6 números aleatoris generats
    private int[] apostes = new int[6]; // guardarà els 6 números triats per l'usuari

    /**
     * Mètode Cercar
     * retorna cert si el numero cercat es troba dins les primeres posicions d'un array
    * @param cercat: número que es vol buscar dins l'array
     * @param array: array on es vol buscar el número
     * @param inici Es busca l'element des de la posició indicada
     * @param fi Es busca únicament fins a la posició indicada
     * @return true si el número éstà dins l'array entre inici ... fi
     * */

    private boolean cercar(int cercat,int[] array,int inici, int fi) {
        for(int i=inici;i<fi;i++) {
            if(cercat==array[i]) return true;
        }
        return false;
    }

    /**
     * Mètode sortejar
     * Genera els 6 números aleatoris diferents
     */
    public void sortejar() {
        Random generador = new Random();
        int i=0;
        // mentre no hagi generat 6 números diferents
        while(i<6) {
            int numero = generador.nextInt(49)+1; // genero un número
            // el busco dins l'array
            if(cercar(numero,aleatoris,0,i)==false) { // miro que no estigui repetit dins les primeres "i" posicions
                aleatoris[i]=numero; // guardo el número en la posició i

                i++; // nou número diferent generat correctament!
            }
        }
    }

    /**
     * Mètode setApostes
     * Mètode que serveix per recollir els números que l'usuari ha triat
     * Es comprovarà que tots els números estan compresos entre 1..49
     * i que no n'hi hagi cap de repetit
     * @param apostes Números apostats per l'usuari
     * @return retorna true si els números són corretes i fals si hi ha algun número incorrecte
     */
    public boolean setApostes(int[] apostes) {
        // Comprovar que el números no estiguin repetits i estiguin
        // entre 1 i 49
        for(int i=0;i<apostes.length;i++) {
            if (apostes[i] < 1 || apostes[i] > 49) return false;
        }

        for(int i=0;i<apostes.length-1;i++) {
            if(cercar(apostes[i],apostes,i+1,apostes.length)) return false;
        }
        this.apostes = apostes;
        return true;
    }

    /**
     * Mètode getAleatoris
     * @return els números aleatoris resultants del sorteig
     */
    public int[] getAleatoris() {
        return aleatoris;
    }

    /**
     *
     * @return el número d'encerts del sorteig
     */
    int numeroEncerts() {
        int cont=0;
        for(int i=0;i<aleatoris.length;i++) {
            if(this.cercar(aleatoris[i],apostes,0,apostes.length)) {
                cont++;
            }
        }
        return cont;
    }
}
