package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class MicrocervicesEurekaServerStudentInsertApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocervicesEurekaServerStudentInsertApplication.class, args);
		
		
	}

	
	@Bean
	public RestTemplate rt() {
	
		RestTemplate rte = new RestTemplate();
		return rte;
		
	}
}
