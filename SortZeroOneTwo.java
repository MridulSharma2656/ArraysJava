package SkillsPw.ArraysJava;

public class SortZeroOneTwo 
{
    public static void main(String[] args) 
    {
        int [] arr = {1,0,0,2,1,0,2,1,1,0,2,0,1,0,};
        for (int ele : arr)
         {
            System.out.print(ele + " ");
        }
        System.out.println();
        
        // SOLUTION DUTCH FLAG METHOD OR ONE-PASS METHOD

        int l = arr.length;
        int low=0;
       int mid = 0;
        int high = l-1;
        while (mid<=high) 
        {
             if (arr[mid] == 0)
              {
                int a = arr[low];
                arr[low] = arr[mid];
                arr[mid] = a;
              mid++;
              low++;
             }
             else if (arr[mid] == 1)
              {
              mid++;
             }                                        
            // arr[mid] == 2
            else 
             {
                int x = arr[mid];
                arr[mid] = arr[high];
                arr[high] = x;
              high--;
             }
             if (mid>high)   break;
        }
        for (int ele : arr) 
        {
            System.out.print(ele + " ");
        }
        System.out.println();
        }
    }

