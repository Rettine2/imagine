package model;

import java.util.ArrayList;
import java.util.List;

public class Projet {
    private int id;
    private String nom;
    private int nbJoursHPrevu;
    private double budgetPrevu;
    private Intervenant intervenant;
    private List<Affectation> affectations = new ArrayList<>();
}
