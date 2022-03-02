package week2.Opdrachten.Pizzas;

public class Tonno extends Pizza implements Deliverable {
    private double prijs = 10.50;
    private String naam = "Tonno";
    private String bezorgadres;

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public double getPrijs() {
        return this.prijs;
    }

    @Override
    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public void setBezorgadres(String bezorgadres) {
        this.bezorgadres = bezorgadres;
    }

    @Override
    public String getBezorgadres() {
        return this.bezorgadres;
    }
}
