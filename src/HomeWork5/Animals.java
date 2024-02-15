package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class Animals implements Running, Swimming{
    String name;
    static List<Observer> subscribers = new ArrayList<>();


    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }


    public Animals addCat(String name) {
        Animals res = null;
        res = new Cat(name);
        notifyObservers(res);
        return res;
    }
    public Animals addDog(String name) {
        Animals res = null;
        res = new Dog(name);
        notifyObservers(res);
        return res;
    }

    public void addObserver(Observer observer) {
        Animals.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        Animals.subscribers.remove(observer);
    }
    public void notifyObservers(Animals animal) {
        for (Observer observer: subscribers){
            observer.addAnimal(animal);
        }
    }

    @Override
    public void run(double path) {

    }

    @Override
    public void swim(double path) {

    }
}
