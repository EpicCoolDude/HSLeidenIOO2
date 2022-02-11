package week1.Opdrachten;

import java.util.Map;

public class LeesStedenBestandLezenSchrijvenAppVersie2 {

    public static void main(String[] args) {

        // Toevoegen van 2 regels voor steden aan het bestaande bestand:
        SchrijfStedenVersie2.schrijfStedenNaarBestand("/home/tim/IdeaProjects/HSLeidenIOO2/src/week1/test/plaatsen.txt");

        // De tekstfile omzetten naar een MAP
        Map<String, String> mapFromFile = LeesStedenVersie2.hashMapFromTextFile("/home/tim/IdeaProjects/HSLeidenIOO2/src/week1/test/plaatsen.txt");


        // itereren over de gemaakte Map en printen
        for (Map.Entry<String,String> entry: mapFromFile.entrySet()){
            System.out.println("Als key:value: " +entry.getKey()+" : "+entry.getValue());
            System.out.println("Alleen stad: "+entry.getKey());
            System.out.println("\n");
        }
    }
}
