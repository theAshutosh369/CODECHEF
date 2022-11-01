package CODECHEF.CONTESTS;

// Java code to print all possible subarrays for given array
// using recursion

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Ajeeb_program {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int cs=0;cs<t;cs++)
        {
            int n=sc.nextInt();
            TreeMap<Integer,ArrayList<Integer>>mp=new TreeMap<Integer,ArrayList<Integer>>();
            for(int i=0;i<n;i++)
            {
                int a=sc.nextInt();
                 if(mp.containsKey(a))
                 {
                     ArrayList<Integer> temp = mp.get(a);
                     temp.add(i);
                     mp.put(a, temp );
                 }
                 else{
                ArrayList<Integer>arr=new ArrayList<Integer>();
                arr.add(i);
                mp.put(a,arr);
                 }
            }
            for(Map.Entry<Integer,ArrayList<Integer>>it:mp.entrySet())
            {
                System.out.print(it.getKey()+"->");
                for(Integer i : it.getValue())
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }


    }
}

// This code is contributed by Sania Kumari Gupta
