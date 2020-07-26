package com.EZtory.application.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class HelloWorldController {
	
	@GetMapping(path="/hello-world")
	public  String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/hello-world-bean")
	public  HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public  HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
		//throw new RuntimeException("wrong");
		return new HelloWorldBean(String.format("Hello World,%s",name));
	}
}
