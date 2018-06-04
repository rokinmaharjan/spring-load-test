package com.rokin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class LoadTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadTestingApplication.class, args);
	}
}
