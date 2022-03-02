package week2.Opdrachten.Personen;

import java.util.ArrayList;

public class PersonenApp {
    public static void main(String[] args) {
        ArrayList<Persoon> personen = new ArrayList<Persoon>();
        personen.add(new Clusterdirecteur("Jan", 40, 180, 80));
        personen.add(new Docent("Kees", 40, 160, 70));
        personen.add(new Onderwijsmanager("Klaas", 60, 170, 70));
        personen.add(new Secretaresse("Koen", 20, 190, 90));
        personen.add(new Student("Jantje", 20, 190, 80));
        for(Persoon persoon: personen) {
            // Zal iets relevants printen afhankelijk wie persoon implementeerd
            persoon.werkt();
        }
    }
}
