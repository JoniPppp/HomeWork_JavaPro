package HomeWork5;

public class Dog extends Animal {

    public Dog(String name) {
        this.name = name;
        this.runMaxDistance = 500.0;
        this.swimMaxDistance = 10.0;
    }

    public void run(double path) {
        if (path <= runMaxDistance)
            System.out.println("Собака " + this.name + " пробіг " + path + " метрів.");

        else
            System.out.println("Собака " + this.name + " не може стільки бігати тому спить.");
    }

    public void swim(double path) {
        if (path <= swimMaxDistance) System.out.println("Собака " + this.name + " проплив " + path + " метрів.");
        else
            System.out.println("Собака " + this.name + " не може стільки плавати тому варто її рятувати.");
    }
}
