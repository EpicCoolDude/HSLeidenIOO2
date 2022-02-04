package week1.Voorbeelden;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Test {

    public static void main(String[] args) {

        ArrayList<String> personen = new ArrayList<String>();
        personen.add("Klaas Vaak");
        personen.add("Het Zandmannetje");
        personen.add("Sint-Niklaas");
        personen.add("Sint-Maarten");

        System.out.println("Aantal = " + personen.size());

        for (int i = 0; i < personen.size(); i++) {     //gewone loop
            System.out.println((i + 1) + "." + personen.get(i) + "\t");
        }

        System.out.println();

        Iterator it = personen.iterator();              // dmv een iterator

        while (it.hasNext()) {
            System.out.println(it.next() + "\t");
        }

        System.out.println();

        for (String p : personen) {                       // dmv enhanced loop
            System.out.println("." + p + "\t");
        }


    }
}
