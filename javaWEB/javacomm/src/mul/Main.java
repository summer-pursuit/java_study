package mul;

public class Main {
    public static void main(String[] args) {
     Thread t=new Thread(()->{
         while(true){
             System.out.println("开始：");
//             Thread.currentThread().suspend();
             System.out.println("继续：");
             }
     });
     t.start();
     try{
         Thread.sleep(3000);
//         t.resume();
     }catch (InterruptedException e){
         e.printStackTrace();
     }
    }
}
