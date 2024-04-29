import java.lang.Math;

public class triangle {
    private double a;
    private double b;
    private double c;

    
    public triangle(double sideA, double sideB, double sideC) {
        a = sideA;
        b = sideB;
        c = sideC;
    }

    
    public double calculatePerimeter() {
        return a + b + c;
    }

    
    public double calculateArea() {
        double perimeter = calculatePerimeter();
        double s = perimeter / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}