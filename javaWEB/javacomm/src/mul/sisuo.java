package mul;

public class sisuo {
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        new Thread(()->{
            synchronized (o1){
                try {
                    System.out.println("线程开始");
                    Thread.sleep(1000);
                    System.out.println("开始等待");
                    o1.wait();
                    System.out.println("等待结束！");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("结束1");
            }
        }).start();

        new Thread(()->{
            synchronized (o1){
                System.out.println("我拿到锁了！！！");
                o1.notify();
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("结束2");


            }
        }).start();

    }
}
