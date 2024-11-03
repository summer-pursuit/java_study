package com.test;

import com.test.mapper.TestMapper;
import lombok.SneakyThrows;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.*;

import java.io.IOException;

@Log
public class MainTest {
    private static SqlSessionFactory factory;

    @BeforeAll

    @SneakyThrows
    public static void before(){
        factory=new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsReader("mybatis-config.xml")
        );
    }
    @DisplayName("数据库测试")
    @RepeatedTest(3)
    public void test() throws IOException {
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(
                Resources.getResourceAsReader("mybatis-config.xml")
        );
        try (SqlSession session=factory.openSession(true)){
            TestMapper mapper=session.getMapper(TestMapper.class);
            System.out.println(mapper.getStudentBySid(20000001));

        }
      }
}
