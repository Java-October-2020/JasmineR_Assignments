package com.jasmine.Strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello Client.How are you doing?";
	}
	@RequestMapping("/Random")
	public String spring() {
		return "Spring Boot is Great.So easy to respond with strings!";
		
	}
}
