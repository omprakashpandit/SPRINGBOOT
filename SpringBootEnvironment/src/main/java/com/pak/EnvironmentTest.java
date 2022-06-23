package com.pak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component

public class EnvironmentTest {
	@Autowired
	private Environment env;

	public void getRootLogLevel() {
		System.out.println(env.getProperty("logging.level.root"));
	}
}
