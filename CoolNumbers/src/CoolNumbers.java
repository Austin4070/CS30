public class CoolNumbers {

    public static boolean isCoolNum(int n) {
        return (n % 3 == 1) && (n % 4 == 1) && (n % 5 == 1) && (n % 6 == 1);
    }

    public static int countCoolNumbers(int n) {
        int count = 0;
        for (int i = 6; i <= n; i++) {
            if (isCoolNum(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 100; // Example value of n
        int coolCount = countCoolNumbers(n);
        System.out.println("Number of cool numbers between 6 and " + n + ": " + coolCount);
    }
}

