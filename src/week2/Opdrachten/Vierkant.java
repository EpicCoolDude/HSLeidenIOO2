package week2.Opdrachten;

public class Vierkant extends Figuur {

    private double lengteZijde1 = 1.0;

    public Vierkant(double lengteZijde1, String achtergrondKleur, String omtrekKleur) {
        super (omtrekKleur, achtergrondKleur);
        this.lengteZijde1 = lengteZijde1;

    }

    public double getLengteZijde1() {
        return lengteZijde1;
    }

    public void setLengteZijde1(double lengteZijde1) {
        this.lengteZijde1 = lengteZijde1;
    }


    public double berekenOmtrek(){
        double omtrek = this.lengteZijde1 * 4;
        return omtrek;
    }

    public String toString(){

        return ("De zijden hebben elk een lengte van "+this.lengteZijde1+", die " +
                "ervoor zorgen dat het vierkant een omtrek van "+ berekenOmtrek()+" heeft.");
    }
}
