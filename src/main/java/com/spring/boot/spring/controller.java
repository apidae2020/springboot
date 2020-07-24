package com.spring.boot.spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	@RequestMapping(value= "/", method= RequestMethod.GET)
	public String gethello() {
		System.out.println(this.getClass().getSimpleName() + " - Get all employees service is invoked.");
		String hello = "hello";
		return hello;
	}
}
