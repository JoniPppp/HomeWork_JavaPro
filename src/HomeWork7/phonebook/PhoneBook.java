package HomeWork7.phonebook;

import java.util.ArrayList;

public class PhoneBook {
    ArrayList<Record> records = new ArrayList<>();

    public void add(Record record) {
        this.records.add(record);
    }

    public Record find(String name) {
        Record record = null;
        for (Record k : this.records) {
            if (k.getName().equals(name)) {
                record = k;
                break;
            }
        }
        return record;
    }

    public ArrayList<Record> findAll(String name) {
        ArrayList<Record> record = new ArrayList<>();
        for (Record k : this.records) {
            if (k.getName().equals(name)) {
                record.add(k);
            }
        }
        return record;
    }
}
