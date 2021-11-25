package com.javatechie.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsDemoApplicationTests {
	
	private static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsDemoApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Inside test class contextLoad method, test case executing");
		
		assertEquals(true, true);
	}

}
