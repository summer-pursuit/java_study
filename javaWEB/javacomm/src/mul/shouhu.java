package mul;

public class shouhu {
    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    System.out.println("我是守护线程");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.setDaemon(true);
        t.start();
        for (int i=0;i<5;i++){
            Thread.sleep(1000);
        }

    }
}
