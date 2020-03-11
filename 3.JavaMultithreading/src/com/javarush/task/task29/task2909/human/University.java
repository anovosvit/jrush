package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    String name;
    int age;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public University(List<Student> students, String name, int age) {
        this.students = students;
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (Student student : students){
            if (student.getAverageGrade() == averageGrade){
                return student;
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverageGrade = 0;
        for (Student student : students){
            double currentGrade = student.getAverageGrade();
            if (currentGrade > maxAverageGrade) {
                maxAverageGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(maxAverageGrade);
    }

    public Student getStudentWithMinAverageGrade() {
        //TODO:
        double minAverageGrade = Double.MAX_VALUE;
        for (Student student : students){
            double currentGrade = student.getAverageGrade();
            if (currentGrade < minAverageGrade){
                minAverageGrade = currentGrade;
            }
        }
        return getStudentWithAverageGrade(minAverageGrade);
    }

    public void expel(Student student){
        students.remove(student);
    }
}