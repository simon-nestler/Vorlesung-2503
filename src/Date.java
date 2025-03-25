public class Date {
    private int day = 1;
    private int month = 1;
    private int year = 1970;

    public Date(int day, int month, int year) {
        this.day = day;
        setMonth(month);
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 1;
        }
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
