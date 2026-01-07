package com.example.learnerlab.classroom;

import com.example.learnerlab.model.Teacher;
import com.example.learnerlab.people.Instructors;
import com.example.learnerlab.people.Students;

public class Classroom {
    private final Instructors instructors;
    private final Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
}
