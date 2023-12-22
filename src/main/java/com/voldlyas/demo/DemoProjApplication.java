package com.voldlyas.demo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log
@SpringBootApplication
public class DemoProjApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjApplication.class, args);
		log.warning("Hello in Spring boot!");
	}

}