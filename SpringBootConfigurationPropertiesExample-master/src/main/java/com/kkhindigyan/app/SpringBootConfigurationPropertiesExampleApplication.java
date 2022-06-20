package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import com.kkhindigyan.app.model.KKHindiGyan;
import com.kkhindigyan.app.model.MySQLDatabase;


 

@SpringBootApplication
@PropertySource(value = { "classpath:kkhindigyan.properties","classpath:mydatabase.properties" })
//@EnableConfigurationProperties(value = {KKHindiGyan.class}) //replace of @componet of KKHindiGyan.java
public class SpringBootConfigurationPropertiesExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootConfigurationPropertiesExampleApplication.class, args);
		
		KKHindiGyan kkHindiGyan = applicationContext.getBean(KKHindiGyan.class);
		System.out.println(kkHindiGyan);
		
		MySQLDatabase mySQLDatabase = applicationContext.getBean(MySQLDatabase.class);
		System.out.println(mySQLDatabase);
	}
	
	
	//replace of @ConfigurationProperties(prefix = "myapp") of KKHindiGyan.java and also u have to comments
	//@EnableConfigurationProperties(value = {KKHindiGyan.class})
	 @Bean
	 @ConfigurationProperties(prefix = "myapp") 
	 public KKHindiGyan kKHindiGyan() {
	 return new KKHindiGyan(); 
	 }
	 
	 //DataBase property
	 @Bean
	 @ConfigurationProperties(prefix = "spring.book.datasource") 
	 public MySQLDatabase mySQLDatabase() {
	 return new MySQLDatabase(); 
	 }
	
}
