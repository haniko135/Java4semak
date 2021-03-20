package ru.mirea.ikbo1319.pr6.builder;

public class Pupil {
    private int grade;
    private int averageBall;
    private PupilTrade trait;

    public void setTrait(PupilTrade trait) {
        this.trait = trait;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAverageBall(int averageBall) {
        this.averageBall = averageBall;
    }
}
