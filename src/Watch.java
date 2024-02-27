public class Watch {
    private int hours;
    private int minutes;
    private int seconds;

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
        return seconds;
    }

    public void tick() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes == 60) {
            minutes = 0;
            hours++;
        }

        if (hours == 24){
            hours = 0;
            minutes = 0;
            seconds++;
        }
    }

    public String toPrettyString() {
        String output = "";

        if (hours < 10) {
            output += "0" + hours;
        } else {
            output += hours;
        }

        output += ":";

        if (minutes < 10) {
            output += "0" + minutes;
        } else {
            output += minutes;
        }

        output += ":";

        if (seconds < 10) {
            output += "0" + seconds;
        } else {
            output += seconds;
        }

        return output;

    }


}
