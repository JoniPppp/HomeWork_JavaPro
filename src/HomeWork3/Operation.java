package HomeWork3;

public class Operation {
    protected void printThreeWords(){
        System.out.println("Orange");
        System.out.println();
        System.out.println("Banana");
        System.out.println();
        System.out.println("Apple");
    }
    protected void checkSumSign(){
        int a = -7;
        int b = 5;
        int c = a + b;
        String sumResult = (c >= 0) ? "Сума позитивна" : "Сума негативна";
        System.out.println(sumResult);
    }
    protected void printColor(){
        int value = 101;
        if (value <= 0) System.out.println("Червоний");
        if ((value > 0) && (value <= 100)) System.out.println("Жовтий");
        else System.out.println("Зелений");
    }
    protected void compareNumbers(){
        int a = 6;
        int b = 12;
        String compareResult = (a >= b) ? "a >= b" : "a < b";
        System.out.println(compareResult);
    }
    protected boolean validateSum(int a, int b){
        return ((a + b) >= 10) && ((a + b) < 20);
    }
    protected void validateNumberSign(int a){
        String sumResult = (a >= 0) ? "Передано позитивне число" : "Передано негативне число";
        System.out.println(sumResult);
    }
    protected boolean isNegative(int a){
        return (a < 0);
    }
    protected void stringPrint(String str, int n){
        for (int i = 0; i < n; i++) System.out.println(str);
    }
    protected boolean isLeap(int year){
        return ((year % 400) == 0) || (((year % 4) == 0) && ((year % 100) != 0));
    }
}
