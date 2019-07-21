package com.dustyding.microservice.cunrrencyconversionserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.dustyding.microservice.cunrrencyconversionserver")
public class CunrrencyConversionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CunrrencyConversionServerApplication.class, args);
	}

}
