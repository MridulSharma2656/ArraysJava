package SkillsPw.ArraysJava;

import java.util.Scanner;

public class FindElement
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
            System.out.print("Enter the elements in the array:");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to be found:");
        int x = sc.nextInt();
        boolean flag = false;
        for(i=0;i<n;i++)
        {
            if (arr[i]==x)
            {
            flag = true;
            break; 
            }
        }
        if(flag==true) 
        System.out.print("Element "+x+" is found at position "+(i+1));
        else  System.out.print("Element " +x+ " not found");
    }
}
