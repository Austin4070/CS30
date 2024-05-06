import java.util.Scanner;

public class LeapYearRunner {
    public static void main(String[] args) {
        try (Scanner Scanner = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = Scanner.nextInt();

            LeapYear leapYear = new LeapYear(year);

            if (leapYear.isLeapYear()) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }
}