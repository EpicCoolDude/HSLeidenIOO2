package week2.Opdrachten.Personen;

public class Opleiding {
    private String naam;
    private String plaats;
    public Opleiding(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
    }
    public String getNaam() {
        return naam;
    }
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getPlaats() {
        return plaats;
    }
    public void setPlaats(String plaats) {
        this.plaats = plaats;
    }
}
