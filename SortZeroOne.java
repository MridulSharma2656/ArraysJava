package SkillsPw.ArraysJava;

public class SortZeroOne
 {
    public static void main(String[] args)
     {
        int [] arr = {0,1,0,1,0,1,1,1,0,1,1,1,0};
       int l = arr.length;
       int nozero = 0;
       int noone = 0;
       int i = 0;
       while (i<l)
        {
            if (arr[i]==0) nozero+=1;
            else noone+=1;
            i++;
       }
       int j = 0;
       while (j<=(nozero))
        {
        arr[j] = 0;
        j++;
       }
       int k = (nozero);
       while (k<l)
        {
        arr[k] = 1;
        k++;
       }
      for (int ele : arr)
       {
        System.out.print(ele + " ");
      }
      System.out.println();
    }
}
