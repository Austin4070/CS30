public class LoopStatsRunner {
    public static void main(String[] args) {
        LoopStats stats = new LoopStats(1, 10);
        System.out.println("Sum of numbers: " + stats.sumNumbers());
        System.out.println("Number of odd numbers: " + stats.countOdds());
        System.out.println("Number of even numbers: " + stats.countEvens());
    }
}