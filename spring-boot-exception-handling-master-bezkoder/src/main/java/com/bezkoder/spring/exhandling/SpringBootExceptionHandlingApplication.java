package com.bezkoder.spring.exhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionHandlingApplication.class, args);
	}

}

//Run:- http://localhost:2022/api/tutorials/33  --GET
//http://localhost:2022/api/tutorials/33   --PUT
/*
 * { "title": "Testing Post", "description":"Post Method called",
 * "published":"true" }
 */
//http://localhost:2022/api/tutorials/33 --DELETE