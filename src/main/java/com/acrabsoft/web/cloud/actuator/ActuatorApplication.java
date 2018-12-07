package com.acrabsoft.web.cloud.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication

public class ActuatorApplication {

	 
	public static void main(String[] args) {
		SpringApplication.run(ActuatorApplication.class, args);
	}
}
