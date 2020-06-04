package com.atguigu.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author shkstart
 * @create 2020-06-01 16:16
 */

@Entity //当前类为实体类
@Table(name = "user2") //实体类与那个表映射
public class User implements Serializable {

    @Id  //生成当前字段为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //相当于自增长
    private Integer id;

   // @Column(name = "username")  //指定字段名
    private String username;
    //@Column(name ="password")
    private String password;
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public User() {
    }

    public User(Integer id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
