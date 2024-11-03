package mul;

public class xianchengsuo {
    private static int i=0;
    public static void main(String[] args)throws InterruptedException {
        Object o=new Object();
        new Thread(()->{
            for(int j=0;j<100000;j++) {
                synchronized (o) {
                    i++;
                }
            }
        }).start();
        new Thread(()->{
            for(int j=0;j<100000;j++){
                synchronized (o) {
                    i++;
                }
            }
        }).start();
        Thread.sleep(5000);
        System.out.println(i);
    }
}
