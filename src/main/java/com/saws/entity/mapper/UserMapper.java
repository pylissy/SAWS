package com.saws.entity.mapper;

import com.saws.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Insert;
import java.util.List;

@Mapper
public interface UserMapper {
    @Select(" select * from user where id = #{user_id} ")
    public User getUser_id(String id);

    @Insert(" insert into user values (#{user_id},#{user_password},#{user_name},#{user_phone},#{user_address},#{user_age},#{user_gender}) ")
    public int addUser(User usr);

    @Select(" select * from user")
    public List<User>  List();
}

