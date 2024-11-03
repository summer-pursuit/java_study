package mul;

public class lirang {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            System.out.println("线程1 开始");
            for (int i=0;i<60;i++){
                System.out.println("线程1："+i);
            }
            System.out.println("线程1 结束！");
        });
        Thread t2=new Thread(()->{
            System.out.println("线程2 开始");
            for (int i=0;i<60;i++){
                System.out.println("线程2："+i);
                if(i==10){
                    try {
                        System.out.println("线程1 加入");
                        t1.join();

                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("线程2 结束！");
        });

        t1.start();
        t2.start();
    }
}
