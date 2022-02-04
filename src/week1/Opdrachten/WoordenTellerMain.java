package week1.Opdrachten;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

public class WoordenTellerMain {


    public static void main(String[] args) {
        ArrayList<String> verbodenWoorden = new ArrayList<>();
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
        try {
            ArrayList ruweWoordenArrayList = (ArrayList<String>) Files.readAllLines(Paths.get(padNaarFile))
                    .stream()
                    .map(l -> l.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            for (Object woord : ruweWoordenArrayList){
                String newValue = woord.toString().toLowerCase(Locale.ROOT);
                newValue = newValue.toString().replaceAll("[^a-z]","");
                ruweWoordenArrayList.set(ruweWoordenArrayList.indexOf(woord), newValue);
            }
            return ruweWoordenArrayList;

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return (ArrayList) Collections.emptyList();

    }
}
