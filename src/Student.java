public class Student extends Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private double gpa;

    public Student() {
        this.id = id_gen++;
    }

    public Student(String name, String surname, double gpa) {
        this();
        this.setName(name);
        this.setSurname(surname);
        this.setGpa(gpa);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String name) {
        this.surname = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
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

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "Student: " + id + ". " + name + " " + surname + " earns " + getPaymentAmount();
    }

    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.0 : 0.0;
    }

    public int compareTo(Person o) {
        return Double.compare(this.getPaymentAmount(), o.getPaymentAmount());
    }
}
