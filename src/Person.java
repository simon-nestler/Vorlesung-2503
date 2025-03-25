public class Person {

    private String firstname;
    private String lastname;
    private int age;
    private Auto auto;

    public Person() {
        System.out.println("default: " + this);
        this.firstname = "John";
        this.lastname = "Doe";
        this.age = 0;
    }

    public Person(String firstname) {
        this();
        System.out.println("firstname: " + this);
        this.firstname = firstname;
    }

    public Person(String firstname, String lastname) {
        this(firstname);
        System.out.println("first und lastname: " + this);
        this.lastname = lastname;
    }

    public Person(int age) {
        this();
        System.out.println("age: " + this);
        this.age = age;
    }

    public Person(String firstname, String lastname, int age) {
        this(firstname, lastname);
        System.out.println("alles: " + this);
        this.age = age;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Person(Person p) {
        this(12);
        if (p != null) {
            this.firstname = p.firstname;
            this.lastname = p.lastname;
            this.age = p.age;
        }
    }

    public String getName() {
        return this.firstname + " " + this.lastname;
    }

    public String toString() {
        return "Person: " + this.firstname + " " + this.lastname +
                " (" + this.age + ") " + this.auto;
    }
}
