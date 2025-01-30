package com.cjc.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicrocervicesExamApplication {

	public static void main(String[] args) {
		System.out.println("This is exam...!!!!");
		SpringApplication.run(MicrocervicesExamApplication.class, args);
	}

}
