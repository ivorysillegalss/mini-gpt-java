package com.gduf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.gduf.dao")
@EnableScheduling
public class WingOfAntiFraudApplication {

	public static void main(String[] args) {
		SpringApplication.run(WingOfAntiFraudApplication.class, args);
	}

}
