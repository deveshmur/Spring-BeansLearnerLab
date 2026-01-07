package com.example.learnerlab.model;

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
        for (Learner ignored : learners) count++;

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
