package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    String name;
    AnimalsTypes animalType;
    static List<Observer> subscribers = new ArrayList<>();

    public Animals() {
    }

    public Animals(String name, AnimalsTypes animalType) {
        this.name = name;
        this.animalType = animalType;
    }

    enum AnimalsTypes {
        CAT, DOG;
    }


    public Animals createAnimal(AnimalsTypes animalType, String name) {
        Animals res = null;
        switch (animalType){
            case CAT:
                res = new Cat(name, animalType);
                break;
            case DOG:
                res = new Dog(name, animalType);
                break;
        }
        notifyObservers(res.animalType);
        return res;
    }

    public void addObserver(Observer observer) {
        Animals.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        Animals.subscribers.remove(observer);
    }
    public void notifyObservers(AnimalsTypes animalType) {
        for (Observer observer: subscribers){
            observer.addAnimal(animalType);
        }
    }
    public void run(double path) {

    }


    public void swim(double path) {

    }
}
