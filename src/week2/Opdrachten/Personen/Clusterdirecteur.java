package week2.Opdrachten.Personen;

public class Clusterdirecteur implements Persoon {
    private Onderwijsmanager[] onderwijsmanagers = new Onderwijsmanager[4];
    private Secretaresse[] secretaresses = new Secretaresse[2];
    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Clusterdirecteur(String naam, int leeftijd, int lengte, int gewicht) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.lengte = lengte;
        this.gewicht = gewicht;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public int getLengte() {
        return lengte;
    }

    public int getGewicht() {
        return gewicht;
    }
    @Override
    public void werkt() {
        System.out.println("Directeur werkt");
    }
    public Secretaresse[] getSecretaresses() {
        return secretaresses;
    }
    public void setSecretaresses(Secretaresse[] secretaresses) {
        this.secretaresses = secretaresses;
    }
    public Onderwijsmanager[] getOnderwijsmanagers() {
        return onderwijsmanagers;
    }
    public void setOnderwijsmanagers(Onderwijsmanager[] onderwijsmanagers) {
        this.onderwijsmanagers = onderwijsmanagers;
    }
}
