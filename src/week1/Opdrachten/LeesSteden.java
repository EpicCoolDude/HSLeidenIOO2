package week1.Opdrachten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LeesSteden {

    public static void printStedenUitBestand(String bestandnaam){
        // Alle regels lezen en streamen. Dan de stream splitten op een spatie en omzetten naar een string.
        try {
            ArrayList<String> stedenArrayList = (ArrayList<String>) Files.readAllLines(Paths.get(bestandnaam))
                    .stream()
                    .map(l -> l.split(" "))
                    .flatMap(Arrays::stream)
                    .collect(Collectors.toList());

            // Elk woord / element omzetten naar string en elementen met cijfers verwijderen met regex.
            for (String stad : stedenArrayList) {
                String newValue = stad;
                newValue = newValue.replaceAll("[^aA-zZ]", "");
                stedenArrayList.set(stedenArrayList.indexOf(stad), newValue);
            }
            // Lege elementen verwijderen
            stedenArrayList.removeIf(String::isBlank);

            // Hier elk overgebleven stad element printen naar de console
            stedenArrayList.forEach(stad -> System.out.println(stad));

        } catch (IOException ioe) {
            System.out.printf("\nKan %s niet vinden \n",bestandnaam);
            ioe.printStackTrace();
        }
    }
}
