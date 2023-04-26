/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectecaixerautomlucas;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Banc {
    
    //private Client[] clientes;
    private ArrayList<Client> clientes;

    public Banc( ArrayList<Client> clientes) {
        this.clientes = clientes;
    }
    
    public ArrayList<Client> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Client> clientes) {
        this.clientes = clientes;
    }

    void llistaClients() {
        for (int i = 0; i < clientes.size(); i++) {
            System.out.print(clientes.get(i).getNom()+" "+clientes.get(i).getCognoms()+" "+clientes.get(i).getCc().getSaldo()+"\n");
        }
    }

    void afegirClient(String nom, String cognoms, String nomUsuari, String passUsuari) {
        CompteCorrent compteCorrent= new CompteCorrent(0);
        CompteEstalvis compteEstalvis= new CompteEstalvis(0);
        Client client = new Client(nom, cognoms, nomUsuari, passUsuari, compteCorrent, compteEstalvis, 0);
        clientes.add(client);
    }
    
    
}
