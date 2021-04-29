package com.company;

public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student(1,"furkanucar","Furkan Uçar",3.5);
        Student student2 = new Student(2,"damlaerrolan","Damla Errolan",2.4);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);

        student2.setGpa(4);

        studentManager.canGoErasmus(student1);
        studentManager.canGoErasmus(student2);

        Instructor instructor1 = new Instructor(3,"kubraucar","Kübra Uçar","Math");

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.delete(instructor1);
        instructorManager.addCourse(instructor1);


    }
}
