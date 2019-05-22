package com.eureka.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstProviderController {
	
	@RequestMapping(value="/helloWorld",method=RequestMethod.GET)
	public String helloWorld(@RequestParam String name) {
		return "Hello," +name+", this is your world!";
	}
}
