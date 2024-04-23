public class BigOrSmallRunner {
    public static void main(String[] args) {
        BigOrSmall comparator = new BigOrSmall();

        
        int a = 5;
        int b = 3;

        String result = comparator.compare(a, b);
        System.out.println(result); 
    }
}