package com.example.learnerlab.model;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {
    private double numberOfHoursTaught;

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        numberOfHoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        int count = 0;
        List<Learner> learnerList = new ArrayList<>();
        
        for (Learner learner : learners) {
            learnerList.add(learner);
        }

        if (learnerList.isEmpty()) return;

        double hoursPerLearner = numberOfHours / learnerList.size();
        for (Learner learner : learnerList) {
            teach(learner, hoursPerLearner);
}
        if (count == 0) return;

        double perLearner = numberOfHours / count;
        for (Learner learner : learners) {
            teach(learner, perLearner);
        }
    }

    public double getNumberOfHoursTaught() {
        return numberOfHoursTaught;
    }
}
