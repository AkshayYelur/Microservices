package com.cjc.admission;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicrocervicesAddmissionApplication {

	public static void main(String[] args) {
		System.out.println("WelCome To Admission....!!!!");
		SpringApplication.run(MicrocervicesAddmissionApplication.class, args);
	}

}
