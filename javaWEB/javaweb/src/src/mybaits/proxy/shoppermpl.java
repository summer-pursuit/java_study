package mybaits.proxy;

public class shoppermpl implements Shopper{
    @Override
    public void saleWatermelon(String customer){
        System.out.println("成功出售西瓜给---》"+customer);
    }
}
