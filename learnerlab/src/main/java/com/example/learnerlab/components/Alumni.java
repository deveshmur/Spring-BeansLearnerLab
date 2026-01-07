package com.example.learnerlab.components;

import com.example.learnerlab.model.Instructor;
import com.example.learnerlab.model.Student;
import com.example.learnerlab.people.Instructors;
import com.example.learnerlab.people.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class Alumni {

    private final Students students;
    private final Instructors instructors;

    public Alumni(
            @Qualifier("previousStudents") Students students,
            @Qualifier("instructors") Instructors instructors
    ) {
        this.students = students;
        this.instructors = instructors;
    }

    @PostConstruct
    public void executeBootcamp() {
        double totalHoursPerStudent = 1200.0;

        for (Student student : students) {
            int numberOfInstructors = instructors.size();
            double hoursPerInstructor = totalHoursPerStudent / numberOfInstructors;

            for (Instructor instructor : instructors) {
                instructor.teach(student, hoursPerInstructor);
            }
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
