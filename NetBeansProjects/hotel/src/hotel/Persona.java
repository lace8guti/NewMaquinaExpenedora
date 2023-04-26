/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.time.LocalDate;

/**
 *
 * @author jjavi
 */
public class Persona {

    static double getPreuAllotjament() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   // Atributos
    private String nom;
    private String documentIdentitat;
    private String nacionalitat;
    /**
 * Constructor de la clase Persona.
 * @param nom El nombre de la persona.
 * @param documentIdentitat El número de identificación de la persona.
 * @param nacionalitat La nacionalidad de la persona.
 */
    public Persona(String nom, String documentIdentitat, String nacionalitat) {
        this.nom = nom;
        this.documentIdentitat = documentIdentitat;
        this.nacionalitat = nacionalitat;
    }
    /**
 * Método getter para el atributo nom.
 * @return El nombre de la persona.
 */
    public String getNom() {
        return nom;
    }
    /**
 * Método setter para el atributo nom.
 * @param nom El nuevo nombre de la persona.
 */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
 * Método getter para el atributo documentIdentitat.
 * @return El número de identificación de la persona.
 */
    public String getDocumentIdentitat() {
        return documentIdentitat;
    }
    /**
 * Método setter para el atributo documentIdentitat.
 * @param documentIdentitat El nuevo número de identificación de la persona.
 */
    public void setDocumentIdentitat(String documentIdentitat) {
        this.documentIdentitat = documentIdentitat;
    }
    /**
 * Método getter para el atributo nacionalitat.
 * @return La nacionalidad de la persona.
 */
    public String getNacionalitat() {
        return nacionalitat;
    }
   /**
 * Método setter para el atributo nacionalitat.
 * @param nacionalitat La nueva nacionalidad de la persona.
 */ 
    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }
/**
 * Método para cancelar la reserva de la persona.
 */
    void cancelarReserva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
/**
 * Método para obtener el precio del alojamiento de la persona.
 * @param dataInici Fecha de inicio de la estancia.
 * @param dataFinal Fecha de fin de la estancia.
 * @return El precio del alojamiento de la persona.
 */
    double getPreu(LocalDate dataInici, LocalDate dataFinal) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


    

