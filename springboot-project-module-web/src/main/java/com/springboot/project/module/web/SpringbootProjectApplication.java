package com.springboot.project.module.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.springboot.project.module.mapper*")
@ComponentScan(value="com")
@SpringBootApplication
public class SpringbootProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProjectApplication.class, args);
	}

}
