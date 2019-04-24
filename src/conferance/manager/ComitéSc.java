/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conferance.manager;

/**
 *
 * @author zaefdfyjhlk
 */
public class ComitéSc {
    private int id;
    private String nom , mail , pseudo , institution , mdp;
    public ComitéSc() {}

    public ComitéSc (int id, String nom, String mail, String pseudo, String institution, String mdp) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
        this.pseudo = pseudo;
        this.institution = institution;
        this.mdp = mdp;
    }
    
        
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMail() {
        return mail;
    }
    
}
