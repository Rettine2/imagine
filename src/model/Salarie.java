package model;

import java.time.LocalDate;

public class Salarie extends Intervenant {

    private static final double COUT_JOURNALIER = 550;
    private LocalDate dtEmbauche;
    private int echelon;

    public Salarie(int id, String prenom, String nom, Categorie categorie, LocalDate dtEmbauche, int echelon) {
        super(id, prenom, nom, categorie);
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public Salarie(LocalDate dtEmbauche, int echelon) {
        this.dtEmbauche = dtEmbauche;
        this.echelon = echelon;
    }

    public Salarie(int id, String prenom, String nom, Categorie categorie) {
        super(id, prenom, nom, categorie);
    }

    public Salarie() {
    }

    public LocalDate getDtEmbauche() {
        return dtEmbauche;
    }

    public void setDtEmbauche(LocalDate dtEmbauche) {
        this.dtEmbauche = dtEmbauche;
    }

    public int getEchelon() {
        return echelon;
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public double calculCoutProjet(int nbJours){
        return nbJours * COUT_JOURNALIER;
    }
}
