package com.example.learnerlab;

import com.example.learnerlab.people.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    void currentStudentsConfigured() {
        assertNotNull(currentStudents);
        assertTrue(currentStudents.size() > 0);
    }

    @Test
    void previousStudentsConfigured() {
        assertNotNull(previousStudents);
        assertTrue(previousStudents.size() > 0);
    }
}
