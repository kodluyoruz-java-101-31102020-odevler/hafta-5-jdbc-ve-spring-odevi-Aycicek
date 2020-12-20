package com.example.springboot.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.springboot.project.ConsoleApplication;

//Configürasyon sınıfımız olduğunu belirttik.
@Configuration
@ComponentScan(basePackages = {
		"com.example.springboot.project.model"
		
})
public class AppConfig {
	
	@Bean("consoleApplication")
	public ConsoleApplication createConsoleApplication() {
		return new ConsoleApplication();
	}

}
