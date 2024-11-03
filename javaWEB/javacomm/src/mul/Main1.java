package mul;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Main1 {
    private static Queue<Object> queue=new LinkedList<>();
    public static void main(String[] args) {
        new Thread(Main1::add,"厨师1").start();
        new Thread(Main1::add,"厨师2").start();
        new Thread(Main1::take,"消费者1").start();
        new Thread(Main1::take,"消费者2").start();
        new Thread(Main1::take,"消费者3").start();

    }
    private static void add(){
        while(true){
            try {
                Thread.sleep(3000);
                synchronized (queue) {
                    String name=Thread.currentThread().getName();
                    System.out.println(new Date()+" "+name+"出餐了！！");
                    queue.offer(new Object());
                    queue.notifyAll();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static void take(){
        while(true){
            try {
                synchronized (queue) {
                    while (queue.isEmpty()) queue.wait();
                    queue.poll();
                    String name=Thread.currentThread().getName();
                    System.out.println(new Date() + " " + name + "拿到餐品，正在享用！！");
                }
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
