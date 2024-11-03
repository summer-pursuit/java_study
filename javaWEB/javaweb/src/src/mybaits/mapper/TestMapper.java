package mybaits.mapper;

import mybaits.entity.Student;
import mybaits.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@CacheNamespace(readWrite = false)
public interface TestMapper {
    @Insert("insert into study.student(sid,name,sex) values (#{sid},#{name},#{sex})")
    int addStudent(Student student);
    @Results({
            @Result(column = "sid",property = "sid"),
            @Result(column = "name",property = "sex"),
            @Result(column = "sex",property = "name")
    })
    @Select("select * from study.student where sid=#{sid}")
    Student getStudentBySid(int sid);


    @Select("select * from study.student where sid = #{sid} and sex = #{sex}")
    Student getStudentBySidAndSex(@Param("sid") int sid, @Param("sex") String sex);

    @Results({
            @Result(column = "tid",property = "tid"),
            @Result(column = "name",property = "name"),
            @Result(column = "tid",property = "studentList",many=
            @Many(select = "getStudentByTid"))
    })
    @Select("select * from study.teacher where tid=#{tid}")
    Teacher getTeacherByTid(int Sid);
    @Select("select * from study.student inner join study.teach on student.sid = teach.sid where tid =#{tid}")
    List<Student> getStudentByTid(int Tid);


}
