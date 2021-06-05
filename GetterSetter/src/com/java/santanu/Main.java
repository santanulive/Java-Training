package com.java.santanu;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setStudentName("Santanu Dhar");
        student1.setRollNo(14);

        student2.setStudentName("Somak Laskar");
        student2.setRollNo(28);

        System.out.println(student1.getStudentName() + ", Roll No: " + student1.getRollNo());
        System.out.println(student2.getStudentName() + ", Roll No: " + student2.getRollNo());
    }
}
