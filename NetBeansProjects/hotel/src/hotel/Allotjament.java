/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

/**
 *
 * @author jjavi
 */
public class Allotjament {
    
    private Persona persona;
    private Habitacio habitacio;
    /**
 * Constructor de la clase Allotjament.
 * @param persona la persona que se aloja en la habitación.
 * @param habitacio la habitación en la que se aloja la persona.
 */
    public Allotjament(Persona persona, Habitacio habitacio) {
        this.persona = persona;
        this.habitacio = habitacio;
    }
    /**
 * Obtiene la persona que se aloja en la habitación.
 * @return la persona que se aloja en la habitación.
 */
    public Persona getPersona() {
        return persona;
    }
    /**
 * Obtiene la habitación en la que se aloja la persona.
 * @return la habitación en la que se aloja la persona.
 */
    public Habitacio getHabitacio() {
        return habitacio;
    }
}
    

