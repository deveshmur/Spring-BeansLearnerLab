package com.example.learnerlab;

import com.example.learnerlab.components.Alumni;
import com.example.learnerlab.model.Instructor;
import com.example.learnerlab.model.Student;
import com.example.learnerlab.people.Instructors;
import com.example.learnerlab.people.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestAlumni {

    @Autowired
    private Alumni alumni;

    @Test
    void studentsLearned1200Hours() {
        Students students = alumni.getStudents();
        for (Student student : students) {
            assertEquals(1200.0, student.getTotalStudyTime(), 0.0001);
        }
    }

    @Test
    void hoursEvenlyDistributedAmongInstructors() {
        Students students = alumni.getStudents();
        Instructors instructors = alumni.getInstructors();

        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200.0;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double expectedHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;

        for (Instructor instructor : instructors) {
            assertEquals(expectedHoursPerInstructor, instructor.getNumberOfHoursTaught(), 0.0001);
        }
    }
}
