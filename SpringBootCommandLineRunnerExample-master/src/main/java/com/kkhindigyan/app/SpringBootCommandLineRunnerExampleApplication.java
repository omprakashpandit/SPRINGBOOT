package com.kkhindigyan.app;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kkhindigyan.app.runner.MyCommandLineRunner;
import com.kkhindigyan.app.service.MyService;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringBootCommandLineRunnerExampleApplication {

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyCommandLineRunner.class);
	public static void main(String[] args) {
		
		LOGGER.info("START:::");
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootCommandLineRunnerExampleApplication.class, args);
		MyService myService = applicationContext.getBean(MyService.class);
		String welcome = myService.welcome();
		System.out.println(welcome);
		
		LOGGER.info("END:::");
	}

}
