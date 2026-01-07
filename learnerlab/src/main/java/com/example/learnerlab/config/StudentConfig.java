package com.example.learnerlab.config;

import com.example.learnerlab.model.Student;
import com.example.learnerlab.people.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
                new Student(1L, "Devesh"),
                new Student(2L, "Ava"),
                new Student(3L, "Noah")
        );
    }

    @Bean
    public Students previousStudents() {
        return new Students(
                new Student(101L, "Priya"),
                new Student(102L, "Mateo")
        );
    }
}
