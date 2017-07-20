package com.remswork.advcal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.remswork.advcal")
public class AdvcalApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvcalApplication.class, args);
	}
}
