public class App {
    public static void main(String[] args) throws Exception {
        Person max = new Person("Max", "Mustermann", 42);
        Auto auto = new Auto(max);
        max.setAuto(auto);

        System.out.println(max);
    }
}
