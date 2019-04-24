/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conferance.manager;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zaefdfyjhlk
 */
public class Conference {
    private int Id;
    private String titre, theme, institution;
    private double frais;
    private Date d_paiment , d_soumission;
    private ArrayList<ComitéOr> Or = new ArrayList<>();
    private ArrayList<ComitéSc> Sc = new ArrayList<>();
    public Conference() {}

    public Conference(int Id, String titre, String theme, String institution, Date d_paiment, Date d_soumission) {
        this.Id = Id;
        this.titre = titre;
        this.theme = theme;
        this.institution = institution;
        this.d_paiment = d_paiment;
        this.d_soumission = d_soumission;
        this.frais=frais;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getD_paiment() {
        return d_paiment;
    }

    public void setD_paiment(Date d_paiment) {
        this.d_paiment = d_paiment;
    }

    public Date getD_soumission() {
        return d_soumission;
    }

    public void setD_soumission(Date d_soumission) {
        this.d_soumission = d_soumission;
    }

    public ArrayList<ComitéOr> getOr() {
        return Or;
    }

    public void setOr(ArrayList<ComitéOr> Or) {
        this.Or = Or;
    }

    public ArrayList<ComitéSc> getSc() {
        return Sc;
    }

    public void setSc(ArrayList<ComitéSc> Sc) {
        this.Sc = Sc;
    }

    public double getFrais() {
        return frais;
    }

    public void setFrais(double frais) {
        this.frais = frais;
    }
    
}
