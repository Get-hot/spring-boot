package com.atguigu.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.atguigu.springboot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author shkstart
 * @create 2020-06-02 19:45
 */

/**
 * 注解编程代替xml
 *  面向对象编程，是java程序代码  xml面向结构化编程
 *  注解通过jvm虚拟机运行，xml通过dom4j解析
 */

//@Configuration

@SpringBootConfiguration  //自定义配置类
public class AppConfig {

    @Bean  //等价于<bean id="user2" class=...>
    public User user2(){
        return new User();
    }

    @ConfigurationProperties(prefix = "spring.datasource") //将数据库连接信息直接封装到数据源对象中
    @Bean
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setFilters("stat");
        return dataSource;
    }

}
