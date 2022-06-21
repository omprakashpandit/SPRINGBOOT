package com.kkhindigyan.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value("${my.channel.name}")
	private String myChannelName;

	@RequestMapping(path = "/",method = RequestMethod.GET)
	public String welcome() {
		return "Welcome to "+myChannelName;
	}
}
//Run:-http://localhost:8080/
//     http://localhost:2020/  --DEV
//	   http://localhost:2021/  --UAT
//     http://localhost:2022/  --PROD