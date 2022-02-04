package week1.Voorbeelden;

import java.io.File;

public class GetFileInfo {

    public static void main(String[] args) {
        File mijnBestand = new File("/home/tim/Documents/IOO2/iooa-2020-2021/week_1/Arraylist.pdf");
        if (mijnBestand.exists()) {
            System.out.println("File name: " + mijnBestand.getName());
            System.out.println("Absolute path: " + mijnBestand.getAbsolutePath());
            System.out.println("Writeable: " + mijnBestand.canWrite());
            System.out.println("Readable " + mijnBestand.canRead());
            System.out.println("File size in bytes " + mijnBestand.length());
        } else {
            System.out.println("Cannot find file. Check name and path");
        }
    }
}
