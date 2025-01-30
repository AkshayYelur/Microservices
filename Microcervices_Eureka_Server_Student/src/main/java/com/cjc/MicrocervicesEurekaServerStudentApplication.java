package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicrocervicesEurekaServerStudentApplication {

	public static void main(String[] args) {
		System.out.println("this is eureka server");
		SpringApplication.run(MicrocervicesEurekaServerStudentApplication.class, args);
	}

}
