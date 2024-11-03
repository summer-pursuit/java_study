package mybaits;

import mybaits.entity.Student;
import mybaits.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Main1 {
    public static void main(String[] args) {
        try(SqlSession session=MybatisUtil.getSession(true)){
            TestMapper mapper=session.getMapper(TestMapper.class);
            System.out.println(mapper.getStudentBySid(20000002));
            System.out.println(mapper.getTeacherByTid(10000001));

        }
    }
}
