package com.kkhindigyan.app.runner;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

@Component
public class MyCommandLineRunner implements CommandLineRunner {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(MyCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("MyCommandLineRunner....................");
		for (String arg : args) {
			LOGGER.info(arg);
		}
	}
}
