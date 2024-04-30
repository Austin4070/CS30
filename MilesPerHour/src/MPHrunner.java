import java.util.Scanner;

public class MPHrunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance traveled in miles: ");
        int distance = scanner.nextInt();

        System.out.print("Enter the elapsed time in hours: ");
        int hours = scanner.nextInt();

        System.out.print("Enter the remaining minutes: ");
        int minutes = scanner.nextInt();

        MilesPerHour mph = new MilesPerHour(distance, hours, minutes);

        double speed = mph.calculateSpeed();
        System.out.println("Speed in miles per hour: " + speed);
    }
}