package com.pak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.pak.model.DemoProperties;

@SpringBootApplication
@PropertySource(value = { "classpath:demo.properties" })
public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class,
				args);
		DemoProperties demoProperties = applicationContext.getBean(DemoProperties.class);
		System.out.println(demoProperties);
		System.out.println("Username: " + demoProperties.getUsername());
		System.out.println("Password: " + demoProperties.getPassword());
		System.out.println("Email Address: " + demoProperties.getEmail());

	}

}
