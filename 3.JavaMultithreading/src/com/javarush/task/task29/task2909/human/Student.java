package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student extends UniversityPerson {
    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String getPosition() {
        return "Студент" ;
    }

    public void incAverageGrade(double delta) {
        double avrGr = getAverageGrade();
        avrGr += delta;
        setAverageGrade(avrGr);
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setAverageGrade(double averageGrade){
        this.averageGrade = averageGrade;
    }

    public void setBeginningOfSession(Date beginningDate) {
        beginningOfSession = beginningDate;
    }

    public void setEndOfSession(Date endDate) {
        endOfSession = endDate;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
}