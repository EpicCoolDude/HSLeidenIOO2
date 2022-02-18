package week1.Ziekenhuis;

public class Bed {

    private int nummer;
    private char type;

    public Bed(int nummer, char type) {
        this.nummer = nummer;
        this.type = type;
    }

    public int getBedNummer() {
        return this.nummer;
    }
}
