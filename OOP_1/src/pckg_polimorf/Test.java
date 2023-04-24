package pckg_polimorf;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Device smart = new SmartTV();
        smart.powerOnDevice(20);
        smart.powerOnDevice(20, "Petar");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Tiger());
        animals.add(new Tiger());
        animals.add(new RubberAnimal());
        producingAnimalSounds(animals);
        Tiger tiger = new Tiger();
        // da je konstruktor 'Animal', a ne 'Tiger' ne bi mogli pozvati 'huntPrey' jer 'Tiger'
        // extenda 'Animal' sto znaci da moze koristiti samo metode iz klase 'Animal'
        tiger.huntPray();
    }

    private static void producingAnimalSounds(ArrayList<Animal> animals){
        for (Animal animal: animals){
            animal.produceSomeSound();
        }
    }
}
