package week2.AnimalFarm;

import java.util.ArrayList;

public class AnimalNoise {

    public void makeNoises(ArrayList<Animal> animals){
        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.speak();

        }
    }
}
