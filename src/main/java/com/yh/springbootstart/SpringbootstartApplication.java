package com.yh.springbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用程序的启动引导类(bootstrap class),也是主要的Spring配置类
 */
//该注解开启组件扫描和自动配置,结合了Configuration,ComponentScan,EnableAutoConfiguration三个注解
@SpringBootApplication
public class SpringbootstartApplication {

    public static void main(String[] args) {
        //负责启动引导程序
        SpringApplication.run(SpringbootstartApplication.class, args);
    }
}
