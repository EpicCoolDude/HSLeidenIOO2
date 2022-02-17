package week2.Opdrachten;

public class Vierhoek extends Figuur {

    private double lengteZijde1 = 1.0;
    private double lengteZijde2 = 1.0;

    public Vierhoek(double lengteZijde1, double lengteZijde2, String achtergrondKleur, String omtrekKleur) {
        super (achtergrondKleur, omtrekKleur);
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
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


    public double berekenOmtrek(){
        double omtrek = (this.lengteZijde1 +this.lengteZijde2) * 2;
        return omtrek;
    }

    public String toString(){

        return ("De zijden hebben elk een lengte van "+this.lengteZijde1+" en "+lengteZijde1+" die " +
                "ervoor zorgen dat de vierhoek een omtrek van "+ berekenOmtrek()+" heeft.");
    }
}
