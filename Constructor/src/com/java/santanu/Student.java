package com.java.santanu;

public class Student {
    private String studentName;
    private String schoolName;
    private int studentClass;
    private int studentRollNo;

    public Student(String studentName, String schoolName, int studentClass, int studentRollNo){
        this.studentName=studentName;
        this.schoolName=schoolName;
        this.studentClass=studentClass;
        this.studentRollNo=studentRollNo;
    }

    //Calls the first constructor with default value for school name
    public Student(String studentName, int studentClass, int studentRollNo){
        this(studentName,"No School",studentClass,studentRollNo);
    }

    //Calls second constructor with default value for student class and roll.
    //While second one invoked, it will also invoke the first one.
    //Default school name not provided, as it will be set using second constructor.
    public Student(String studentName){
        this(studentName,-1,-1);
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public int getStudentRollNo() {
        return studentRollNo;
    }
}
