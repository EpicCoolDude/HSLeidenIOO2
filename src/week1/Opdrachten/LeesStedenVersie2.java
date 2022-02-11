package week1.Opdrachten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class LeesStedenVersie2 {

    //gebruikte bron: https://www.geeksforgeeks.org/reading-text-file-into-java-hashmap/
    public static Map<String, String> hashMapFromTextFile(String bestandsnaam) {

            Map<String, String> map = new HashMap<String, String>();
            BufferedReader br = null;
            try {
                // Aanmaken file object
                File file = new File(bestandsnaam);

                // Aanmaken BufferedReader object from the File
                br = new BufferedReader(new FileReader(file));

                String line = null;

                // Lees bestands regel voor regel
                while ((line = br.readLine()) != null) {

                    // Regel voor regel splitsen op spatie SPACE :
                    String[] parts = line.split(" ");

                    // Eerste deel key is stadnaam, volgende deel value is de omzet als String
                    String name = parts[0].trim();
                    String number = parts[1].trim();

                    // Zet stadnaam en omzet in HashMap en controleer of ze niet leeg zijn
                    if (!name.equals("") && !number.equals(""))
                        map.put(name, number);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {

                // Buffer reader leeg maken
                if (br != null) {
                    try {
                        br.close();
                    }
                    catch (Exception e) {
                    };
                }
            }
            return map; // map terug geven
        }
}

