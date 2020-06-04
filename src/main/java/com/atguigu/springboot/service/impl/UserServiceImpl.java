package com.atguigu.springboot.service.impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserDao;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-06-02 20:23
 */

@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired  //自动装配 先bytype 在 by name
   // @Resource  // jdk 提供 先byname 后bytype
    UserDao userDao;

    @Autowired
    RedisTemplate redisTemplate; //操作任何兼职类型
    @Autowired
    StringRedisTemplate stringRedisTemplate; //操作字符串类型


    @Override
    public List<User> findAll() {
        // redis的key
        String key = "alluser";
        // 先查询redis中是否有数据，如果有直接返回redis的数据
        List<User> users = (List<User>) redisTemplate.boundValueOps(key).get();
        if (users!=null) {
            return users;
        }
        // 如果没有，查询数据库
        users = userDao.findAll();
        // 将数据库数据存入到redis中
        if (users != null && users.size()>0) {
            redisTemplate.boundValueOps(key).set(users);
        }
        return users;

    }


    /**
     * 根据id查询
     */
    @Override
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }
    /**
     * 保存
     */
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }
    /**
     * 更新
     */
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }
    /**
     * 根据id删除
     */
    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }


}
