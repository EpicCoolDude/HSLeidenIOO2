package week3.Opdrachten.AnimalFarm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AnimalFarmApp {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); //Arraylist declareren

        // animal objecten aanmaken
        Duck duck01 = new Duck();
        Whale whale01 = new Whale();
        Dog dog01 = new Dog();
        Cat cat01 = new Cat();
        Lion lion01 = new Lion();

        // alle aangemaakte animals toevoegen aan de arrraylist
        Collections.addAll(animals,duck01,whale01,dog01,cat01,lion01);

        // method aanroepen die alle animals uit de lijst afgaat en via de interface de speak functie aanroept
        letTheAnimalSpeak(animals);

        // olifant opbject maken en toevoegen aan de arraylist
        Elephant elephant01 = new Elephant();
        animals.add(elephant01);

        // nog een keer de method aanroepen om alle dieren te laten spreken
        letTheAnimalSpeak(animals);
    }

    public static void letTheAnimalSpeak(ArrayList<Animal> theAnimals) {
        for (Animal a : theAnimals) {
            a.Speak();
        }
    }
}
