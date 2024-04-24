public class FahrenheitRunner {
    public static void main(String[] args) {
        Fahrenheit converter = new Fahrenheit();

        
        double fahrenheit1 = 98.6;
        double celsius1 = converter.convertToCelsius(fahrenheit1);
        System.out.println(fahrenheit1 + " Fahrenheit = " + celsius1 + " Celsius");

        double fahrenheit2 = 212;
        double celsius2 = converter.convertToCelsius(fahrenheit2);
        System.out.println(fahrenheit2 + " Fahrenheit = " + celsius2 + " Celsius");

        
    }
}
