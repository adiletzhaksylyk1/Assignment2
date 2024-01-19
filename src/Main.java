import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon", "Teacher", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Actor", 50000.0);
        Student student1 = new Student("Ringo", "Starr", 2.3);
        Student student2 = new Student("Paul", "McCortney", 3.79);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(employee1);
        persons.add(employee2);
        persons.add(student1);
        persons.add(student2);

        Collections.sort(persons);
        printData(persons);
    }
}
