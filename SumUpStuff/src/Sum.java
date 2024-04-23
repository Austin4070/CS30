public class Sum {
    private int one;
    private int two;
    private int sum;

    
    public void setNums(int num1, int num2) {
        one = num1;
        two = num2;
    }

    
    public void calculateSum() {
        sum = one + two;
    }

    
    public void printSum() {
        System.out.println("Sum: " + sum);
    }
}