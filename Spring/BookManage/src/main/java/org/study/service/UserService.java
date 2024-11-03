package org.study.service;

import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.study.entity.Student;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<Student> getStudentList();

}
