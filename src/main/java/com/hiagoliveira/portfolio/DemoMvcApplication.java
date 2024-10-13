package com.hiagoliveira.portfolio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMvcApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.setProperty("DATABASE_URL", dotenv.get("DATABASE_URL"));
		System.setProperty("DATABASE_USERNAME", dotenv.get("DATABASE_USERNAME"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));

		System.out.println("DATABASE_URL: " + dotenv.get("DATABASE_URL"));
		System.out.println("DATABASE_USERNAME: " + dotenv.get("DATABASE_USERNAME"));
		System.out.println("DATABASE_PASSWORD: " + dotenv.get("DATABASE_PASSWORD"));

		SpringApplication.run(DemoMvcApplication.class, args);
	}
}
