package com.springboot.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaTechieSpringBootJenkinsApplicationTests {

	Logger logger = LoggerFactory.getLogger(JavaTechieSpringBootJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing for build pipeline...");
		assertEquals(true, true);
	}

}
