package week2.Opdrachten;

import java.util.ArrayList;

public class FigurenApp {

    public static void main(String[] args) {

        ArrayList<Figuur> figurenArrayList = new ArrayList<Figuur>();

        Figuur vierkant01 = new Vierkant(3,"groen","paars");
        Figuur vierhoek01 = new Vierhoek(4,5,"geel","blauw");
        Figuur driehoek01 = new Driehoek(5,7,3,"blauw","grijs");

        figurenArrayList.add(vierkant01);
        figurenArrayList.add(vierhoek01);
        figurenArrayList.add(driehoek01);

        for (Figuur f : figurenArrayList) {                       // dmv enhanced loop
            System.out.println("-" + f);
        }
    }
}
