package com.ryw.conf.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("config-client-test")
public class TestController {

	@Value("${username111}")
	private String username;
	
	@GetMapping(value = "test")
	public String testConfigClient() {
		System.out.println("hello world spring-cloud-config-client! I am " + username);
		return username;
	}
}
