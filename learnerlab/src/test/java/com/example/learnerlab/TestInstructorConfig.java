package com.example.learnerlab;

import com.example.learnerlab.people.Instructors;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsa;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUk;

    @Autowired
    @Qualifier("instructors")
    private Instructors primaryInstructors;

    @Test
    void usaInstructorsConfigured() {
        assertNotNull(tcUsa);
        assertTrue(tcUsa.size() > 0);
    }

    @Test
    void ukInstructorsConfigured() {
        assertNotNull(tcUk);
        assertTrue(tcUk.size() > 0);
    }

    @Test
    void primaryInstructorsConfigured() {
        assertNotNull(primaryInstructors);
        assertTrue(primaryInstructors.size() > 0);
    }
}
