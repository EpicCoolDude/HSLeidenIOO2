package week2.AnimalFarm;

import java.util.ArrayList;

public class AnimalFarm2 {

    public static void main(String[] args) {
        // nieuwe arraylist maken
        ArrayList<Animal> animalArrayList = new ArrayList<Animal>();

        // instanties maken van de classes en deze toevoegen aan de gemaakte arraylist
        Animal cat = new Cat();
        animalArrayList.add(cat);

        Animal dog = new Dog();
        animalArrayList.add(dog);

        Animal duck = new Duck();
        animalArrayList.add(duck);

        // instantie maken van de animalnoise class en dan de functie starten met de animalarraylist als parameter
        AnimalNoise noise = new AnimalNoise();
        noise.makeNoises(animalArrayList);
    }
}
