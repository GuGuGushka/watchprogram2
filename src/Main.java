import java.util.Timer;
import java.util.TimerTask;
public class Main {

    public static Watch someFunc(){
        return new Watch(0, 0, 0);
    }
    public static void main(String[] args) {
        Watch watch = someFunc();
        boolean islife = true;
        Timer timer = new Timer();
        long delay = 1000L;
        long peroid = 1000L;

        while (islife) {
            TimerTask task = new TimerTask() {
                public void run() {
                    System.out.println(watch.getHours() + ":" + watch.getMinutes() + ":" + watch.getSeconds());
                }

            };
            timer.scheduleAtFixedRate(task, delay, peroid);
        }
    }
}