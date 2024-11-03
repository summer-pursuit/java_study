package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.entity.Account;
import org.springframework.stereotype.Service;

public interface UserMapper {
    @Select("select * from user where username=#{username}")
    Account findAccountByName(String username);
}
