package com.hcp.microcourse.domain;

import java.util.List;
import com.hcp.microcourse.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public  interface UserMapper {
    @Insert("insert into users(name,email) values(#{name},#{email})")
    User insert(User user);

    @Select("select * from users where id = #{id}")
    User findById(Long id);

    @Select("select * from users;")
    List<User> findAll();
}

