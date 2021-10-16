package com.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightAppAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightAppAuthApplication.class, args);
	}

}
