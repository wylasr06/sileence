package com.expensivetime.sileence;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan("com.expensivetime.sileence.mapper")
public class SileenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SileenceApplication.class, args);
	}

}
