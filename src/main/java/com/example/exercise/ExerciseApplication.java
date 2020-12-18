package com.example.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author brighty
 * @version 1.0
 * @description springboot启动类
 * @date 2020-12-17 16:00
 */
@SpringBootApplication
@EnableScheduling
public class ExerciseApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExerciseApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ExerciseApplication.class, args);
	}

}
