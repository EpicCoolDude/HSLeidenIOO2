package week2.Opdrachten.Pizzas;

import java.util.ArrayList;
import java.util.Collections;

public class Pizzeria {
    public static void main(String[] args) {
        ArrayList<Pizza> pizzas = new ArrayList<>();
        Tonno tonno = new Tonno();
        Bolognese bolognese = new Bolognese();
        Calzone calzone = new Calzone();
        QuattroStagionni quattroStagionni = new QuattroStagionni();
        Hawaii hawaii = new Hawaii();
        Collections.addAll(pizzas, tonno, bolognese, calzone, quattroStagionni, hawaii);

        BigPizza bigPizza = new BigPizza();
        pizzas.add(bigPizza);

        for (int i = 0; i < pizzas.size(); i++) {     //gewone loop
            System.out.println((i + 1) + ". " + pizzas.get(i).getNaam() + ", "+pizzas.get(i).getPrijs());
        }
    }
}
