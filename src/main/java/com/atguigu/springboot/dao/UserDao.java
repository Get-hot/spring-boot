package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-02 20:08
 */

@Repository  // 由sping ioc 容器管理
//@Mapper  //接口对象由mybatis 管理

//JpaRepository  jpa框架被boot继承  此接口已经提供crud
public interface UserDao extends JpaRepository<User,Integer> {

//    @Select("select * from user")
//    public List<User> findAll();
}
