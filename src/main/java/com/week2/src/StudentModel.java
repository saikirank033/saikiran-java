package com.week2.src;

public class StudentModel implements Comparable<StudentModel> {
    String firstName;
    String lastName;
    public StudentModel(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    float gpa;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    @Override
    public int compareTo(StudentModel stu) {
        return this.lastName.compareTo(stu.lastName);
    }

    public String toString() {
        return firstName + " " + lastName + " " + gpa;
    }

}