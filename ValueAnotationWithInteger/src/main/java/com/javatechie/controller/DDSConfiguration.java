package com.javatechie.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;


@Configuration
@PropertySource("classpath:response/app.properties")
public class DDSConfiguration {
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private int appVersion;
	
	public String getAppName() {
		return appName;
	}



	public int getAppVersion() {
		return appVersion;
	}

	@Bean
	 public static PropertySourcesPlaceholderConfigurer propertyDDSConfiguration() {
	  return new PropertySourcesPlaceholderConfigurer();
	 }
	
}