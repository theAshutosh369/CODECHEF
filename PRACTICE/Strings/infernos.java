package codechef.Strings;

import java.util.*;

public class infernos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int x = s.nextInt();
            int[] h= new int[n];
            int ms , ss =0 ;

            for (int i = 0; i < n; i++) {
                h[i] = s.nextInt();
            }
            Arrays.sort(h);
            ms = h[n-1];

            for (int i = 0; i < n; i++)
            {
                if( h[i] <= x ) ss++;
                else {
                    if( h[i]%x==0 ) ss=ss+(h[i]/x);
                    else {
                        ss= ss+ (h[i]/x)+1;
                    }
                }
            }

            if( ss <= ms ) System.out.println(ss);
            else System.out.println(ms);





        }
        s.close();
        //-------------------------------------------


    }
}
