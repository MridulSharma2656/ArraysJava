package SkillsPw.ArraysJava;

public class NextGreatestElement 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1,3,7,9,50,45,5,30,9};
        int l1 = arr1.length;
        int [] arr2 = new int[l1];
        arr2[l1 - 1] = -1;
        // METHOD 1 (BRUTE FORCE)
        int i = 0;
        while (i<(l1-1)) 
        {
            int mx = Integer.MIN_VALUE;
            int j = i+1;
            while (j<l1) 
            {
               mx = Math.max(mx,arr1[j]);
                j++;
            }
            arr2[i] = mx;
            i++;
        }
        // METHOD 2 (OPTIMISED)
        // int nge = arr1[l1-1];
        // int i = l1-2;
        // while (i >= 0) 
        // {
        //     arr2[i] = nge;
        //     nge = Math.max(arr1[i],nge);
        //     i--;
        // }
        for (int ele : arr2) 
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
