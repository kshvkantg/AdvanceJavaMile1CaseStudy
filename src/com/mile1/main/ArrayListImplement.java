package com.mile1.main;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListImplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
        ArrayList al = new ArrayList<>();
//        for(int i = 0 ; i < size ;i ++){
        al.add(1);
        al.add(2);
        al.add("java");
//        }
        System.out.println(al);
        al.remove(new Integer(1));//al.remove(o: "1");
        al.remove(1);//al.remove(index: 1);
        al.remove("1");


        System.out.println(al);
    }
}
