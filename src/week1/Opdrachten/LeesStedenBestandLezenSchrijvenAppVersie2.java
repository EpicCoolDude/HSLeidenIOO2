package week1.Opdrachten;

import java.util.Map;

public class LeesStedenBestandLezenSchrijvenAppVersie2 {

    public static void main(String[] args) {

        // de tekstfile omzetten naar een MAP
        Map<String, String> mapFromFile = LeesStedenVersie2.hashMapFromTextFile("/home/tim/IdeaProjects/HSLeidenIOO2/src/week1/test/plaatsen.txt");

        // itereren over de HashMap
        for (Map.Entry<String,String> entry: mapFromFile.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
