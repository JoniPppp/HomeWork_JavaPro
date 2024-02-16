package HomeWork5;

public class Cat extends Animal implements Swimming, Running {
    public Cat(String name) {
        this.name = name;
        this.runMaxDistance = 200.0;
        this.swimMaxDistance = 0.0;
    }

    public void run(double path) {
        if (path <= runMaxDistance)
            System.out.println("Кіт " + this.name + " пробіг " + path + " метрів.");

        else
            System.out.println("Кіт " + this.name + " не може стільки бігати тому спить.");
    }


    public void swim(double path) {
        if (path <= swimMaxDistance)
            System.out.println("Кіт " + this.name + " проплив " + path + " метрів.");

        else
            System.out.println("Кіт " + this.name + " не вміє плавати тому варто його рятувати.");
    }

}
