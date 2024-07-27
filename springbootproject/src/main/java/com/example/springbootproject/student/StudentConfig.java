package com.example.springbootproject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentRepository) {
        return args -> {
                    Student Kaan = new Student(
                            "Kaan Furkan Cakiroglu",
                            "kfc0737@gmail.com",
                            LocalDate.of(2000, Month.JANUARY, 17)
                    );
                    Student Beyza = new Student(
                            "Beyza Hilal Cakiroglu",
                            "beyza@gmail.com",
                            LocalDate.of(2003, Month.AUGUST, 5)
                    );
                    studentRepository.saveAll(
                            List.of(Kaan, Beyza)
                    );
        };
    }
}
