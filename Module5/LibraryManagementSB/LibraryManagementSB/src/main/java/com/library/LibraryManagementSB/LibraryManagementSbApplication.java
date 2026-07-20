package com.library.LibraryManagementSB;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryManagementSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementSbApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDatabase(BookRepository repository) {
		return args -> {
			// Inserts a sample book record into your H2 database automatically
			repository.save(new Book("Spring Boot Mastery Guide", "John Doe"));

			System.out.println("\n=========================================");
			System.out.println("[SPRING BOOT SUCCESS] Database initialized successfully!");
			System.out.println("Found Saved Book in H2: " + repository.findAll().get(0).getTitle());
			System.out.println("=========================================\n");
		};
	}
}
