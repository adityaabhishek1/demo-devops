package com.example.demodevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@RestController
@SpringBootApplication
public class DemoDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDevopsApplication.class, args);
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello CICD...";
	}
}
