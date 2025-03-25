public class Auto {

    private Person owner;

    public Auto(Person owner) {
        this.owner = owner;
    }

    public String toString() {
        return "Auto von " + this.owner.getName();
    }
}
