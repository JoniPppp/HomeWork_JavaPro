package HomeWork4;

public class Car {
    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
    }
    private void startElectricity(){
        System.out.println("Напругу подано.");
    }
    private void startCommand(){
        System.out.println("Команда старт.");
    }
    private void startFuelSystem(){
        System.out.println("Запалення ввімкнуто.");
    }
}
