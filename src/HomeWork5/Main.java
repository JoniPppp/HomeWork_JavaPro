package HomeWork5;

import java.util.ArrayList;
import java.util.List;

import static HomeWork5.Animals.*;

public class Main {
    public static void main(String[] args) {
        double runDistance = 300.0;
        double swimDistance = 10.0;
        Animals animals = new Animals();
        List<Animals> animalsList = new ArrayList<>();
        AnimalsObserver subscriber = new AnimalsObserver();

        animals.addObserver(subscriber);

        animalsList.add(animals.createAnimal(AnimalsTypes.CAT,"Апі"));
        animalsList.add(animals.createAnimal(AnimalsTypes.DOG,"Кой"));
        animalsList.add(animals.createAnimal(AnimalsTypes.CAT,"Смокі"));
        animalsList.add(animals.createAnimal(AnimalsTypes.DOG,"Арчі"));

        System.out.println("Собаки: " + subscriber.getDogsCount());
        System.out.println("Коти: " + subscriber.getCatsCount());
        System.out.println("Тварини: " + subscriber.getAnimalsCount());

        System.out.println();

        runCompetition(animalsList,runDistance,swimDistance);

    }
    private static void runCompetition(List<Animals> animals, double runDistance, double swimDistance){
        for (Animals k: animals){
            k.run(runDistance);
            k.swim(swimDistance);
        }
    }
}
