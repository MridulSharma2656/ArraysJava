package SkillsPw.ArraysJava;

import java.util.ArrayList;

public class ArraysListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arl = new ArrayList<>(6);
        // arl.add(0,1);
        // arl.add(1,10);
        // arl.add(2,15);
        // arl.add(3,14);
        // arl.add(4,12);
        arl.addFirst(1);
        arl.addFirst(10);
        arl.addFirst(15);
        arl.addFirst(14);
        arl.addFirst(12);
        // arl.remove(3);
        for (int ele : arl)
        {
            System.out.print(ele+"   ");
            System.out.println(arl.size());
             
        }
        
    }
}
