package week2.Opdrachten.Personen;

public class Secretaresse implements Persoon {
    private String naam;
    private int leeftijd;
    private int lengte;
    private int gewicht;

    public Secretaresse(String naam, int leeftijd, int lengte, int gewicht) {
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
        System.out.println("Secretaresse werkt");
    }
}
