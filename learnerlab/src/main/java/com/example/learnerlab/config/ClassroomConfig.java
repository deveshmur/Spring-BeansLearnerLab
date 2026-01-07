package com.example.learnerlab.config;

import com.example.learnerlab.classroom.Classroom;
import com.example.learnerlab.people.Instructors;
import com.example.learnerlab.people.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class ClassroomConfig {

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(
            @Qualifier("instructors") Instructors instructors,
            @Qualifier("students") Students students
    ) {
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort(
            @Qualifier("instructors") Instructors instructors,
            @Qualifier("previousStudents") Students previousStudents
    ) {
        return new Classroom(instructors, previousStudents);
    }
}
