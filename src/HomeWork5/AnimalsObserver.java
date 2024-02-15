package HomeWork5;

public class AnimalsObserver implements Observer{
    private int dogsCount = 0;
    private int catsCount = 0;
    private int animalsCount = 0;
    @Override
    public void addAnimal(Animals.AnimalsTypes animalType) {
        switch (animalType){
            case CAT:
                catsCount++;
                break;
            case DOG:
                dogsCount++;
                break;
        }
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
