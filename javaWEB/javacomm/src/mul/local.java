package mul;

public class local {
    public static void main(String[] args) {
        ThreadLocal<String> local=new ThreadLocal<>();
        local.set("hello world");
        new Thread(()->{
            System.out.println(local.get());
        }).start();
    }
}
