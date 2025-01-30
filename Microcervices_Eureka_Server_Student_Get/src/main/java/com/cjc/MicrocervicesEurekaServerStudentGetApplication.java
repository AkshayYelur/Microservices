package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicrocervicesEurekaServerStudentGetApplication {

	
	public static void main(String[] args) {
		
		SpringApplication.run(MicrocervicesEurekaServerStudentGetApplication.class, args);
	}

}
