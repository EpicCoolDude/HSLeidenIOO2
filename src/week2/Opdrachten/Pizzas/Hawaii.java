package week2.Opdrachten.Pizzas;

public class Hawaii extends Pizza implements Deliverable {
    private double prijs = 12.75;
    private String naam = "Hawaii";
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

    }

    public String getBezorgadres() {
        return null;
    }
}
