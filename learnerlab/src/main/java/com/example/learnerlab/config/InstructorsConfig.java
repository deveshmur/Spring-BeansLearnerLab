package com.example.learnerlab.config;

import com.example.learnerlab.model.Instructor;
import com.example.learnerlab.people.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors() {
        return new Instructors(
                new Instructor(201L, "TC USA - Alex"),
                new Instructor(202L, "TC USA - Jordan")
        );
    }

    @Bean
    public Instructors tcUkInstructors() {
        return new Instructors(
                new Instructor(301L, "TC UK - Casey"),
                new Instructor(302L, "TC UK - Riley")
        );
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
        return new Instructors(
                new Instructor(401L, "ZCW - Leon"),
                new Instructor(402L, "ZCW - Kris"),
                new Instructor(403L, "ZCW - Desa")
        );
    }
}
