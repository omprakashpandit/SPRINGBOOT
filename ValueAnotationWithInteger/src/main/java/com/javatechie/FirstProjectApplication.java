package com.javatechie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javatechie.controller.DDSConfiguration;

@SpringBootApplication
public class FirstProjectApplication implements CommandLineRunner {

	@Autowired
	DDSConfiguration ddsConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println(ddsConfiguration.getAppName());
		System.out.println(ddsConfiguration.getAppVersion());
		
	}

	
}
