package SkillsPw.ArraysJava;

import java.util.Scanner;

public class SecondLargestNumber
 {
    static int c;
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
        int m = Integer.MIN_VALUE;
        int one = arr[0];
        for(i=1;i<n;i++)
        {
             m = Math.max(arr[i],one);  
        }
        System.out.println("The Largest number is: "+m );
        int sl = Integer.MIN_VALUE;
        for(i=1;i<n;i++)
        {
            if (arr[i] != m) 
                sl = Math.max(arr[0], arr[i]);
        }
        System.out.println("The Second Largest Number is : "+sl);
    }
}
