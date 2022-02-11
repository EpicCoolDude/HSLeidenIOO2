package week1.Opdrachten;

import java.util.ArrayList;

public class PersonenApp {

    public static void main(String[] args) {
        ArrayList<Persoon> personenlijst = new ArrayList<Persoon>();

        Persoon persoon1 = new Persoon("Arie",22);
        Persoon persoon2 = new Persoon("Bert",82);
        Persoon persoon3 = new Persoon("Klaas",52);
        Persoon persoon4 = new Persoon("Bas",66);
        Persoon persoon5 = new Persoon("Wim",39);
        Persoon persoon6 = new Persoon("Simon",67);

        personenlijst.add(persoon1);
        personenlijst.add(persoon2);
        personenlijst.add(persoon3);
        personenlijst.add(persoon4);
        personenlijst.add(persoon5);
        personenlijst.add(persoon6);


        // Array list printen om te testen
        for (int i = 0; i < personenlijst.size(); i++) {
            System.out.printf("%s : %d%n", personenlijst.get(i).getNaam(), personenlijst.get(i).getLeeftijd());
        }

        vindLettersEnPrint(personenlijst,"tKa"); // Letters opgeven en zoeken naar namen in de personenlijst
    }
        // Methode om namen van ArrayList te matchen op een aantal letters
        public static void vindLettersEnPrint(ArrayList<Persoon> personen, String letters){
        for (Persoon persoon : personen){
            if (persoon.bevatLetters(letters)){
                System.out.println(persoon.getNaam());
            }
        }
    }
}

