package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicrocervicesEurekaServerApplication {

	public static void main(String[] args) {
		System.out.println("eureka server run successfully!!!");
		SpringApplication.run(MicrocervicesEurekaServerApplication.class, args);
	}

}
