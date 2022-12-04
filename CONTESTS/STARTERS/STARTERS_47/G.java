package CODECHEF.CONTESTS.starters_47;

import java.util.*;

public class G {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            String str = s.next();

            Map<Character,Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                Character c = str.charAt(i);
                if( m.containsKey( c ))
                {
                    m.put( c , m.get(c)+ 1);
                }
                else {
                    m.put( c , 1 );
                }
            }

            boolean f = true;
            for( Map.Entry<Character ,Integer> e : m.entrySet())
            {
                int l = e.getValue();
                int k = l&(l-1);
                if( k!=0)
                {
                    f=false;
                    break;
                }
            }


            boolean g = false ;
            if( n==1 ) System.out.println("YES");
            if( (n&1)==0)
            {
                String a = str.substring(0,n/2);
                String b = str.substring(n/2,n);

                if( a.equals(b)) g = true;
            }
            else {

                String a = str.substring(0,n/2);
                String b = str.substring(n/2,n-1);

                if( a.equals(b)) g = true;

            }


            if( f && g) System.out.println("YES");
            else System.out.println("NO");
        }
        s.close();
        //-------------------------------------------
    }




}

