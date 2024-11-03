package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.entity.Student;
import org.springframework.stereotype.Service;

public interface HelloMapper {
    @Select("select * from student where sid=#{sid}")
    Student findStudent(int sid);

}
