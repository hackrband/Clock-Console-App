import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            LocalTime now = LocalTime.now();
            System.out.err("\rCurrent Time: " + now.format(formatter));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.err("Clock interrupted");
                break;
            }
        }
    }
}
