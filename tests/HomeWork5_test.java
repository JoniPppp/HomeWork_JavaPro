import HomeWork5.Animals;
import HomeWork5.AnimalsObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class HomeWork5_test {
    final ByteArrayOutputStream output = new ByteArrayOutputStream();
    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(output));
    }

    @Test
    public void Test1() {
        final int catsCount = 3;
        final int dogsCount = 4;
        final int animalsCount = catsCount + dogsCount;

        Animals animals = new Animals();
        List<Animals> animalsList = new ArrayList<>();
        AnimalsObserver subscriber = new AnimalsObserver();

        animals.addObserver(subscriber);

        for (int i = 1; i<=catsCount; i++)
            animalsList.add(animals.addCat(""));

        for (int i = 1; i<=dogsCount; i++)
            animalsList.add(animals.addDog(""));

        assertEquals(catsCount,subscriber.getCatsCount());
        assertEquals(dogsCount,subscriber.getDogsCount());
        assertEquals(animalsCount,subscriber.getAnimalsCount());
    }
    @Test
    public void Test_Cat_run5() {
        final double runDistance = 5.0;
        final String catName = "Апі";

        final String runComp = "Кіт " + catName + " пробіг 5.0 метрів.";

        Animals animals = new Animals();
        Animals cat = animals.addCat(catName);
        cat.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }
    @Test
    public void Test_Dog_run5() {
        final double runDistance = 5.0;
        final String dogName = "Кой";

        final String runComp = "Собака " + dogName + " пробіг 5.0 метрів.";

        Animals animals = new Animals();
        Animals dog = animals.addDog(dogName);
        dog.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }
    @Test
    public void Test_Cat_run210() {
        final double runDistance = 210.0;
        final String catName = "Димок";

        final String runComp = "Кіт " + catName + " не може стільки бігати тому спить.";

        Animals animals = new Animals();
        Animals cat = animals.addCat(catName);
        cat.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }
    @Test
    public void Test_Dog_run210() {
        final double runDistance = 210.0;
        final String dogName = "Рекс";

        final String runComp = "Собака " + dogName + " пробіг 210.0 метрів.";

        Animals animals = new Animals();
        Animals dog = animals.addDog(dogName);
        dog.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }
    @Test
    public void Test_Cat_run510() {
        final double runDistance = 510.0;
        final String catName = "Димок";

        final String runComp = "Кіт " + catName + " не може стільки бігати тому спить.";

        Animals animals = new Animals();
        Animals cat = animals.addCat(catName);
        cat.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }
    @Test
    public void Test_Dog_run510() {
        final double runDistance = 510.0;
        final String dogName = "Рекс";

        final String runComp = "Собака " + dogName + " не може стільки бігати тому спить.";

        Animals animals = new Animals();
        Animals dog = animals.addDog(dogName);
        dog.run(runDistance);
        String actRes = output.toString().trim();
        assertEquals(runComp,actRes);
    }

    @Test
    public void Test_Cat_swim5() {
        final double swimDistance = 5.0;
        final String catName = "Димок";

        final String swimComp = "Кіт " + catName + " не вміє плавати тому варто його рятувати.";

        Animals animals = new Animals();
        Animals cat = animals.addCat(catName);
        cat.swim(swimDistance);
        String actRes = output.toString().trim();
        assertEquals(swimComp,actRes);
    }
    @Test
    public void Test_Dog_swim5() {
        final double swimDistance = 5.0;
        final String dogName = "Рекс";

        final String swimComp = "Собака " + dogName + " проплив 5.0 метрів.";

        Animals animals = new Animals();
        Animals dog = animals.addDog(dogName);
        dog.swim(swimDistance);
        String actRes = output.toString().trim();
        assertEquals(swimComp,actRes);
    }
}
