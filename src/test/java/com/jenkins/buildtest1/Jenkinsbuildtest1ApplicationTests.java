package com.jenkins.buildtest1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Jenkinsbuildtest1ApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(2, 2, "Passed");
	}

}
