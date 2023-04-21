/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple_classes1;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class Banc {
   
    
    private String email;
    private  ArrayList<Client> Clients;
    private Client[] clients;
    private final Client[] clients2;

    public Banc(String email, Client[] clients) {
        this.email = email;
        this.clients2 = clients;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client[] getClients() {
        return clients2;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    void llistaClients() {
        for (int i = 0; i<Clients.size(); i++) {
            System.out.println(Clients.get(i).getNom()+" "+
                    Clients.get(i).getCognoms()+" "+
                    Clients.get(i).getCc().getSaldo()
            );
           
        }
    }

    void afegirClient(String nom, String cognoms) {
        Comptecorrent Comptecorrent= new Comptecorrent(0);
        Client clients2 = new Client(nom, cognoms, Comptecorrent,0);
        Clients.add(clients2);
    }

    
    
}
