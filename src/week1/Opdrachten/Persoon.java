package week1.Opdrachten;

import java.util.Locale;

public class Persoon {

    private String naam;
    private int leeftijd;

    public Persoon(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public boolean bevatLetters(String letters){
        String naam = this.naam.toLowerCase(Locale.ROOT);
        boolean bevatLetters = false;
        String[] arrOfStr = letters.toLowerCase(Locale.ROOT).split("");
        for (int i = 0; i < arrOfStr.length; i++) {
            if (naam.contains(arrOfStr[i])){
                bevatLetters = true;
            }
        }
        return bevatLetters;
    }

}
