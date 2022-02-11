package week1.Opdrachten;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SchrijfStedenVersie2 {

    public static void schrijfStedenNaarBestand(String bestandnaam){

        String fileName = bestandnaam;
        File myFile;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            myFile = new File(fileName);
            fileWriter = new FileWriter(myFile, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print("Amsterdam 900000\n");
            printWriter.print("Bunnik 500\n");


        } catch (IOException ioe) {
            System.out.println("Exception opgetreden: " + ioe.toString());
            System.out.println("Stack trace:");
            ioe.printStackTrace();
        } finally {
            printWriter.close();

            try {
                fileWriter.close();
            } catch (IOException ioe) {
            }
        }
    }

}
