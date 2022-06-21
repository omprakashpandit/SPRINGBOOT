package com.kkhindigyan.app;

import java.util.Arrays;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringApplicationRunnerExampleApplication implements ApplicationRunner{

	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringApplicationRunnerExampleApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationRunnerExampleApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("SourceArgs:::{}",Arrays.toString(args.getSourceArgs()));
	}

}
