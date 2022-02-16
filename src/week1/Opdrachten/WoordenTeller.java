package week1.Opdrachten;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.io.FileWriter;

import static java.util.Comparator.comparing;

public class WoordenTeller {

    public static ArrayList<Woord> woordenLijst = new ArrayList<>();
    public static ArrayList<String> verbodenWoorden = new ArrayList<String>(Arrays.asList("the", "of", "to", "and", "are", "in", "is", "a"));
    public static ArrayList<String> verbodenTekenLijst = new ArrayList<String>(Arrays.asList("!", ".", ",", ":", "?"));


    public static void main(String[] args) {

        ArrayList<String> woordenVanBestand = getAlleWoordenUitBestand("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/IOOA_Word_Count_Bijlage_artikel.txt");
        ArrayList<String> woordenFilterLeestekens = filterLeestekens(woordenVanBestand);
        ArrayList<String> woordenFilterVerbodenWoorden = filterVerbodenWoorden(woordenFilterLeestekens);
        ArrayList<Woord> woordenMetFrequentie = maakWoordenMetFrequentie(woordenFilterVerbodenWoorden);
        schrijfResultatenNaarBestand("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/woorden_output.txt", woordenMetFrequentie);

    }

    public static ArrayList<String> filterLeestekens(ArrayList<String> arrayList){
        ArrayList<String> ruweWoordenArrayList = arrayList;
        // Elk woord / element omzetten naar lower en daarna opschonen wat betreft de leestekens
        for (String woord : ruweWoordenArrayList) {
            String newValue = woord.toLowerCase(Locale.ROOT);
            newValue = newValue.replaceAll("[!.,:?]", "");
            ruweWoordenArrayList.set(ruweWoordenArrayList.indexOf(woord), newValue);
        }
        // Lege elementen verwijderen
        ruweWoordenArrayList.removeIf(String::isBlank);

        return ruweWoordenArrayList;
    }


    public static ArrayList<String> getAlleWoordenUitBestand(String padNaarFile) {
        // Alle regels lezen en streamen. Dan de stream splitten op een spatie en omzetten naar een string.
        try {
            ArrayList<String> ruweWoordenArrayList = (ArrayList<String>) Files.readAllLines(Paths.get(padNaarFile))
                    .stream()
                    .map(l -> l.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            return ruweWoordenArrayList;

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return (ArrayList) Collections.emptyList();
    }


    public static ArrayList<Woord> maakWoordenMetFrequentie(ArrayList<String> arrayList){
        for (String eenWoord : arrayList) {
            Woord bestaandWoord = null;
            for (Woord w : woordenLijst) { // check of bestaat zo ja vul variabele boven
                if (w.getWoord().equals(eenWoord)) {
                    bestaandWoord = w;
                }
            }
            if (bestaandWoord != null) { // variabele niet null? dan doe je verhogen
                bestaandWoord.verhoogTeller();
            } else { //var wel null dan voeg je hem toe
                woordenLijst.add(new Woord(eenWoord, 1));
            }
        }

        // Sorteren ArrayList woorenGesorteerd wat betreft counter int achter woord van hoog naar laag
        Collections.sort(woordenLijst, comparing(Woord::getTeller).reversed());

        return woordenLijst;
    }


    //Functie om een ArrayList te schrijven naar een .txt file
    public static void schrijfResultatenNaarBestand(String padNaarFile, ArrayList<Woord> eenGeteldeWoordenlijst) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(padNaarFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < eenGeteldeWoordenlijst.size(); i++) {
            try {
                writer.write(eenGeteldeWoordenlijst.get(i).getWoord() + ":" + eenGeteldeWoordenlijst.get(i).getTeller() + System.lineSeparator());
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
    public static ArrayList<String> filterVerbodenWoorden(ArrayList<String> arrayList) {
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
