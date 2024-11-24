package SkillsPw.ArraysJava;

import java.util.Scanner;

public class BasicsArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of data:");
        int s = sc.nextInt();
        int[] arr = new int[s];
        int l = arr.length;
        int i;
        for(i = 0;i <= l; i++ )
        {
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }
        System.out.println(i + " ");
    }
}
