package com.example.notesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.example.notesapp", "MVC"})
@EnableJpaRepositories(basePackages = "MVC.Repository")
@EntityScan(basePackages = "MVC.Model")
public class NotesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotesAppApplication.class, args);
    }
//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
}
