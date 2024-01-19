public abstract class Person implements Comparable<Person>, InterfacePayable {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
