package com.yxf.backstage.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yxf.backstage.domain.Users;

@Mapper
public interface UsersDao {
	/**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM users WHERE user_name = #{name}")
    Users findUserByName(@Param("name") String name);

    /**
     * 通过名字查询用户信息
     */
    @Select("SELECT * FROM users WHERE user_name = #{name} and password = #{password}")
    Users loginUser(@Param("name") String name,@Param("password") String password);
    
    /**
     * 查询所有用户信息
     */
    @Select("SELECT * FROM users")
    List<Users> findAllUser();

    /**
     * 插入用户信息
     */
    @Insert("INSERT INTO users(user_name,nick_name, password,phone,tel,create_time,create_by,update_time,update_by) VALUES (#{name}, #{nickName}, #{password},#{phone},#{tel},#{createTime},#{createBy},#{updateTime},#{updateBy})")
    void insertUser(@Param("name") String name, @Param("nickName") String nickName,@Param("password") String password, @Param("phone") String phone,@Param("tel") String tel,@Param("createTime") String createTime,@Param("createBy") String createBy,@Param("updateTime") String updateTime,@Param("updateBy") String updateBy);
    
    /**
     * 根据 id 更新用户信息
     */
    @Update("UPDATE  users SET nick_name = #{name},phone = #{phone},tel= #{tel} WHERE id = #{id}")
    void updateUser(@Param("name") String name, @Param("phone") String phone, @Param("tel") String tel,@Param("id") Long id);

    /**
     * 根据 id 删除用户信息
     */
    @Delete("DELETE from users WHERE id = #{id}")
    void deleteUser(@Param("id") Long id);
}
