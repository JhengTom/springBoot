package com.jhengtom.springBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 用來標是一個引導類:說明當前是一個SpringBoot項目
 *
 *
 * @author xd_to
 *
 */

@SpringBootApplication
public class helloMainApplication {
	public static void main(String[] args) {
		SpringApplication.run(helloMainApplication.class, args);
	}
}
