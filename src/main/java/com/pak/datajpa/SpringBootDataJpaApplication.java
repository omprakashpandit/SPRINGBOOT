package com.pak.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaApplication.class, args);
	}

}
//localhost:8080/api/tutorials --POST
/*{
"title":"java",
"description":"java is a language",
"published":true
}
*/