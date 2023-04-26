/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase Habitacio, que representa una habitación en un hotel.
 */

package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Habitacio {
    private int numero;
    private String tipus;
    private ArrayList<Persona> personesAllotjades;
    /**
     * Constructor de la clase Habitacio.
     * @param numero el número de la habitación.
     * @param tipus el tipo de habitación (individual, doble o suite).
     */

    public Habitacio(int numero, String tipus) {
        this.numero = numero;
        this.tipus = tipus;
        this.personesAllotjades = new ArrayList<Persona>();
        

    }

    // Getters y setters
    /**
     * Método getter para el número de la habitación.
     * @return el número de la habitación.
     */
    public int getNumero() {
        return numero;
    }
    /**
     * Método setter para el número de la habitación.
     * @param numero el número de la habitación a establecer.
     */

    public void setNumero(int numero) {
        this.numero = numero;
    }
    /**
     * Método getter para el tipo de habitación.
     * @return el tipo de habitación.
     */

    public String getTipus() {
        return tipus;
    }
     /**
     * Método setter para el tipo de habitación.
     * @param tipus el tipo de habitación a establecer.
     */

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }
    /**
     * Método getter para la lista de personas alojadas en la habitación.
     * @return la lista de personas alojadas en la habitación.
     */

    public ArrayList<Persona> getPersonesAllotjades() {
        return personesAllotjades;
    }
    /**
     * Método setter para la lista de personas alojadas en la habitación.
     * @param personesAllotjades la lista de personas alojadas en la habitación a establecer.
     */

    public void setPersonesAllotjades(ArrayList<Persona> personesAllotjades) {
        this.personesAllotjades = personesAllotjades;
    }
     /**
     * Método para agregar una persona a la habitación.
     * @param persona la persona a agregar a la habitación.
     * @return true si se agregó la persona correctamente, false
*/
     // Método para agregar una persona a la habitación
   
    // Método para agregar una persona a la habitación
    public boolean agregarPersonaAllotjada(Persona persona) {
        if (this.personesAllotjades.size() >= 3 || (this.tipus.equals("individual") && this.personesAllotjades.size() >= 1)) {
            return false;
        } else {
            this.personesAllotjades.add(persona);
            return true;
        }
    }

    // Método para eliminar una persona de la habitación
    public boolean eliminarPersonaAllotjada(Persona persona) {
        return this.personesAllotjades.remove(persona);
    }

    // Método para verificar si la habitación está libre
    public boolean estaLliure() {
        return this.personesAllotjades.isEmpty();
    }

    // Métodos para verificar el tipo de habitación
    public boolean esIndividual() {
        return this.tipus.equals("individual");
    }

    public boolean esDoble() {
        return this.tipus.equals("doble");
    }

    public boolean esSuite() {
        return this.tipus.equals("suite");
    }

    boolean estaDisponible(LocalDate fechaInici, LocalDate fechaFinal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void reservar(LocalDate fechaInici, LocalDate fechaFinal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cancelarReserva(LocalDate fechaInicio, LocalDate fechaFin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
