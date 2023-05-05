package com.example.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot {
  public String getMessage() {
	return "Welcome to the Docekr assigmnt by subham";
	  
  }
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot.class, args);
	}

}
