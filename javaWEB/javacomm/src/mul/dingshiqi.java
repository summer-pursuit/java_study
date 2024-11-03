package mul;

import java.util.Timer;
import java.util.TimerTask;

public class dingshiqi {
    public static void main(String[] args) throws InterruptedException {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我睡觉水水水水");
            }
        },3000,1000);
        Thread.sleep(5000);
        timer.cancel();
    }
}
