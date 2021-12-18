package com.youthcon21.handsonlab.springevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringeventApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringeventApplication.class, args);
	}
}
