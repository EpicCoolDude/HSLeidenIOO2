package week2.Opdrachten.Personen;

import java.util.ArrayList;

public class Docent implements Persoon {
    private ArrayList<Student> studenten;
    private Opleiding opleiding;

    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Docent(String naam, int leeftijd, int lengte, int gewicht) {
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

    public Opleiding getOpleiding() {
        return opleiding;
    }
    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }
    public ArrayList<Student> getStudenten() {
        return studenten;
    }
    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }

    public void werkt() {
        System.out.println("Docent werkt");
    }
}
