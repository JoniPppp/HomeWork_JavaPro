package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    static List<Observer> subscribers = new ArrayList<>();

    public AnimalsFactory() {
    }


    public Cat addCat(String name) {
        Cat res = new Cat(name);
        notifyObservers(res);
        return res;
    }

    public Dog addDog(String name) {
        Dog res = new Dog(name);
        notifyObservers(res);
        return res;
    }

    public void addObserver(Observer observer) {
        AnimalsFactory.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        AnimalsFactory.subscribers.remove(observer);
    }

    public void notifyObservers(Animal animal) {
        for (Observer observer : subscribers) {
            observer.recalcAnimalsCount(animal);
        }
    }

}
