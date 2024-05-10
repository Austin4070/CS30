public class LoopStats {
    private int start;
    private int stop;

    public LoopStats(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    public int sumNumbers() {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }

    public int countOdds() {
        int count = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int countEvens() {
        int count = 0;
        for (int i = start; i <= stop; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}