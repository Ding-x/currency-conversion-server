package com.dustyding.microservice.cunrrencyconversionserver;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients("com.dustyding.microservice.cunrrencyconversionserver")
@EnableDiscoveryClient
public class CunrrencyConversionServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CunrrencyConversionServerApplication.class, args);
	}
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
