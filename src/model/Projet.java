package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private double budgetPrevu;
    private Intervenant intervenantResponsable;
    private List<Affectation> affectations = new ArrayList<>();

    public Projet(int id, String nom, int nbJoursHPrevu, double budgetPrevu, Intervenant intervenantResponsable) {
        this.id = id;
        this.nom = nom;
        this.nbJoursHPrevu = nbJoursHPrevu;
        this.budgetPrevu = budgetPrevu;
        this.intervenantResponsable = intervenantResponsable;
    }

    public Projet() {
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

    public int getNbJoursHPrevu() {
        return nbJoursHPrevu;
    }

    public void setNbJoursHPrevu(int nbJoursHPrevu) {
        this.nbJoursHPrevu = nbJoursHPrevu;
    }

    public double getBudgetPrevu() {
        return budgetPrevu;
    }

    public void setBudgetPrevu(double budgetPrevu) {
        this.budgetPrevu = budgetPrevu;
    }

    public Intervenant getIntervenantResponsable() {
        return intervenantResponsable;
    }

    public void setIntervenantResponsable(Intervenant intervenantResponsable) {
        this.intervenantResponsable = intervenantResponsable;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }
}