package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    @Insert("insert into useremail(username,email,password) values (#{username},#{email},#{password})")
    void createUser(@Param("username") String username, @Param("email") String email, @Param("password") String password);

}
