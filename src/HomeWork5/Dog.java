package HomeWork5;

public class Dog extends Animals {
    final double runMaxDistance = 500.0;
    final double swimMaxDistance = 10.0;
    public Dog(String name) {
        super(name);
    }

    public void run(double path) {
        if (path <= runMaxDistance)
            System.out.println("Собака " + this.name + " пробіг " + path + " метрів.");

        else
            System.out.println("Собака " + this.name + " не може стільки бігати тому спить.");
    }


    public void swim(double path) {
        if (path <= swimMaxDistance)
            System.out.println("Собака " + this.name + " проплив " + path + " метрів.");

        else
            System.out.println("Собака " + this.name + " не може стільки плавати тому варто її рятувати.");
    }
}
