package mybaits;

import lombok.extern.java.Log;
import mybaits.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

@Log
public class TestMain {

    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before(){
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(new FileInputStream("C:\\Users\\29753\\Desktop\\project\\java\\javaWEB\\mybatis-config.xml"));
            LogManager manager = LogManager.getLogManager();
            manager.readConfiguration(new FileInputStream("C:\\Users\\29753\\Desktop\\project\\java\\javaWEB\\test.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        try(SqlSession sqlSession = sqlSessionFactory.openSession(true)){
            TestMapper mapper = sqlSession.getMapper(TestMapper.class);
            log.info(mapper.getStudentBySidAndSex(20000001, "男").toString());
            log.info(mapper.getStudentBySidAndSex(20000001, "男").toString());
        }
    }
}