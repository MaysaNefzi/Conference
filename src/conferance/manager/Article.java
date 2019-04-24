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
public class Article {
    private int code;
    private String titre,theme , etat;
    private Date soumission;
    private ArrayList<String> auteurs = new ArrayList<>();
    public Article(){}

    public Article(int code, String titre, String theme, String etat, Date soumission) {
        this.code = code;
        this.titre = titre;
        this.theme = theme;
        this.etat = etat;
        this.soumission = soumission;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getSoumission() {
        return soumission;
    }

    public void setSoumission(Date soumission) {
        this.soumission = soumission;
    }

    public ArrayList<String> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(ArrayList<String> auteurs) {
        this.auteurs = auteurs;
    }
    
}
