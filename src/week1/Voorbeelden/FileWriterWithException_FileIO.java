package week1.Voorbeelden;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterWithException_FileIO {
    String fileName = "/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/rekening.txt";
    File myFile;
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;

    public static void main(String[] args) {
        FileWriterWithException_FileIO appschrijf = new FileWriterWithException_FileIO();
        appschrijf.schrijfNaarFile();
    }

    public void schrijfNaarFile() {

        try {
            this.myFile = new File(fileName);
            this.fileWriter = new FileWriter(myFile, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.print("4444 ");
            printWriter.print("44.00\n");

            System.out.println("String naar file geschreven");

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
