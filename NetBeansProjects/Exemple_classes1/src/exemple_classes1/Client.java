/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple_classes1;

/**
 *
 * @author alumne
 */
public class  Client {

    static Client add;
    private String nom;
    private String cognoms;
    private Comptecorrent cc;
    private int numTargetes;

    public Client(String nom, String cognoms, Comptecorrent cc, int numTargetes) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.cc = cc;
        this.numTargetes = numTargetes;
    }

    Client() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Comptecorrent getCc() {
        return cc;
    }

    public void setCc(Comptecorrent cc) {
        this.cc = cc;
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

    static class add {

        public add() {
        }
    }
    
    
    
}
