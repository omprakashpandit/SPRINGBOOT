package com.bezkoder.spring.jpa.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
	}

}
/*

POST	/api/tutorials	create new Tutorial
GET		/api/tutorials	retrieve all Tutorials
GET		/api/tutorials/:id	retrieve a Tutorial by :id
PUT		/api/tutorials/:id	update a Tutorial by :id
DELETE	/api/tutorials/:id	delete a Tutorial by :id
DELETE	/api/tutorials	delete all Tutorials
GET		/api/tutorials/published	find all published Tutorials
GET		/api/tutorials?title=[keyword]	find all Tutorials which title contains keyword

*/
/*
 http://localhost:2022/api/tutorials  --POST
 {
    "title": "Testing Post",
    "description":"Post 1 Method called"
 }
 {
    "title": "Testing Post",
    "description":"Post 2 Method called"
    
}
http://localhost:2022/api/tutorials   --GET
http://localhost:2022/api/tutorials/2 --GET
http://localhost:2022/api/tutorials/1 --PUT
{
    "title": "Testing Put",
    "description":"PUT  Method called"
    
}
http://localhost:2022/api/tutorials/published --GET
[
    {
        "id": 2,
        "title": "Testing POST",
        "description": "POST  published called",
        "published": true
    }
]
http://localhost:2022/api/tutorials?title=Testing Put  --GET
[
    {
        "id": 1,
        "title": "Testing Put",
        "description": "PUT  Method called",
        "published": false
    }
]
 */
