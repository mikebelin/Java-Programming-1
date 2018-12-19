
public class Main {

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Nick", "040-123456");
        phonebook.add("Minttu Kivi", "045-123654");
        phonebook.add("Jack Kull", "040-345543");

        phonebook.printAll();
    }
}