package com.company;

public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getFullName() + " named student is added.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFullName() + " named student is deleted.");
    }

    // to go to erasmus, gpa must be at least 2.50
    public void canGoErasmus(Student student){
        if(student.getGpa() < 2.50){
            System.out.println(student.getFullName() + " named student can not go to Erasmus");
        }
        else if(student.getGpa() >= 2.50 && student.getGpa()<=4.00){
            System.out.println(student.getFullName() + " named student can go to Erasmus");
        }
        else{
            System.out.println("This GPA is not possible!");
        }
    }
}
