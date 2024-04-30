public class MilesPerHour {
    private int distance;
    private int hours;
    private int minutes;

 
    public MilesPerHour(int dist, int hrs, int mins) {
        distance = dist;
        hours = hrs;
        minutes = mins;
    }

    public double calculateSpeed() {
        double totalTimeInHours = hours + (double) minutes / 60;
        return distance / totalTimeInHours;
    }
}