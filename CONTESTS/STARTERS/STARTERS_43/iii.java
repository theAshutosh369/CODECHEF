package CODECHEF.CONTESTS.starters_43;

import java.util.*;

public class iii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n =s.nextInt();
          String str = s.next();
          String ans = "";
            for (int i = 0; i < n; i=i+2)
            {
                String k = str.substring(i,i+2);
                if( k.equals("00"))
                {
                    ans=ans+"A";
                }
                else if(k.equals("01") )
                {
                    ans=ans+"T";
                }
                else if(k.equals("10") )
                {
                    ans=ans+"C";
                }
                else {
                    ans=ans+"G";
                }
            }
            System.out.println(ans);

        }
        s.close();
        //-------------------------------------------


    }
}
