package com.lovnx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class B2_Application {

	public static void main(String[] args) {
		SpringApplication.run(B2_Application.class, args);
//		new SpringApplicationBuilder(B2_Application.class).web(true).run(args);
	}

}
