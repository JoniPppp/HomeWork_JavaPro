import HomeWork7.collections.CollectionsProcessor;
import HomeWork7.phonebook.PhoneBook;
import HomeWork7.phonebook.Record;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWork7_test {
    @Test
    public void testCreateCP() {
        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();
    }

    @Test
    public void test_countOccurance() {
        List<String> list = new LinkedList<>();
        String string = "around";
        int count = 0;

        list.add("What");
        list.add("goes");
        list.add(string);
        count++;
        list.add("comes");
        list.add("around.");
        list.add("What");
        list.add("goes");
        list.add(string);
        count++;
        list.add("comes");
        list.add("around.");
        list.add("What");
        list.add("goes");
        list.add(string);
        count++;
        list.add("comes");
        list.add("around.");

        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();

        assertEquals(count, collectionsProcessor.countOccurance(list, string));
    }

    @Test
    public void test_toList() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> etalon_list = new LinkedList<>();
        etalon_list.add(array[0]);
        etalon_list.add(array[1]);
        etalon_list.add(array[2]);
        etalon_list.add(array[3]);
        etalon_list.add(array[4]);
        etalon_list.add(array[5]);
        etalon_list.add(array[6]);
        etalon_list.add(array[7]);

        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();

        assertEquals(etalon_list, collectionsProcessor.toList(array));
    }

    @Test
    public void test_findUnique() {
        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> etalon_list = new ArrayList<>();

        list.add(90);
        list.add(31);
        list.add(56);
        list.add(9);
        list.add(7);
        etalon_list.add(7);
        list.add(2);
        etalon_list.add(2);
        list.add(1);
        etalon_list.add(1);
        list.add(3);
        etalon_list.add(3);
        list.add(4);
        etalon_list.add(4);
        list.add(5);
        etalon_list.add(5);
        list.add(6);
        etalon_list.add(6);
        list.add(76);
        list.add(8);
        etalon_list.add(8);
        list.add(10);
        etalon_list.add(10);
        list.add(90);
        list.add(31);
        list.add(56);
        list.add(56);
        list.add(76);
        list.add(24);
        list.add(25);
        etalon_list.add(25);
        list.add(24);
        list.add(9);

        ArrayList<Integer> uniqueList = collectionsProcessor.findUnique(list);

        assertEquals(etalon_list, uniqueList);
    }

    @Test
    public void test_calcOccurance() {
        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();
        ArrayList<String> list = new ArrayList<>();

        list.add("bird");
        list.add("deer");
        list.add("tiger");
        list.add("tiger");
        list.add("dog");
        list.add("rat");
        list.add("ant");
        list.add("dog");
        list.add("deer");
        list.add("ant");
        list.add("bird");
        list.add("tiger");
        list.add("fox");
        list.add("rat");
        list.add("rat");
        list.add("ant");
        list.add("fox");
        list.add("lion");
        list.add("tiger");
        list.add("dog");
        list.add("rat");
        list.add("ant");
        list.add("bird");

        collectionsProcessor.calcOccurance(list);
    }

    @Test
    public void test_findOccurance() {
        CollectionsProcessor collectionsProcessor = new CollectionsProcessor();
        ArrayList<String> list = new ArrayList<>();

        list.add("bird");
        list.add("deer");
        list.add("tiger");
        list.add("tiger");
        list.add("dog");
        list.add("rat");
        list.add("ant");
        list.add("dog");
        list.add("deer");
        list.add("ant");
        list.add("bird");
        list.add("tiger");
        list.add("fox");
        list.add("rat");
        list.add("rat");
        list.add("ant");
        list.add("fox");
        list.add("lion");
        list.add("tiger");
        list.add("dog");
        list.add("rat");
        list.add("ant");
        list.add("bird");

        collectionsProcessor.findOccurance(list);
    }

    @Test
    public void test_phoneBook() {
        Record record = new Record("Joni", "121131323");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(record);
        phoneBook.add(new Record("Mike", "23424234234"));
        phoneBook.add(new Record("Evan", "765432456"));
        phoneBook.add(new Record("Evan", "123132312"));
        phoneBook.add(new Record("Jane", "9876546566"));
        phoneBook.add(new Record("David", "44466567"));

        System.out.println(phoneBook.find("Jane"));
        System.out.println(phoneBook.findAll("Evan"));
    }
}
