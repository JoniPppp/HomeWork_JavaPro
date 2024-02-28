package HomeWork7.phonebook;

public class Record {
    private String name;
    private String telephone;

    public Record(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Telephone: " + this.getTelephone();
    }
}
