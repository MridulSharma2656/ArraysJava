package SkillsPw.ArraysJava;

public class RotateArray 
{
    public static void main(String[] args)
     {
        int [] arr = {2,5,6,-9,5,7,8};
        int k = 4;
        int l = arr.length;
        reverse(arr,0,l-k-1);
        reverse(arr,l-k,l-1);
        reverse(arr,0,l-1);
    }

    public static void reverse(int[] arr, int i, int j)
     {
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
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}