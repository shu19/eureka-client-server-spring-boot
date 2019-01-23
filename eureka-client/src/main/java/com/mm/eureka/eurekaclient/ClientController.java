package com.mm.eureka.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/hello")
	public String home(Model model) {

		String message = restTemplate.getForObject("http://demo-service/hello", String.class);
		System.out.println(message);
		model.addAttribute("message", message);
		return "hello";

	}
}
