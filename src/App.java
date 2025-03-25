public class App {
    public static void main(String[] args) throws Exception {
        Person max = new Person("Max", "Mustermann", 42);
        Auto auto = new Auto(max);
        max.setAuto(auto);

        Date heute = new Date(25, 24, 2025);
        System.out.println(heute);
        // System.out.println(max);
    }
}
