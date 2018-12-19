
import java.util.ArrayList;
import java.util.Iterator;

public class Phonebook {

    private ArrayList<Person> phoneBook = new ArrayList<Person>();

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.phoneBook.add(person);
    }

    public void printAll() {
        for (Person person : this.phoneBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person : this.phoneBook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}