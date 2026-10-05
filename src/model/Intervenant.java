package model;

import java.util.ArrayList;
import java.util.List;

public class Intervenant {
    private int id;
    private String prenom;
    private String nom;
    private Categorie categorie;
    private List<Projet> projets = new ArrayList<>();
    private List<Affectation> affectations = new ArrayList<>();
}