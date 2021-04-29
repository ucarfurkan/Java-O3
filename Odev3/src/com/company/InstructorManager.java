package com.company;

public class InstructorManager extends UserManager{
    @Override
    public void add(User user) {
        System.out.println(user.getFullName() + " named instructor is added.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFullName() + " named instructor is deleted.");
    }

    public void addCourse(Instructor instructor){
        System.out.println(instructor.getFullName() + " named instructor is added a course");
    }
}
