
import java.util.Scanner;

public class JavaParkingMetodes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        String[] parking = new String[10];
        String opcio;
        
        mostrarMenu();
        opcio = entraParaula();
        String [] places = {"","","","","",""};
        System.out.println( aparcar(places,"1"));
        
        while(!opcio.equals("fi")) {
            
            switch(opcio) {
                case "aparcar":
                    // Demanar matrícula per teclat
                    // ...
                    // aparcar(.....);
                    break;
                case "desaparcar":
                    // Demanar matrícula per teclat
                    // ...
                    // desaparcar(....);
                    break;
                // altres
                // ....
                default:
                    System.out.println("Opcio incorrecta!!");
            }
            mostrarMenu();
            opcio = entraParaula();
        }
        
    }
    
    

    //un mètode per mostrar el menú d'opcions:  
    public static void mostrarMenu() {
        System.out.println("Entra la opció d'aparcar o desaparcar");
    
    }
    
    //Un mètode per entrar per teclat una paraula
    // El mètode preguntarà a l'usuari per teclat un String
    public static String entraParaula() {
        Scanner teclat = new Scanner(System.in);
        String matricula;
        System.out.println("Entra numero de matricula");
        matricula=teclat.nextLine();
    
                    
        return "";
    }
    
    
    // un mètode per aparcar
    // Retorna cert si s'ha pogut aparcar el cotxe. Hi ha lloc. Es guarda la matrícula dins el lloc lliure.
    // retorna fals si no s'ha pogut aparcar. No hi ha lloc
    public static void opcio() {
    
}
    public static boolean aparcar(String places[], String matricula) {
        boolean aparcar = true;
        int i=0;
        while(i<places.length) {
            if (places.equals("")==true) {
                System.out.println("Hi han llocs disponibles");
                places[i]=matricula;
                return true;

            }
           i++;
        }
        
        return false;
    
    }
    
    // un mètode per desaparcar
    // Retorna cert si s'ha trobat la matricula dins el pàrquing. Es deixa la plaça buida.
    // Retorna fals en cas contrari.
    public static boolean desaparcar(String places[], String matricula) {
        return true;
    }
    
    // Altres mètode com mostrarParquing, cercarMatrícula, ...
    
}

