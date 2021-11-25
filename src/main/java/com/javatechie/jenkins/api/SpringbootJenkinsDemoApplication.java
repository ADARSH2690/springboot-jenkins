package com.javatechie.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsDemoApplication {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Inside init method");
	}

	public static void main(String[] args) {
		
		logger.info("Inside main method...");
		SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
	}

}
