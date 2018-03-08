package com.example.myblogdev;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.example.myblogdev.mapper")
public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}
}
