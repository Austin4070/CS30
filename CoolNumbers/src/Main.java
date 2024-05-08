import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's a cool number: ");
        int number = scanner.nextInt();
        
        if (isCoolNum(number)) {
            System.out.println(number + " is a cool number!");
        } else {
            System.out.println(number + " is not a cool number.");
        }
        
        scanner.close();
    }

    public static boolean isCoolNum(int n) {
        return n % 3 == 1 && n % 4 == 1 && n % 5 == 1 && n % 6 == 1;
    }
}