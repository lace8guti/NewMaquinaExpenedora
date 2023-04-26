/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.time.LocalDate;

public class Gerent {
    private String nom;
    private String documentIdentitat;
    private LocalDate dataIniciTreball;
    private int anysExperiencia;
    private Hotel hotelActual; // Referència a l'hotel que gestiona actualment
    /**
 * Constructor de la classe Gerent.
 * 
 * @param nom               El nom del gerent.
 * @param documentIdentitat El document d'identitat del gerent.
 * @param dataIniciTreball  La data d'inici de treball del gerent.
 * @param anysExperiencia   Els anys d'experiència del gerent.
 */
    // Constructor
    public Gerent(String nom, String documentIdentitat, LocalDate dataIniciTreball, int anysExperiencia) {
        this.nom = nom;
        this.documentIdentitat = documentIdentitat;
        this.dataIniciTreball = dataIniciTreball;
        this.anysExperiencia = anysExperiencia;
        this.hotelActual = null; // Encara no té un hotel assignat
    }
    // Getters i setters

/**
 * Retorna el nom del gerent.
 * 
 * @return El nom del gerent.
 */
    // Getters i setters
    public String getNom() {
        return nom;
    }
    /**
 * Estableix el nom del gerent.
 * 
 * @param nom El nom del gerent.
 */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
 * Retorna el document d'identitat del gerent.
 * 
 * @return El document d'identitat del gerent.
 */
    public String getDocumentIdentitat() {
        return documentIdentitat;
    }
    /**
 * Estableix el document d'identitat del gerent.
 * 
 * @param documentIdentitat El document d'identitat del gerent.
 */
    public void setDocumentIdentitat(String documentIdentitat) {
        this.documentIdentitat = documentIdentitat;
    }
    /**
 * Retorna la data d'inici de treball del gerent.
 * 
 * @return La data d'inici de treball del gerent.
 */
    public LocalDate getDataIniciTreball() {
        return dataIniciTreball;
    }
    /**
 * Estableix la data d'inici de treball del gerent.
 * 
 * @param dataIniciTreball La data d'inici de treball del gerent.
 */
    public void setDataIniciTreball(LocalDate dataIniciTreball) {
        this.dataIniciTreball = dataIniciTreball;
    }
    /**
 * Retorna els anys d'experiència del gerent.
 * 
 * @return Els anys d'experiència del gerent.
 */
    public int getAnysExperiencia() {
        return anysExperiencia;
    }
    
    public void setAnysExperiencia(int anysExperiencia) {
        this.anysExperiencia = anysExperiencia;
    }
    
    public Hotel getHotelActual() {
        return hotelActual;
    }
    
    public void setHotelActual(Hotel hotelActual) {
        this.hotelActual = hotelActual;
    }
}


