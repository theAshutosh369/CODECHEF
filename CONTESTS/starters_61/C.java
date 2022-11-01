package CODECHEF.CONTESTS.starters_61;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String s1 = s.next();
            String s2 = s.next();

            Map<Character , Integer> m1 = new TreeMap<>( Collections.reverseOrder( ) );
            Map<Character , Integer> m2 = new TreeMap<>();

            int lcs1  =0 , lcs2 =0 ;
            for (int i = 0; i < n; i++)
            {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                m1.put( c1 , m1.getOrDefault( c1 , 0 )+1 );
                m2.put( c2 , m2.getOrDefault( c2 , 0 )+1 );
            }

//            System.out.println(m1 );
//            System.out.println(m2 );
            char search = 'a';
            for( Map.Entry<Character , Integer> e : m1.entrySet() )
            {
                if( e.getValue() > lcs1 ) {
                    search = e.getKey();
                    lcs1 = e.getValue();
                }
            }
            boolean f = true;
            for( Map.Entry<Character , Integer> e : m2.entrySet() )
            {
                if( e.getKey() == search )
                {
                    f = false;
                    System.out.println( Math.min( e.getValue() ,lcs1 ));
                }
            }

            if (f )
            {
                System.out.println( lcs1 );
            }


        }
        s.close();
        //-------------------------------------------


    }
}
