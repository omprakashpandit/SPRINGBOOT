package com.bezkoder.spring.jpa.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaH2Application.class, args);
	}

}
/*
 
http://localhost:8080/h2-ui
JDBC URL:- jdbc:h2:mem:testdb

 http://localhost:8080/api/tutorials --POST
 {  
   "title": "title1",  
   "description": "Testing for H2 database" 
}
http://localhost:8080/api/tutorials --GET
http://localhost:8080/api/tutorials/3 --GET 
http://localhost:8080/api/tutorials/3 --PUT
{  
   "title": "title5",  
   "description": "Testing for H2 database" ,
    "published": true
}
 http://localhost:8080/api/tutorials/published --GET
 output:-
 [
    {
        "id": 3,
        "title": "title5",
        "description": "Testing for H2 database",
        "published": true
    }
]
http://localhost:8080/api/tutorials?title=2 --GET
 output:-
[
    {
        "id": 2,
        "title": "title2",
        "description": "Testing for H2 database",
        "published": false
    }
]

http://localhost:8080/api/tutorials/5 --DELETE
*/