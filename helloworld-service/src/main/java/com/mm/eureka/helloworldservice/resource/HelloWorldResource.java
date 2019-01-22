package com.mm.eureka.helloworldservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldResource {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
}
