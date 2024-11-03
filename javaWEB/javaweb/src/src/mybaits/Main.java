package mybaits;

import mybaits.entity.Student;
import mybaits.mapper.TestMapper;
import mybaits.proxy.Shopper;
import mybaits.proxy.ShopperProxy;
import mybaits.proxy.shoppermpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Shopper impl=new shoppermpl();
        Shopper proxy=new ShopperProxy(impl);
        proxy.saleWatermelon("小青");


        }



    }
