package week2.Opdrachten.Pizzas;

public class QuattroStagionni extends Pizza implements Deliverable {
    private double prijs = 8.75;
    private String naam = "Quattro Stagionni";

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

    }

    @Override
    public String getBezorgadres() {
        return null;
    }
}
