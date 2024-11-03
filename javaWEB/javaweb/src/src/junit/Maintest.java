package junit;
import mybaits.entity.Student;

import mybaits.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Maintest {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before(){
        System.out.println("测试前置正在初始化...");
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(new FileInputStream("mybatis-config.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("测试初始化完成，正在开始测试案例...");
    }

    @Test
    public void method1(){
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)){
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            System.out.println("测试用例1通过！");
        }
    }

    @Test
    public void method2(){
        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)){
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);

            System.out.println("测试用例2通过！");
        }
    }
}

