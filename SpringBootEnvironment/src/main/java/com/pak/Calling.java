package com.pak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = { "classpath:demo.properties" })
@Configuration
public class Calling {
	@Autowired 
	EnvironmentTest environmentTest;
	
	public void fun() {
		environmentTest.getRootLogLevel();
	}
	
}
