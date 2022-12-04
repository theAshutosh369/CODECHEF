package NOV_LONG;

import java.util.*;

public class C {
    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String str = s.next();

            Map<Character , Integer> mp = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);

                mp.put( ch , mp.getOrDefault( ch , 0 )+1);
            }


            boolean f = true;
            for( Map.Entry<Character , Integer> e : mp.entrySet())
            {
                if( e.getValue()%2!=0 )
                {
                    f=false;
                    System.out.println("NO");
                    break;
                }
            }

            if( f ) System.out.println("YES");
        }
        s.close();
        //-------------------------------------------


    }
}
