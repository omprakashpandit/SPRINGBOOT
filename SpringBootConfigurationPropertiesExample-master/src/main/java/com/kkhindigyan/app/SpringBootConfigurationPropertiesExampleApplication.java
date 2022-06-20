package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.kkhindigyan.app.model.KKHindiGyan;

@SpringBootApplication
@PropertySource(value = { "classpath:kkhindigyan.properties" })
@EnableConfigurationProperties(value = {KKHindiGyan.class})
public class SpringBootConfigurationPropertiesExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootConfigurationPropertiesExampleApplication.class, args);
		
		KKHindiGyan kkHindiGyan = applicationContext.getBean(KKHindiGyan.class);
		System.out.println(kkHindiGyan);
	}
	
	/*
	 * @Bean
	 * 
	 * @ConfigurationProperties(prefix = "myapp") public KKHindiGyan kKHindiGyan() {
	 * return new KKHindiGyan(); }
	 */
}
