package com.pak;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pak.model.DemoProperties;

@Component
public class Test {
	@Autowired
	private static DemoProperties demoProperties;
	public static void printDemoProperties() {
	  System.out.println("Username: " + demoProperties.getUsername());
	  System.out.println("Password: " + demoProperties.getPassword());
	  System.out.println("Email Address: " + demoProperties.getEmail());
	}
}
