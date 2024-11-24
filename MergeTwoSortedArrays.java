package SkillsPw.ArraysJava;

public class MergeTwoSortedArrays 
{
    public static void main(String[] args) 
    {
        int[] arr1 = {1,3,5,7,9,15};
        int[] arr2 = {2,4,6,8,10};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int l3 = l1 + l2;
        int[] arr3 = new int[l3];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l1 && j < l2) 
        {
            if(arr1[i] <= arr2[j])
             {
                arr3[k] = arr1[i];
                i++;
            }
            else 
            {
                arr3[k] = arr2[j]; 
                j++;
            }
            k++;
        }
        if(i == l1)
         {
            while(j<l2)
             {
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }
        if(j == l2) 
        {
            while (i<l1)
             {
                arr3[k] = arr1[i];
                i++;
                k++;
            }
        }
        for (int x : arr1) 
        {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int y : arr2) 
        {
            System.out.print(y + " ");
        }
        System.out.println();

        for (int ele : arr3) 
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
