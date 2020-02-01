package com.mile1.main;
import com.mile1.beans.Student;
import java.util.Scanner;
import com.mile1.services.*;
import com.mile1.exception.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No Of Test cases");
//        int noOfTestCases = scan.nextInt();
        StudentReport studentReportObj = new StudentReport();
        StudentService studentServiceObj = new StudentService();
        Student[] studentsArray = new Student[7];

//
//        for(int i = 0; i < noOfTestCases;i++){
//            System.out.println("Enter String Value");
//            String str = scan.next();
//            System.out.println("Enter Size Of Marks");
//            int size = scan.nextInt();
//            System.out.println("Enter Marks");
//           int[] marks = new int[size];
//            for (int j = 0; j < size;j++){
//                marks[j] = scan.nextInt();
//            }
//
//            Student classObj = new Student(str,marks);
//            studentsArray[i] = classObj;
//        }
        studentsArray [0] = new Student ("A1", new int [ ] {72, 73, 74});
        studentsArray [1] = new Student ("B1", new int [ ]{1});
        studentsArray [2] = new Student (null, new int[ ] {99, 99, 99});
        studentsArray [3] = null;//new Student (" ", new int[ ] {100, 100, 99});
        studentsArray [4] = new Student (" ", new int[ ] {13, 88, 13});
        studentsArray [5] = new Student ("C3", new int[ ] { });
        studentsArray [6] = null;
//          int[] marks = new int[2];
//        marks[0] =  40;
//        marks[1] =  250;
//        Student classObj1 = new Student(" ",marks);
//        studentsArray[studentsArray.length - 1] = classObj1;


        System.out.println("Grade Calculation:");
        for (int i = 0; i < studentsArray.length ;i++){

//            System.out.print(studentsArray[i].getName() + " " );
//            for(int j = 0; j < studentsArray[i].getMarks().length;j++){
//                System.out.print(studentsArray[i].getMarks()[j]);
//            }
//            if (studentsArray[i] == null){
//                System.out.println("Sorry");
//            }
//            if (studentsArray[i].getMarks() == null){
//                System.out.println("nullMarks");
//            }
//            if(studentsArray[i].getName() == null){
//                System.out.println("nullName");
//            }

           try {
               System.out.println("Grade = " + studentReportObj.validate(studentsArray[i]));
           }
           catch (NullStudentException e){
               System.out.println(e);
           }
           catch (NullNameException e){
               System.out.println(e);
           }
           catch (NullMarksArrayException e){
               System.out.println(e);
           }


        }
        System.out.println("Number of Objects that are Entirely null = " + studentServiceObj.findNumberOfNullObjects(studentsArray));
        System.out.println("Number of Objects with Name as null = " + studentServiceObj.findNumberOfNullNames(studentsArray));
        System.out.println("Number of Objects with null Marks = " + studentServiceObj.findNumberOfNullMarks(studentsArray));




    }
}
