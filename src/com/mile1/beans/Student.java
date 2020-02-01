package com.mile1.beans;

public class Student {
    String name;
    int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setMarks(int[] marks){
        this.marks = marks;
    }
    public int[] getMarks(){
        return marks;
    }

}
