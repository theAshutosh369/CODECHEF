package CODECHEF.CONTESTS.starters_43;

import java.util.*;

public class v_distinct_palindrome
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int x = s.nextInt();

            if( n<(2*x-1) )
            {
                System.out.println(-1);
            }
            else
            {
                StringBuilder str = new StringBuilder( "a".repeat(n) );
                int m = 98;
                for (int i = 0 , j=n-1 ; i < x-1; i++ , j--)
                {
                    str.setCharAt(i,(char)m);
                    str.setCharAt(j,(char)m);
                    m++;
                }
                System.out.println(str);
            }

        }
        s.close();
        //-------------------------------------------


    }
}

