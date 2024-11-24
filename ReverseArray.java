package SkillsPw.ArraysJava;

public class ReverseArray
 {
    public static void main(String[] args)
     {
        int[] arr = {2,4,6,8,-5};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        int l = arr.length;
        int i = 0, j =( l-1 );
        while (i<=j) 
        {
           int s = arr[i];
            arr[i] = arr[j];
            arr[j] = s;
            i++;
            j--;
        }
        for (int ele : arr)
         {
            System.out.print(ele+ " ");
        }
        System.out.println();
        }
    }
