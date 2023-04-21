/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays.persones;


import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArraysPersones {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      // TODO code application logic here
  
   Scanner teclat = new Scanner(System.in);

        String[] noms = new String[200];
        int numNoms = 0;
       
       
        int opcio = 0;
        while(opcio!=4){
            System.out.println("1 = Afegir noms");
            System.out.println("2 = Eliminar noms");
            System.out.println("3 = Mostrar llista");
            System.out.println("Que vols fer:");
            opcio=teclat.nextInt();
            switch(opcio){
           
                case 1:
                    numNoms = afegir(noms, numNoms);
                    break;
                case 2:
                    numNoms = eliminar(noms, numNoms);
                    break;
                case 3:
                    numNoms = mostrar(noms, numNoms);
                    break;
                default:
                    System.out.println("Opció incorrecta");
           
           
            }
       
        }
    }

    public static int cercar(String[] noms, int numNoms, String cercat) {
        for (int i = 0; i < numNoms; i++) {
            if (noms[i].equals(cercat)) {
                return i;
            }
        }
        return -1;

    }

    public static int eliminar(String[] noms, int numNoms) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra un nom per eliminar-lo:");
        String nom = teclat.nextLine();
        int pos = cercar(noms, numNoms, nom);
        if (pos != -1) {

            for (int i = 0; i < numNoms - 1; i++) {
                noms[i] = noms[i + 1];
            }
            numNoms--;
        } else {
            System.out.println("Nom no trobat");
        }
        return numNoms;

    }

    public static int mostrar(String[] noms, int numNoms) {
        for (int i = 0; i < numNoms; i++) {
            System.out.println(noms[i]);
        }
        return numNoms;
    }

    public static int afegir(String[] noms, int numNoms) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Entra nom:");
        String nom = teclat.nextLine();
        while (!nom.equals("stop") && numNoms < noms.length) {

            noms[numNoms] = nom;
            numNoms++;
            System.out.println("Entra un nom: (fins entrar stop)");
            nom = teclat.nextLine();
        }

        return numNoms;
    }
}           
                    




