package week1.Voorbeelden;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes_JavaIO {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null; FileOutputStream out = null;

        try {
            in = new FileInputStream("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/orgineel.txt");
            out = new FileOutputStream("/home/tim/Documents/IOO2/iooa-opdrachten_2020-2021/week_1/kopie_tekst.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
                }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (in != null) {
                in.close();
                }
            if (out != null) { out.close();
                }
            }
    }
}
