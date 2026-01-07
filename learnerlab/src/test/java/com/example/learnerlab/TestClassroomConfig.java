package com.example.learnerlab;

import com.example.learnerlab.classroom.Classroom;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    void currentCohortWiring() {
        assertNotNull(currentCohort);
        assertNotNull(currentCohort.getStudents());
        assertNotNull(currentCohort.getInstructors());
        assertTrue(currentCohort.getStudents().size() > 0);
        assertTrue(currentCohort.getInstructors().size() > 0);
    }

    @Test
    void previousCohortWiring() {
        assertNotNull(previousCohort);
        assertNotNull(previousCohort.getStudents());
        assertNotNull(previousCohort.getInstructors());
        assertTrue(previousCohort.getStudents().size() > 0);
        assertTrue(previousCohort.getInstructors().size() > 0);
    }
}
