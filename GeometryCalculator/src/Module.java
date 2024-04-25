import java.util.Scanner;

public class Module {
    private static final double PI = Math.PI;

    public void calculatePerimeterOfRectangle(double length, double width) {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public void calculateSurfaceAreaOfCube(double side) {
        double surfaceArea = 6 * side * side;
        System.out.println("Surface area of the cube: " + surfaceArea);
    }

    public void calculateAreaOfCircle(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public void printMenuAndPerformCalculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a calculation:");
        System.out.println("1. Perimeter of a Rectangle");
        System.out.println("2. Surface area of a Cube");
        System.out.println("3. Area of a Circle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                calculatePerimeterOfRectangle(length, width);
                break;
            case 2:
                System.out.print("Enter side of the cube: ");
                double side = scanner.nextDouble();
                calculateSurfaceAreaOfCube(side);
                break;
            case 3:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                calculateAreaOfCircle(radius);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}