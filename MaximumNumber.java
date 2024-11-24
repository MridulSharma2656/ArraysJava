package SkillsPw.ArraysJava;

import java.util.Scanner;

public class MaximumNumber
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[]arr = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        int m =0;
        int one = arr[0];
        for(i=1;i<n;i++)
        {
             m = Math.max(arr[i],one);
        }
        System.out.print("The Maximum number is: "+m);
    }
}
