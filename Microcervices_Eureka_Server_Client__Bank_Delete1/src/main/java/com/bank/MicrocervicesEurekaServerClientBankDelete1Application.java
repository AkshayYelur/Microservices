package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicrocervicesEurekaServerClientBankDelete1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicrocervicesEurekaServerClientBankDelete1Application.class, args);
	}
	
	@Bean
	public RestTemplate rt() {
		
		RestTemplate rt = new RestTemplate();
		return rt;
	}

}
