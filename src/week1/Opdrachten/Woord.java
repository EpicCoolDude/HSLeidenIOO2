package week1.Opdrachten;

public class Woord {

    private String woord;
    private int teller;

    public Woord(String woord, int teller) {
        this.woord = woord;
        this.teller = teller;
    }

    public String getWoord() {
        return woord;
    }

    public void setWoord(String woord) {
        this.woord = woord;
    }

    public int getTeller() {
        return teller;
    }

    public void setTeller(int teller) {
        this.teller = teller;
    }

    public void verhoogTeller() {
        this.teller = teller + 1;
    }

}
