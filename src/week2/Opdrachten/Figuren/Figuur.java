package week2.Opdrachten.Figuren;

public abstract class Figuur {

    private String achtergrondKleur = "wit";
    private String omtrekKleur = "zwart";

    public Figuur(String achtergrondKleur, String omtrekKleur) {
        this.achtergrondKleur = achtergrondKleur;
        this.omtrekKleur = omtrekKleur;
    }

    public String getAchtergrondKleur() {
        return achtergrondKleur;
    }

    public String getOmtrekKleur() {
        return omtrekKleur;
    }

    public void setAchtergrondKleur(String achtergrondKleur) {
        this.achtergrondKleur = achtergrondKleur;
    }

    public void setOmtrekKleur(String omtrekKleur) {
        this.omtrekKleur = omtrekKleur;
    }
}
