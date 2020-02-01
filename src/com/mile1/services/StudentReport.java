package com.mile1.services;

import com.mile1.beans.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;


public class StudentReport {


    public String findGrade(Student studentObject){

        int sum = 0;
        String grade = "";

        for (int i = 0 ; i < studentObject.getMarks().length;i++){
            sum = sum + studentObject.getMarks()[i];

        }
        if(sum <= 35){
            return "F";
        }
        else if(sum <= 150 && sum > 35){
            return "D";
        }
        else if(sum <= 200 && sum > 150){
            return "C";
        }
        else if(sum <= 250 && sum > 200){
            return "B";
        }
        else {
            return "A";
        }
    }
    public String validate(Student studentObject) throws NullMarksArrayException, NullNameException, NullStudentException{

        if (studentObject == null){
            throw new NullStudentException();
        }
        else if (studentObject.getMarks() == null && studentObject.getName() != null && studentObject != null){
            throw new NullMarksArrayException();
        }

        else if (studentObject.getMarks() != null && studentObject.getName() == null && studentObject != null) {
            throw new NullNameException();
        }

        StudentReport objStudentReport = new StudentReport();
       return objStudentReport.findGrade(studentObject);

    }

}
