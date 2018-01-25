package com.example.demo;

import com.example.demo.domain.Task;
import com.example.demo.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	CommandLineRunner runner(TaskService taskService) {
		return args -> {
			taskService.save(new Task(1L, "create spring boot app", LocalDate.now(), true));
			taskService.save(new Task(2L, "create spring boot package", LocalDate.now().plus(1, ChronoUnit.DAYS), true));
			taskService.save(new Task(3L, "create domain classes", LocalDate.now(), true));
			taskService.save(new Task(4L, "run the app", LocalDate.now(), true));
			taskService.save(new Task(5L, "test the app and in-mem db", LocalDate.now(), true));
		};
	}
	/*
	* */

}
