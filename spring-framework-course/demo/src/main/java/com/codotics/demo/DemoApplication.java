package com.codotics.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Codotics Technologies
 *
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Starting Application.");

		SpringApplication.run(DemoApplication.class, args);

		System.out.println("Exiting Application.");
	}

}
