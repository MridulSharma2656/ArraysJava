package SkillsPw.ArraysJava;

import java.util.Scanner;

public class RollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        long l = arr.length;
        System.out.println("The Number of Students:" + l);
        int i;
        for(i = 1;i<=l;i++)
        {
            System.out.print("The Marks of Student:");
            arr[i] = sc.nextDouble();
            if (arr[i] < 35)   System.out.println("The roll number of student is:" + i);
        }
    }
}
