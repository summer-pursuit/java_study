package com.test;

import com.test.entity.Student;
import com.test.mapper.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class Main {
        public static void main(String[] args) throws IOException {
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(
                    Resources.getResourceAsReader("mybatis-config.xml")
            );
            try (SqlSession session=factory.openSession(true)){
                TestMapper mapper=session.getMapper(TestMapper.class);
                System.out.println(mapper.getStudentBySid(20000001));

            }

        }
}
