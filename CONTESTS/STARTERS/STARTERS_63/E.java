package com.company.STARTERS_63;

import java.util.*;

public class E {
    static Scanner s = new Scanner(System.in);

    static void ashutosh_ka_answer()
    {
        int length = s.nextInt();
        String str = s.next();
//            for (int i = 0; i < n-1; i++) {
//                if( str.charAt(i)==str.charAt(i+1))
//                {
//                    c++;
//                }
//            }
//            if( c== n/2 )
//            {
//                System.out.println("YES");
//            }
//            else {
//                System.out.println("NO");
//            }

        Stack<Character> ash = new Stack<>();
        ash.push( str.charAt(0));
        for (int i = 1; i < length; i++) {
            if( ash.peek()== str.charAt(i) )
            {
                ash.pop();
                ash.push('0');
            }
            else {
                ash.push(str.charAt(i));
            }
        }

        if( ash.size()==1 )
        {
            System.out.println("YES");
        }
        else
        {
            char ghatiya = ash.peek();
            ash.pop();
            while ( !ash.empty() && ash.peek()== ghatiya )
            {
                ash.pop();
            }

            if( ash.isEmpty() )
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }


    }
    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
           ashutosh_ka_answer();
        }


    }
}
