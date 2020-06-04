package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-02 20:24
 */

@Service
public interface UserService {

    List<User> findAll();

    /**
     * 根据id查询
     */
    public User findUserById(Integer id) ;
    /**
     * 保存
     */

    public void saveUser(User user);
    /**
     * 更新
     */

    public void updateUser(User user) ;
    /**
     * 根据id删除
     */

    public void deleteUserById(Integer id);

}
