package com.example.stub;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.openapitools", "com.example.stub.controller" , "org.openapitools.configuration"})
public class TestStubApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestStubApplication.class, args);
	}

	@Bean
	public Module jsonNullableModule() {
		return new JsonNullableModule();
	}

}
