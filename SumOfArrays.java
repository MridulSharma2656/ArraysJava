package SkillsPw.ArraysJava;

public class SumOfArrays {
    public static void main(String[] args) {
       int[] arr =  {10,20,40,60,50};
       int i;
       int sum = 0;
       for(i = 0;i<arr.length;i++)
       {
        sum += arr[i];
       }
       System.out.println("The sum is:"+ sum);
    }
}
