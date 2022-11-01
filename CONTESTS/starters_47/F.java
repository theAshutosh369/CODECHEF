package CODECHEF.CONTESTS.starters_47;

import java.util.*;

public class F {

    static Scanner s = new Scanner(System.in);
    static void code(){
        int number = s.nextInt();

        boolean fffffff = false;
        boolean pppppp = false;

        int greatest = Integer.MIN_VALUE;
        Map<Integer,Integer> mappppep = new HashMap<>();
        int[] wow = new int[number];

        for (int i = 0; i < number; i++)
        {
            wow[i]=s.nextInt();
            if( wow[i]>greatest ) greatest = wow[i];
            if( mappppep.containsKey(wow[i] ))
            {
                mappppep.put( wow[i] , mappppep.get(wow[i])+ 1);
            }
            else {
                mappppep.put( wow[i] , 1 );
            }
        }

        long countone =0;

        for( Map.Entry<Integer ,Integer> iankjns : mappppep.entrySet())
        {
            if( iankjns.getValue()==1 ) countone++;
            if( iankjns.getValue()>2 )
            {
                fffffff=true;
            }
            if( iankjns.getValue()==1 && iankjns.getKey()==greatest)
            {
                pppppp = true;
            }
        }


        if( (countone&1)==0 )
        {
            System.out.println( countone/2 );
        }
        else {
            if(pppppp && countone ==1 )
            {
                if( fffffff) {
                    System.out.println(1);
                }
                else System.out.println(2);
            }
            else {
                System.out.println(countone / 2 + 1);
            }
        }
    }

    public static void main(String[] args) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
           code();
        }
        s.close();
        //-------------------------------------------


    }
}
