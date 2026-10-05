package model;

public class Prestataire extends Intervenant {

    private boolean forfait;
    private double coutJournalier;

    public Prestataire(boolean forfait, double coutJournalier) {
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
    }

    public Prestataire(int id, String prenom, String nom, Categorie categorie, boolean forfait, double coutJournalier) {
        super(id, prenom, nom, categorie);
        this.forfait = forfait;
        this.coutJournalier = coutJournalier;
    }

    public Prestataire(int id, String prenom, String nom, Categorie categorie) {
        super(id, prenom, nom, categorie);
    }

    public Prestataire() {
    }

    public boolean isForfait() {
        return forfait;
    }

    public void setForfait(boolean forfait) {
        this.forfait = forfait;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

    /*public double calculCoutProjet(int nbJours) {
        if (forfait) {
            return nbJours * laSociete.getCoutJournalier();
        } else {
            return nbJours * coutJournalier;
        }
    }*/
}
