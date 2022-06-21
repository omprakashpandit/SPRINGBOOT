package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProfilesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesExampleApplication.class, args);
	}

}
//Run:-http://localhost:8080/
//http://localhost:2020/  --DEV
//http://localhost:2021/  --UAT
//http://localhost:2022/  --PROD