package com.kkhindigyan.app.runner;

import java.util.Arrays;

import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.kkhindigyan.app.SpringApplicationRunnerExampleApplication;

import ch.qos.logback.classic.Logger;

@Component
@Order(0)
public class MyApplicationRunner2 implements ApplicationRunner {
	private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(SpringApplicationRunnerExampleApplication.class);
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.info("MyApplicationRunner2...");
		LOGGER.info("SourceArgs:::{}",Arrays.toString(args.getSourceArgs()));
	}

}
