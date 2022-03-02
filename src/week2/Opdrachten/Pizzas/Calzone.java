package week2.Opdrachten.Pizzas;

public class Calzone extends Pizza implements Deliverable {
    private double prijs = 6.50;
    private String naam = "Calzone";
    private String bezorgadres;

    public String getNaam() {
        return this.naam;
    }

    public double getPrijs() {
        return this.prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setBezorgadres(String bezorgadres) {
        this.bezorgadres = bezorgadres;
    }

    public String getBezorgadres() {
        return this.bezorgadres;
    }

}
