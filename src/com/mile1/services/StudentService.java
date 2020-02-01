package com.mile1.services;

import com.mile1.beans.Student;

public class StudentService {
    public int findNumberOfNullMarks(Student[] data) {
        int NullMarksCount = 0;
        StudentReport objStudentReport = new StudentReport();
        for (int i = 0; i < data.length; i++){
            try {
                objStudentReport.validate(data[i]);
            }
            catch (Exception NullMarksException){

            }

        }
        return NullMarksCount;
    }
    public int findNumberOfNullObjects(Student[] data) {
        int count = 0;
        StudentReport objStudentReport = new StudentReport();
        for (int i = 0; i < data.length; i++){
            try {
                objStudentReport.validate(data[i]);
            }
            catch (Exception NullStudentException){
                count++;
            }

        }
        return count;
    }
    public int findNumberOfNullNames(Student[] data) {
        int count = 0;
        StudentReport objStudentReport = new StudentReport();
        for (int i = 0; i < data.length; i++){
            try {
                objStudentReport.validate(data[i]);
            }
            catch (Exception NullNameException){
                count++;
            }

        }
        return count;
    }
}




