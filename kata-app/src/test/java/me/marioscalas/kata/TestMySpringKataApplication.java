package me.marioscalas.kata;

import org.springframework.boot.SpringApplication;

public class TestMySpringKataApplication {

	public static void main(String[] args) {
		SpringApplication.from(MySpringKataApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
