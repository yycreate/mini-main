package com.yxkj.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EnkuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnkuraApplication.class, args);
	}
}
