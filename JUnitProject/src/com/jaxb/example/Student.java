package com.jaxb.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="student")
public class Student {
    private String name;
    private int rollNo;
    private double marks;
    private int rank;

    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}