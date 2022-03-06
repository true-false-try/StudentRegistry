package com.example.studentregistry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@SpringBootApplication
public class    StudentRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentRegistryApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args ->{
            Address address = new Address(
                    "Ukraine",
                    "Kiev",
                    "30688"
            );
            Student student = new Student(
                    "Yevhenii",
                    "Chekhovskyi",
                    "6mateo6ch@gmail.com",
                    Gender.MALE,
                    address,
                    List.of("Computer Programming"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );
            repository.insert(student);
        };
    }
}
