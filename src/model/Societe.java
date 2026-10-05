package model;

public class Societe {
    private int id;
    private String raisonSociale;
    private String adresse;
    private int cppos;
    private String ville;
    private double coutJournalier;

    public Societe(int id, String raisonSociale, String adresse, int cppos, String ville, double coutJournalier) {
        this.id = id;
        this.raisonSociale = raisonSociale;
        this.adresse = adresse;
        this.cppos = cppos;
        this.ville = ville;
        this.coutJournalier = coutJournalier;
    }

    public Societe() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getCppos() {
        return cppos;
    }

    public void setCppos(int cppos) {
        this.cppos = cppos;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public double getCoutJournalier() {
        return coutJournalier;
    }

    public void setCoutJournalier(double coutJournalier) {
        this.coutJournalier = coutJournalier;
    }

}
