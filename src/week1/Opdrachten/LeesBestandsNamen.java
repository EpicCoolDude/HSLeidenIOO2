package week1.Opdrachten;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LeesBestandsNamen {

    // De lange methode
    public static void printBestandsNamen(String folder){
        String path = folder;                                           // path opslaan als string onder goede naam
        ArrayList<String> arrayListFiles = new ArrayList<String>(       // arraylist vullen met alle files in map
                Stream.of(new File(path).listFiles())
                        .filter(file -> !file.isDirectory())
                        .map(File::getName)
                        .collect(Collectors.toSet()));

        // Elk element uit de arrayListFiles ophalen en de details naar het scherm printen:
        for (String file : arrayListFiles){
            File fileFromArrayList = new File(path+"/"+file);
            System.out.println("File name: " + fileFromArrayList.getName());
            System.out.println("Absolute path: " + fileFromArrayList.getAbsolutePath());
            System.out.println("Writeable: " + fileFromArrayList.canWrite());
            System.out.println("Readable " + fileFromArrayList.canRead());
            System.out.println("File size in bytes " + fileFromArrayList.length());
            System.out.println("--------------------------------\n");
            }
    }

    // korte Java8 nio methode met mooie foutmelding wanneer pad niet toegankelijk is !
    // bron: https://howtodoinjava.com/java8/java-8-list-all-files-example/
    public static Set listFilesUsingFilesList(String folder) {
        try {
            List<File> files = Files.list(Paths.get(folder))        //array maken files
                    .map(Path::toFile)
                    .collect(Collectors.toList());

            files.forEach(file -> System.out.println(               // voor elk element in de array details printen naar console
                    "File name: "+file.getAbsolutePath()+
                    "\n Writable: "+file.canRead()+
                    "\n Readable: "+file.canWrite()+
                    "\n File size in bytes "+file.length()+
                    "\n\n"
            ));
        } catch (IOException e) {
            System.out.println("Error reading directory");
        }
        return null;
    }
}
