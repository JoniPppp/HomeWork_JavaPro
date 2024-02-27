package HomeWork4;

public class HomeWork4 {
    public static void main(String[] args) {
        Employee employee = new Employee("John","Garret","CEO",
                                        "garret@acorn.com","+123459678102",(byte)47);
        System.out.println("The employee was selected: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhoneNumber());
        System.out.println("Age: " + employee.getAge());

        System.out.println();

        Car car = new Car();
        car.start();
    }
}
