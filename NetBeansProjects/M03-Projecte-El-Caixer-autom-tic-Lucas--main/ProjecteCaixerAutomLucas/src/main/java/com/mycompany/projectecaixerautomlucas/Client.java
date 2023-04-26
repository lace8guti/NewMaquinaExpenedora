/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectecaixerautomlucas;

import java.time.LocalDateTime;

/**
 *
 * @author alumne
 */
/*
public class Client {
    public String nomUsuari;
    public String passUsuari;

    public String getNomUsuari() {
        return nomUsuari;
    }

    public void setNomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public String getPassUsuari() {
        return passUsuari;
    }

    public void setPassUsuari(String passUsuari) {
        this.passUsuari = passUsuari;
    }    
    
   
}
*/

public class Client {
    private String nom;
    private String cognoms;
    private String nomUsuari;
    private String passUsuari;
    private CompteCorrent cc;
    private CompteEstalvis ce;
    //mantiene un registro del número de veces que el usuario ha ingresado una contraseña incorrecta
    private int intentosFallidos;
    //indica el momento en que se bloqueó la cuenta del usuario
    private LocalDateTime tiempoBloqueo;
    int numTargetes;

    public Client(String nom, String cognoms, String nomUsuari, String passUsuari,
            CompteCorrent cc, CompteEstalvis ce, int numTargetes) {
        
        this.nom = nom;
        this.cognoms = cognoms;
        this.nomUsuari= nomUsuari;
        this.passUsuari= passUsuari;
        this.cc = cc;
        this.ce = ce;
        this.intentosFallidos=intentosFallidos;
        this.tiempoBloqueo=tiempoBloqueo;
        this.numTargetes = numTargetes;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }
    
    public String getnomUsuari() {
        return nomUsuari;
    }
    
    public void setpassUsuari(String passUsuari) {
        this.passUsuari = passUsuari;
    }
    
    public String getpassUsuari() {
        return passUsuari;
    }
    

    public void setnomUsuari(String nomUsuari) {
        this.nomUsuari = nomUsuari;
    }

    public CompteCorrent getCc() {
        return cc;
    }

    public void setCc(CompteCorrent cc) {
        this.cc = cc;
    }
    
    public CompteEstalvis getCe() {
        return ce;
    }

    public void setCe(CompteEstalvis ce) {
        this.ce = ce;
    }
    
    public int getintentosFallidos() {
        return intentosFallidos;
    }

    public void setintentosFallidos(int intentosFallidos) {
        this.intentosFallidos = intentosFallidos;
    }

    public int getNumTargetes() {
        return numTargetes;
    }

    public void setNumTargetes(int numTargetes) {
        this.numTargetes = numTargetes;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", cognoms=" + cognoms + ", cc=" + cc + ", numTargetes=" + numTargetes + '}';
    }
    
    /*
    * Se encarga de verificar si la contraseña proporcionada por el usuario es correcta o no. 
    * Si la contraseña es correcta, el método devuelve true
    * y reinicia el contador de intentos fallidos. 
    * Si la contraseña es incorrecta, el contador de intentos fallidos se incrementa en uno 
    * y se verifica si el usuario ha ingresado una contraseña incorrecta tres veces seguidas. 
    * Si es así, la cuenta del usuario se bloquea durante 24 horas y el método devuelve false. 
    * Si el usuario ha ingresado una contraseña incorrecta menos de tres veces seguidas, 
    * el método también devuelve false
    */
    public boolean verificarContrasena(String passUsuari) {
        if (this.passUsuari.equals(passUsuari)) {
            this.intentosFallidos = 0;
            return true;
        } else {
            this.intentosFallidos++;
            if (intentosFallidos == 3) {
                this.tiempoBloqueo = LocalDateTime.now().plusHours(24);
                this.intentosFallidos = 0;
                return false;
            } else {
                return false;
            }
        }
    }

    
    /*
    * Comprueba si la cuenta del usuario está bloqueada o no. 
    * Si la cuenta no está bloqueada, devuelve false. 
    * Si la cuenta está bloqueada, comprueba si ha pasado el período de 24 horas 
    * desde el momento en que se bloqueó la cuenta. Si aún no ha pasado el período de 24 horas, 
    * devuelve true. Si ha pasado el período de 24 horas, 
    * el método borra la marca de tiempo de bloqueo y devuelve false
    */
    public boolean estaBloqueado() {
        if (this.tiempoBloqueo == null) {
            return false;
        } else {
            return LocalDateTime.now().isBefore(this.tiempoBloqueo);
        }
    }

    
}