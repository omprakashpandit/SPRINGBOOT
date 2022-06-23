package com.pak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = { "classpath:demo.properties" })
public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Main.class,
				args);
		EnvironmentTest demoProperties = applicationContext.getBean(EnvironmentTest.class);
		demoProperties.getRootLogLevel();
		
		Calling calling = applicationContext.getBean(Calling.class);
		calling.fun();
		

	}

}
