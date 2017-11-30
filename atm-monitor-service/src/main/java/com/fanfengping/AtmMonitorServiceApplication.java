package com.fanfengping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fanfengping.mapper")
public class AtmMonitorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmMonitorServiceApplication.class, args);
	}
}
