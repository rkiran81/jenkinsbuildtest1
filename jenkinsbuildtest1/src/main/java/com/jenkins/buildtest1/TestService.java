package com.jenkins.buildtest1;

import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	public String helloService() {
		return "Hello Jenkins";
	}
}
