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
        System.out.println(tonno.getNaam());
        System.out.println(tonno.getPrijs());
    }
}
