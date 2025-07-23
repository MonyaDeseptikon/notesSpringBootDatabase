package ru.monya.notesSpringBootDatabase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
//@EntityScan(basePackages = "ru.monya.notesSpringBootDatabase")
public class NotesSpringBootDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesSpringBootDatabaseApplication.class, args);
	}

}
