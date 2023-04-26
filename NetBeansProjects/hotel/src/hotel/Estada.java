/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jjavi
 */
import java.time.LocalDate;
import java.util.ArrayList;

import java.time.LocalDate;
import java.util.ArrayList;
/**
 * Constructor de la clase Estada.
 * @param dataInici La fecha de inicio de la estancia.
 * @param dataFinal La fecha de finalización de la estancia.
 * @param habitacio La habitación en la que se alojarán las personas.
 */
public class Estada {
    private LocalDate dataInici;
    private LocalDate dataFinal;
    private ArrayList<Persona> personesAllotjades;
    private final ArrayList<Persona> habitacio;

   public Estada(LocalDate dataInici, LocalDate dataFinal, Habitacio habitacio) {
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.habitacio = personesAllotjades;
   }
/**
 * Obtiene la fecha de inicio de la estancia.
 * @return La fecha de inicio de la estancia.
 */
    public LocalDate getDataInici() {
        return dataInici;
    }
/**
 * Establece la fecha de inicio de la estancia.
 * @param dataInici La nueva fecha de inicio de la estancia.
 */
    public void setDataInici(LocalDate dataInici) {
        this.dataInici = dataInici;
    }
/**
 * Obtiene la fecha de finalización de la estancia.
 * @return La fecha de finalización de la estancia.
 */
    public LocalDate getDataFinal() {
        return dataFinal;
    }
/**
 * Establece la fecha de finalización de la estancia.
 * @param dataFinal La nueva fecha de finalización de la estancia.
 */
    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }
/**
 * Agrega una persona alojada a la estancia.
 * @param persona La persona a agregar a la estancia.
 */
    public void agregarPersonaAllotjada(Persona persona) {
        personesAllotjades.add(persona);
    }
/**
 * Obtiene la lista de personas alojadas en la estancia.
 * @return La lista de personas alojadas en la estancia.
 */
    public ArrayList<Persona> obtenerPersonasAllotjades() {
        return personesAllotjades;
    }
/**
 * Calcula el precio total de la estancia.
 * @return El precio total de la estancia.
 */
    public double obtenerPreu() {
        double preu = 0;
        for (Persona persona : personesAllotjades) {
            preu += persona.getPreu(dataInici, dataFinal);
        }
        return preu;
    }
/**
 * Cancela la reserva de la estancia.
 */
    public void cancelarReserva() {
        for (Persona persona : personesAllotjades) {
            persona.cancelarReserva();
        }
    }
/**
 * Obtiene el número de noches de la estancia.
 * @return El número de noches de la estancia.
 */
    public int obtenerNits() {
        return dataInici.until(dataFinal).getDays();
    }

    Object getHabitacio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getFechaInicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getFechaFin() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    double calcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
