package HomeWork3;

public class HomeWorkApp {
    public static void main(String[] args) {
        int truckWeight = 15;
        int cargoWeight = 10;
        int userBalance = 5;
        String message = "|  |";
        int messageRepeat = 2;
        int year = 1908;

        Operation operation = new Operation();

        operation.printThreeWords();

        operation.checkSumSign();

        operation.printColor();

        operation.compareNumbers();

        System.out.println("Результат перевірки загальної ваги вантажівки (від 10 до 20 тон): " + operation.validateSum(truckWeight,cargoWeight));

        operation.validateNumberSign(userBalance);

        System.out.println("Результат перевірки чи відємний баланс: " + operation.isNegative(userBalance));

        operation.stringPrint(message,messageRepeat);

        System.out.println("Чи високосний " + year + " рік: " + operation.isLeap(year));
    }

}
