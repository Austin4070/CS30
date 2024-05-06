public class LeapYear {
    private int year;

 
    public LeapYear(int yr) {
        year = yr;
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}