package com.company;

public class Student extends User{
    private double gpa;

    public Student(int id, String userName, String fullName, double gpa) {
        super(id, userName, fullName);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
