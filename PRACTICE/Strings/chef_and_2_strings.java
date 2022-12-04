/* Chef has found two very old sheets of paper,
each of which originally contained a string of
lowercase Latin letters. The strings on both the
sheets have equal lengths. However, since the sheets
 are very old, some letters have become unreadable.

Chef would like to estimate the difference between
these strings. Let's assume that the first string is
 named S1, and the second S2. The unreadable symbols are
 specified with the question mark symbol '?'. The difference
 between the strings equals to the number of positions i,
 such that S1i is not equal to S2i, where S1i and S2i denote
 the symbol at the i the position in S1 and S2, respectively.

Chef would like to know the minimal and the maximal difference
 between the two strings, if he changes all unreadable symbols
 to lowercase Latin letters. Now that you're fully aware of
 Chef's programming expertise, you might have guessed that he
  needs you help solving this problem as well. Go on, help him! */



package codechef;

import java.util.Scanner;
import java.lang.String;


public class chef_and_2_strings {

    public static void main(String[] args) {

        Scanner s = new Scanner((System.in));
        int t = s.nextInt();

        for (int i = 0; i < t; i++)
        {
            String s1 = s.next();
            String s2 = s.next();

            int l = s1.length();

            int min=0,max=0;

            for (int j = 0; j < l; j++)
            {

                if( s1.charAt(j) == '?' || s2.charAt(j)=='?'   )
                {
                    max++;
                }
                else if(s1.charAt(j)!=s2.charAt(j))
                    {
                        min++;
                        max++;
                    }
            }

            System.out.println(min+ " "+ max);
        }



    }
}
