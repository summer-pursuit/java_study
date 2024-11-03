package org.book.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.book.entity.Student;

import java.util.List;

public interface TestMapper {
    @Select("select * from student")
    List<Student> getStudent();

    @Insert("insert into student (sid,name,sex) values (20222,'测试22','男')")
    void insertStudent();
}
