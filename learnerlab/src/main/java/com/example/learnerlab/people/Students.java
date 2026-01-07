package com.example.learnerlab.people;

import com.example.learnerlab.model.Student;

public class Students extends People<Student> {
    public Students(Student... students) {
        super(students);
    }
}
