import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Watch watch = new Watch(0, 0, 0);

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println(watch.toPrettyString());

                watch.tick();
            }

        };
        timer.schedule(task, 0, 1000L);

    }
}