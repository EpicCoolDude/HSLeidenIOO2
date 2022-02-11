package week1.Opdrachten;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.io.FileWriter;

import static java.util.Comparator.comparing;

public class WoordenTellerMain {

    public static ArrayList<String> verbodenWoorden = new ArrayList<>();
    public static ArrayList<Woord> woordenGesorteerd = new ArrayList<>();

    public static void main(String[] args) {

        verbodenWoorden.addAll(Arrays.asList("the", "of", "to", "and", "are", "in", "is", "a"));
        ArrayList<String> woordenVanFile = woordenFileToArraylist("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/IOOA_Word_Count_Bijlage_artikel.txt");
        ArrayList<String> woordenGefilterd = arrayListFilteren(woordenVanFile);

        for (String w : woordenGefilterd) {
            Woord bestaandWoord = null;
            for (Woord woord : woordenGesorteerd) { // check of bestaat zo ja vul variabele boven
                if (woord.getWoord().equals(w)) {
                    bestaandWoord = woord;
                }
            }
            if (bestaandWoord != null) { // variabele niet null? dan doe je verhogen
                bestaandWoord.verhoogTeller();
            } else { //var wel null dan voeg je hem toe
                woordenGesorteerd.add(new Woord(w, 1));
            }
        }

        // Sorteren ArrayList woorenGesorteerd wat betreft counter int achter woord van hoog naar laag
        Collections.sort(woordenGesorteerd, comparing(Woord::getTeller).reversed());

//        // Array list printen om te testen
//        for (int i = 0; i < woordenGesorteerd.size(); i++) { // dit werkt wel
//            System.out.printf("%s : %d%n", woordenGesorteerd.get(i).getWoord(), woordenGesorteerd.get(i).getTeller());
//        }

        // Hier de gefilterde, gesorteerde en getelde woordenlijst naar een file schrijven:
        arrayListToFile("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/woorden_output.txt");

    }

    // Functie om alle woorden in een .txt file netjes in een ArrayList te zetten
    public static ArrayList<String> woordenFileToArraylist(String padNaarFile) {
        // Alle regels lezen en streamen. Dan de stream splitten op een spatie en omzetten naar een string.
        try {
            ArrayList<String> ruweWoordenArrayList = (ArrayList<String>) Files.readAllLines(Paths.get(padNaarFile))
                    .stream()
                    .map(l -> l.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            // Elk woord / element omzetten naar lower en daarna opschonen wat betreft andere karaters als letters met een regex.
            for (String woord : ruweWoordenArrayList) {
                String newValue = woord.toLowerCase(Locale.ROOT);
                newValue = newValue.replaceAll("[^a-z]", "");
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

    //Functie om een ArrayList te schrijven naar een .txt file
    public static void arrayListToFile(String padNaarFile) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(padNaarFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < woordenGesorteerd.size(); i++) {
            try {
                writer.write(woordenGesorteerd.get(i).getWoord() + ":" + woordenGesorteerd.get(i).getTeller() + System.lineSeparator());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Functie om de verboden woorden uit de ArrayList filteren
    public static ArrayList<String> arrayListFilteren(ArrayList<String> arrayList) {
        Iterator i = arrayList.iterator();      // Iterator maken over de gevoerde arraylist
        String str = "";                        // Leeg string object maken
        while (i.hasNext()) {                    // While loop maken tot iteratie is voltooid over de arraylist
            str = (String) i.next();            // Str object vullen met de string waarde van i
            if (verbodenWoorden.contains(str)) {
                i.remove();                     // Wanneer string gelijk is aan string element verboden woorden dan verwijderen
            }
        }
        return arrayList;                       // Schone arraylist teruggeven
    }
}
