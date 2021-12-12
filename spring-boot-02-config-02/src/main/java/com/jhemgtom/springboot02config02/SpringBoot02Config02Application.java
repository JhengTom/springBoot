package com.jhemgtom.springboot02config02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot02Config02Application {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		SpringApplication.run(SpringBoot02Config02Application.class, args);
	}

}
