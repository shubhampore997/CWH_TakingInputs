package com.company;

import java.util.Scanner;

public class CWH_06_Exercise {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Marks.");

        System.out.println("Maths:");
        float maths =sc.nextInt();
        System.out.println("Science:");
        float science =sc.nextInt();
        System.out.println("Algebra:");
        float algebra =sc.nextInt();
        System.out.println("marathi:");
        float marathi =sc.nextInt();
        System.out.println("Social Science:");
        float ss =sc.nextInt();

        float totalMarks = maths+science+algebra+marathi+ss;
        System.out.println("Total Marks Of Student :" +totalMarks);

        float percentage = (totalMarks)/(500)*100;

        System.out.println("Percentage Of Student : "+ percentage+"%");











    }







}
