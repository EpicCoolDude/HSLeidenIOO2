package week2.Opdrachten.Pizzas;

public class BigPizza extends Pizza {
    private String naam = "Big Pizza";
    private double prijs = 16.50;

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
}
