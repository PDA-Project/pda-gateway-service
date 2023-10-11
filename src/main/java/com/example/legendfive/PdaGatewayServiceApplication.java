package com.example.legendfive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PdaGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PdaGatewayServiceApplication.class, args);
	}

}
