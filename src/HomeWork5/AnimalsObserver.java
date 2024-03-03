package HomeWork5;

public class AnimalsObserver implements Observer {
    private int dogsCount = 0;
    private int catsCount = 0;
    private int animalsCount = 0;

    @Override
    public void recalcCatsCount(Cat cat) {
        catsCount++;
        animalsCount++;
    }
    @Override
    public void recalcDogsCount(Dog dog) {
        dogsCount++;
        animalsCount++;
    }

    public int getDogsCount() {
        return dogsCount;
    }

    public int getCatsCount() {
        return catsCount;
    }

    public int getAnimalsCount() {
        return animalsCount;
    }
}
