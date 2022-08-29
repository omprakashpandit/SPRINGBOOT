package com.javatechie.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@PropertySource("classpath:application.properties")
@RestController
public class HomeController {
	
	@Value("${app.name}")
	private String appName;
	@Value("${app.version:version}")
	private String appVersion;
	
	@GetMapping("/version")
	public String getAppVersion () {
		return appName+" - "+appVersion;
	}
}