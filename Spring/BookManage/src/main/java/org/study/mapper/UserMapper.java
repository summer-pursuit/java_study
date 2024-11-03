package org.study.mapper;

import org.apache.ibatis.annotations.Select;
import org.study.entity.Account;
import org.study.entity.Student;

import java.util.List;

public interface UserMapper {
    @Select("select * from user where username=#{username}")
    Account findUserByName(String username);

    @Select("select * from student")
    List<Student> getStudentList();
}
