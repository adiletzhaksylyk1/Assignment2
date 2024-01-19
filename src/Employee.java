public class Employee extends Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;
    private double salary;

    public Employee() {
        this.id = id_gen++;
    }

    public Employee(String name, String surname, String position, double salary) {
        this();
        this.setName(name);
        this.setSurname(surname);
        this.setPosition(position);
        this.setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee: " + id + ". " + name + " " + surname + " earns " + getPaymentAmount();
    }

    public double getPaymentAmount() {
        return salary;
    }

    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
