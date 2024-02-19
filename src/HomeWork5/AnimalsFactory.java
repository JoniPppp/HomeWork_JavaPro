package HomeWork5;

import java.util.ArrayList;
import java.util.List;

public class AnimalsFactory {
    static List<Observer> subscribers = new ArrayList<>();

    public AnimalsFactory() {
    }


    public Cat addCat(String name) {
        Cat res = new Cat(name);
        notifyObserversCat(res);
        return res;
    }

    public Dog addDog(String name) {
        Dog res = new Dog(name);
        notifyObserversDog(res);
        return res;
    }

    public void addObserver(Observer observer) {
        AnimalsFactory.subscribers.add(observer);
    }

    public void removeObserver(Observer observer) {
        AnimalsFactory.subscribers.remove(observer);
    }

    public void notifyObserversCat(Cat cat) {
        for (Observer observer : subscribers) {
            observer.recalcCatsCount(cat);
        }
    }
    public void notifyObserversDog(Dog dog) {
        for (Observer observer : subscribers) {
            observer.recalcDogsCount(dog);
        }
    }

}
