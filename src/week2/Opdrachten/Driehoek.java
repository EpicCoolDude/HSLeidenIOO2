package week2.Opdrachten;

public class Driehoek {

    private double lengteZijde1 = 1.0;
    private double lengteZijde2 = 1.0;
    private double lengteZijde3 = 1.0;
    private String achtergrondKleur = "wit";
    private String omtrekKleur = "zwart";

    public Driehoek(double lengteZijde1, double lengteZijde2, double lengteZijde3, String achtergrondKleur, String omtrekKleur) {
        this.lengteZijde1 = lengteZijde1;
        this.lengteZijde2 = lengteZijde2;
        this.lengteZijde3 = lengteZijde3;
        this.achtergrondKleur = achtergrondKleur;
        this.omtrekKleur = omtrekKleur;
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

    public String getAchtergrondKleur() {
        return achtergrondKleur;
    }

    public void setAchtergrondKleur(String achtergrondKleur) {
        this.achtergrondKleur = achtergrondKleur;
    }

    public String getOmtrekKleur() {
        return omtrekKleur;
    }

    public void setOmtrekKleur(String omtrekKleur) {
        this.omtrekKleur = omtrekKleur;
    }

    public double berekenOmtrek(){
        double omtrek = this.lengteZijde1+this.lengteZijde2+this.lengteZijde3;
        return omtrek;
    }

    public String toString(){
        String deOmtrek = Double.toString(berekenOmtrek());
        return ("De zijden hebben de lengtes "+this.lengteZijde1+", "+this.lengteZijde2+ " en "+this.lengteZijde3+", die " +
                "ervoor zorgen dat de driehoek een omtrek van "+ deOmtrek+" heeft");
    }
}
