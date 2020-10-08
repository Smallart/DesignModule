package com.smallart.State;

public class Person {
    private int gradeLevel;

    private Grade grade;

    public Person(int gradeLevel,Grade grade) {
        this.gradeLevel = gradeLevel;
        this.grade = grade;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public void showGrade(){
        grade.showGrade(this);
    }
}
