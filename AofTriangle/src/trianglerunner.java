import java.util.Scanner;

public class trianglerunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the length of side c: ");
        double c = scanner.nextDouble();

        triangle triangle = new triangle(a, b, c);
        
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
    }
}