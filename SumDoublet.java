package SkillsPw.ArraysJava;

public class SumDoublet {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,-5};
        int x = 10;
        int l = arr.length;
        int i,j = 0;
        for(i = 0;i<l;i++)
        {
            
           for(j=(i+1);j<l;j++)
           {
            if (arr[i]+arr[j]==x)
            {
                System.out.println("Doublet found at " +i+" "+j);
            }
        }   
    }
}
}
