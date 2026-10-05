package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Intervenant {
    private int id;
    private String prenom;
    private String nom;

    private Categorie categorie;
    private List<Projet> projetsResponsable = new ArrayList<>();
    private List<Affectation> affectations = new ArrayList<>();

    public Intervenant(int id, String prenom, String nom, Categorie categorie) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.categorie = categorie;
    }

    public abstract double calculCoutProjet(int nbJours);

    public Intervenant() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public List<Projet> getProjetsResponsable() {
        return projetsResponsable;
    }

    public void setProjetsResponsable(List<Projet> projetsResponsable) {
        this.projetsResponsable = projetsResponsable;
    }

    public List<Affectation> getAffectations() {
        return affectations;
    }

    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }
}