package week2.Opdrachten.Figuren;

public class Driehoek extends Figuur {

    private double lengteZijde1 = 1.0;
    private double lengteZijde2 = 1.0;
    private double lengteZijde3 = 1.0;

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, String achtergrondKleur, String omtrekKleur) {
        super (achtergrondKleur, omtrekKleur);
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }

    public double getLengteZijde2() {
        return lengteZijde2;
    }

    public void setLengteZijde2(double lengteZijde2) {
        this.lengteZijde2 = lengteZijde2;
    }

    public double getLengteZijde3() {
        return lengteZijde3;
    }

    public void setLengteZijde3(double lengteZijde3) {
        this.lengteZijde3 = lengteZijde3;
    }


    public double berekenOmtrek(){
        double omtrek = this.lengteZijde1+this.lengteZijde2+this.lengteZijde3;
        return omtrek;
    }

    public String toString(){
        //String deOmtrek = Double.toString(berekenOmtrek());
        return ("De zijden hebben de lengtes "+this.lengteZijde1+", "+this.lengteZijde2+ " en "+this.lengteZijde3+", die " +
                "ervoor zorgen dat de driehoek een omtrek van "+ berekenOmtrek()+" heeft.");
    }
}
