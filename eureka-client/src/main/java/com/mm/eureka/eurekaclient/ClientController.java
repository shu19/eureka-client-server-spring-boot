package com.mm.eureka.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/hell")

public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/helloo")
	public String deposit() {
//		restTemplate.getForEntity("http://localhost:8762/hello", String.class);
		return "hello";
	}

}
