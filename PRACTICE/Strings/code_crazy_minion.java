package codechef.Strings;

import java.util.*;

public class code_crazy_minion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            for (int i = 0; i < n; i++)
            {
                String str = s.next();
                int len = str.length();
                int ans = len+1;

                for (int j = 0; j < len-1; j++)
                {
                    int cr = str.charAt(j)-'`';
                    int ne = str.charAt(j+1)-'`';

                    if( cr<=ne) ans=ans+ (ne-cr);
                    else ans=ans+ ( 26-cr)+ne;
                }
                if( ans <= 11*len ) System.out.println("YES");
                else System.out.println("NO");

            }


    }
}
