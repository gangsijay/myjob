package com.lovnx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class A_Application {

	public static void main(String[] args) {
		SpringApplication.run(A_Application.class, args);
//		new SpringApplicationBuilder(A_Application.class).web(true).run(args);
	}

}
