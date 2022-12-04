/* Today, Chef decided to cook some delicious meals from the ingredients in his kitchen. There are N ingredients,
 represented by strings S1,S2,…,SN. Chef took all the ingredients, put them into a cauldron and mixed them up.

In the cauldron, the letters of the strings representing the ingredients completely mixed, so each letter
 appears in the cauldron as many times as it appeared in all the strings in total; now, any number of times,
 Chef can take one letter out of the cauldron (if this letter appears in the cauldron multiple times, it can
 be taken out that many times) and use it in a meal. A complete meal is the string "codechef". Help Chef find the
 maximum number of complete meals he can make  */


package codechef;
import java.util.Scanner;

public class making_a_meal {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i <t; i++)
        {
            int n = s.nextInt();
            String str[] = new String[n];
            int c=0,o=0,d=0,e=0,h=0,f=0;

            for(int j=0 ;j<n;j++)
            {
                str[j] = s.next();
            }

            for (int j = 0; j < n; j++) {
                String ns = str[j];
                for (int k = 0; k < ns.length(); k++) {
                    if( ns.charAt(k)== 'c')
                    {
                        c++;
                    }
                    if( ns.charAt(k)== 'o')
                    {
                        o++;
                    }
                    if( ns.charAt(k)== 'd')
                    {
                        d++;
                    }
                    if( ns.charAt(k)== 'e')
                    {
                        e++;
                    }
                    if( ns.charAt(k)== 'h')
                    {
                        h++;
                    }
                    if( ns.charAt(k)== 'f')
                    {
                        f++;
                    }

                }
            }
            int a[] = { c,o,d,e,h,f};
            a[0] /=2 ;
            a[3] /= 2;
            int min = a[0];

            for (int j = 1; j < a.length; j++) {
                if(a[j] < min) min = a[j];
            }

            System.out.println(min);
        }





    }
}
