package codechef.Strings;

import java.util.*;

public class Palindromic_substrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) 
        {
            String a = s.next();
            int l1 = a.length();
            String b = s.next();
            int l2 = b.length();

            int c=0;
            for (int i = 0; i <l1; i++)
            {
                for (int j = 0; j < l2 ; j++)
                {
                    if(a.charAt(i)==b.charAt(j)) c++;
                    break;
                }
            }
            if(c==0) System.out.println("NO");
            else System.out.println("YES");

          
        }


    }
}
