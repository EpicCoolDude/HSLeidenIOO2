package week2.Figuur;

public abstract class Figuur {
    // abstracte klasse kun je niet implementeren

    private String achtergrondKleur;

    public Figuur(String kleur) {
        this.achtergrondKleur = kleur;
    }

    public String getKleur(){
        return this.achtergrondKleur;
    }

    public abstract String getVorm();

    public abstract void teken();
}
