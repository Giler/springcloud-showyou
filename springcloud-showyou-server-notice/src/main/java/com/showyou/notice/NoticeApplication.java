package com.showyou.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;

@EnableEurekaClient
@SpringBootApplication
@EnableConfigurationProperties
public class NoticeApplication {
	
	public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(NoticeApplication.class,args);
    }
	@Autowired
	void setEnviroment(Environment env) {
	    System.out.println("my-config.appName from env: " 
	        + env.getProperty("foo"));
	}
}
