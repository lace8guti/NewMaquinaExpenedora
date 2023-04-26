/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author jjavi
 */
public class Hotel {
    private String nom;
    private String adrecaPostal;
    private String adrecaWeb;
    private int categoria;
    private Gerent gerente;
    private ArrayList<Habitacio> habitaciones;
    private ArrayList<Estada> estadas;
/**
 * Constructor de la clase Hotel.
 * @param nom El nombre del hotel.
 * @param adrecaPostal La dirección postal del hotel.
 * @param adrecaWeb La dirección web del hotel.
 * @param categoria La categoría del hotel.
 */
    public Hotel(String nom, String adrecaPostal, String adrecaWeb, int categoria) {
        this.nom = nom;
        this.adrecaPostal = adrecaPostal;
        this.adrecaWeb = adrecaWeb;
        this.categoria = categoria;
        this.gerente = null;
        this.habitaciones = new ArrayList<Habitacio>();
        this.estadas = new ArrayList<Estada>();
    }
/**
 * Obtiene el nombre del hotel.
 * @return El nombre del hotel.
 */
    // Getters y setters
    public String getNom() {
        return nom;
    }
/**
 * Cambia el nombre del hotel.
 * @param nom El nuevo nombre del hotel.
 */
    public void setNom(String nom) {
        this.nom = nom;
    }
/**
 * Obtiene la dirección postal del hotel.
 * @return La dirección postal del hotel.
 */
    public String getAdrecaPostal() {
        return adrecaPostal;
    }
/**
 * Cambia la dirección postal del hotel.
 * @param adrecaPostal La nueva dirección postal del hotel.
 */
    public void setAdrecaPostal(String adrecaPostal) {
        this.adrecaPostal = adrecaPostal;
    }
/**
 * Obtiene la dirección web del hotel.
 * @return La dirección web del hotel.
 */
    public String getAdrecaWeb() {
        return adrecaWeb;
    }
/**
 * Cambia la dirección web del hotel.
 * @param adrecaWeb La nueva dirección web del hotel.
 */
    public void setAdrecaWeb(String adrecaWeb) {
        this.adrecaWeb = adrecaWeb;
    }
/**
 * Obtiene la categoría del hotel.
 * @return La categoría del hotel.
 */
    public int getCategoria() {
        return categoria;
    }
/**
 * Cambia la categoría del hotel.
 * @param categoria La nueva categoría del hotel.
 */
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
/**
 * Obtiene el gerente del hotel.
 * @return El gerente del hotel.
 */
    public Gerent obtenerGerente() {
        return gerente;
    }
/**
 * Actualiza el gerente del hotel.
 * @param gerente El nuevo gerente del hotel.
 */
    public void actualizarGerente(Gerent gerente) {
        this.gerente = gerente;
    }
/**
 * Agrega una habitación al hotel.
 * @param habitacion La habitación que se desea agregar.
 */
    public void agregarHabitacion(Habitacio habitacion) {
        habitaciones.add(habitacion);
    }
/**
 * Obtiene la lista de habitaciones del hotel.
 * @return La lista
 */
    public ArrayList<Habitacio> obtenerHabitaciones() {
        return habitaciones;
    }

    public Habitacio buscarHabitacionDisponible(LocalDate fechaInici, LocalDate fechaFinal) {
        for (Habitacio habitacion : habitaciones) {
            if (habitacion.estaDisponible(fechaInici, fechaFinal)) {
                return habitacion;
            }
        }
        return null;
    }

    public void reservarHabitacion(Habitacio habitacion, LocalDate fechaInici, LocalDate fechaFinal) {
        habitacion.reservar(fechaInici, fechaFinal);
        Estada estada = new Estada(fechaInici, fechaFinal, habitacion);
        estadas.add(estada);
    }

   public void cancelarReserva(Habitacio habitacion, LocalDate fechaInicio, LocalDate fechaFin) {
        habitacion.cancelarReserva(fechaInicio, fechaFin);
        for (Estada estada : estadas) {
            if (estada.getHabitacio().equals(habitacion) && estada.getFechaInicio().equals(fechaInicio)
                    && estada.getFechaFin().equals(fechaFin)) {
                estadas.remove(estada);
                break;
            }
        }
    }

    public double obtenerIngresos() {
        double total = 0;
        for (Estada estada : estadas) {
            total += estada.calcularPrecio();
        }
        return total;
    }
}


    

