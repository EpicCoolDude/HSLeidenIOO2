package week2.Opdrachten.Personen;

import java.util.ArrayList;

public class Onderwijsmanager implements Persoon {
    private ArrayList<Docent> docenten;
    private Secretaresse secretaresse;
    private Opleiding opleiding;
    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Onderwijsmanager(String naam, int leeftijd, int lengte, int gewicht) {
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

    public void werkt() {
        System.out.println("Onderwijsmanager werkt");
    }
}
