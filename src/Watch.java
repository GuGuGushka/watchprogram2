public class Watch {

    private static int hours;
    private static int minutes;
    private static int seconds;

    public Watch(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        while (seconds < 60){
            seconds += 1;
        }
        return seconds;
    }

}
