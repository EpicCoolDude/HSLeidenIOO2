package week1.Opdrachten;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class WoordenTellerMain {

    public static ArrayList<String> verbodenWoorden = new ArrayList<>();

    public static void main(String[] args) {

        verbodenWoorden.addAll(Arrays.asList("the", "of", "to", "and", "are", "in", "is", "a"));



        ArrayList<String> woordenVanBestand = woordenFileToArraylist("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/IOOA_Word_Count_Bijlage_artikel.txt");
        ArrayList<String> woordenGefilterd = new ArrayList<>();
        ArrayList<String> woordenGesorteerd = new ArrayList<>();

        // Array list printen om te testen
        for (String woord : woordenVanBestand) {
            System.out.println(woord);
        }


    }

    public static ArrayList<String> woordenFileToArraylist(String padNaarFile) {
        // Alle regels lezen en streamen. Dan de stream splitten op een spatie en omzetten naar een string.
        try {
            ArrayList<String> ruweWoordenArrayList = (ArrayList<String>) Files.readAllLines(Paths.get(padNaarFile))
                    .stream()
                    .map(l -> l.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            // Elk woord / element omzetten naar lower en daarna opschonen wat betreft andere karaters als letters met een regex.
            for (String woord : ruweWoordenArrayList){
                String newValue = woord.toLowerCase(Locale.ROOT);
                newValue = newValue.replaceAll("[^a-z]","");
                ruweWoordenArrayList.set(ruweWoordenArrayList.indexOf(woord), newValue);
            }
            // Lege elementen verwijderen
            ruweWoordenArrayList.removeIf(String::isBlank);

            return ruweWoordenArrayList;

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return (ArrayList) Collections.emptyList();

    }

//    public static ArrayList<String> arrayListFilteren(ArrayList<String> arrayList ) {
//        for (String woord : arrayList){
//            if (verbodenWoorden.contains(woord)){
//                arrayList.removeIf(woord);
//            }
//        }
//    }


}
