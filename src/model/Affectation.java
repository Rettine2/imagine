package model;

import java.util.ArrayList;
import java.util.List;

public class Affectation {
    private int annee;
    private int semaine;
    private int tempsPasse;
    private List<Intervenant> intervenants = new ArrayList<>();
    private List<Projet> projets = new ArrayList<>();

    public Affectation(int annee, int semaine, int tempsPasse) {
        this.annee = annee;
        this.semaine = semaine;
        this.tempsPasse = tempsPasse;
    }

    public Affectation() {
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getSemaine() {
        return semaine;
    }

    public void setSemaine(int semaine) {
        this.semaine = semaine;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public List<Intervenant> getIntervenants() {
        return intervenants;
    }

    public void setIntervenants(List<Intervenant> intervenants) {
        this.intervenants = intervenants;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }


}
