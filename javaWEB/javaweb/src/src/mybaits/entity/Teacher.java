package mybaits.entity;

import lombok.Data;

import java.util.List;
@Data
public class Teacher {
    int tid;
    String name;
    List<Student> studentList;
}
