package com.jenkins.buildtest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@GetMapping
	public String sayHello() {
		return testService.helloService();
	}
}
