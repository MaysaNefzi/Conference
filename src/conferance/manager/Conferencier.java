/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conferance.manager;

import java.util.Date;

/**
 *
 * @author zaefdfyjhlk
 */
public class Conferencier {
     private int Id ,vol_d, vol_a;
    private String nom, prenom, pays,presentation;
    private Institution institut;
    private ComitéOr chargé;
    private Date arrivée , départ;
    public Conferencier (){}

    public Conferencier(int Id, int vol_d, String nom, String prenom, String pays, String presentation, Institution institut, ComitéOr chargé, Date arrivée, Date départ) {
        this.Id = Id;
        this.vol_d = vol_d;
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.presentation = presentation;
        this.institut = institut;
        this.chargé = chargé;
        this.arrivée = arrivée;
        this.départ = départ;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getVol_d() {
        return vol_d;
    }

    public void setVol_d(int vol_d) {
        this.vol_d = vol_d;
    }

    public int getVol_a() {
        return vol_a;
    }

    public void setVol_a(int vol_a) {
        this.vol_a = vol_a;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public Institution getInstitut() {
        return institut;
    }

    public void setInstitut(Institution institut) {
        this.institut = institut;
    }

    public ComitéOr getChargé() {
        return chargé;
    }

    public void setChargé(ComitéOr chargé) {
        this.chargé = chargé;
    }

    public Date getArrivée() {
        return arrivée;
    }

    public void setArrivée(Date arrivée) {
        this.arrivée = arrivée;
    }

    public Date getDépart() {
        return départ;
    }

    public void setDépart(Date départ) {
        this.départ = départ;
    }
    public void Addguest()
    {
        
    }
    
}
