package com.java.santanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student("Student 1", "BNNV",10,14);
        Student student2 = new Student("Student 2", 12,28);
        Student student3 = new Student("Student 3");

        System.out.println("Student name: " + student1.getStudentName() +
                           ", School: " + student1.getSchoolName() +
                           ", Class: " + student1.getStudentClass() +
                           ", Roll No.: " + student1.getStudentRollNo());

        System.out.println("Student name: " + student2.getStudentName() +
                ", School: " + student2.getSchoolName() +
                ", Class: " + student2.getStudentClass() +
                ", Roll No.: " + student2.getStudentRollNo());

        System.out.println("Student name: " + student3.getStudentName() +
                ", School: " + student3.getSchoolName() +
                ", Class: " + student3.getStudentClass() +
                ", Roll No.: " + student3.getStudentRollNo());
    }
}
