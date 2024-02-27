import HomeWork4.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class HomeWork4_test {
    private String firstName = "John";
    private String lastName = "Gabo";
    private String position = "Junior Java Developer";
    private String email = "test@test.com";
    private String phoneNumber = "12345678";
    private byte age = 25;
    @Test
    public void Employee1() {
        Employee emp = new Employee(firstName,lastName,position,email,phoneNumber,age);
        assertEquals(firstName,emp.getFirstName());
        assertEquals(lastName,emp.getLastName());
        assertEquals(position,emp.getPosition());
        assertEquals(email,emp.getEmail());
        assertEquals(phoneNumber,emp.getPhoneNumber());
        assertEquals(age,emp.getAge());
    }


}
