package codechef.Strings;

import java.util.*;

public class hiring_test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n =s.nextInt();
            int m =s.nextInt();
            int x =s.nextInt();
            int y =s.nextInt();

            String ans = "";
            String str[] = new String[n];
            for (int i = 0; i < n; i++)
            {
                str[i] = s.next();
                int f=0, p=0;
                for (int j = 0; j < str[i].length(); j++)
                {
                    if(str[i].charAt(j) == 'F') f++;
                    else if ( str[i].charAt(j)== 'P' ) p++;
                }
                if( f>=x || ( f==x-1 && p>=y )) ans=ans+'1';
                else ans=ans+'0';
            }
            System.out.println(ans);

        }


    }
}
