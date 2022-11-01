package codechef.Strings;

import java.util.*;

public class flip_to_invert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int k = s.nextInt();
           String str = s.next();

           int len = str.length();
           int cz =0 ;
           ArrayList<Integer> al = new ArrayList<>();
            for (int i = len-1; i >=0; i--)
            {
                if(str.charAt(i)=='0') cz++;
                else al.add(cz);
            }
            int ans=0;
            for (int i = 0; i < al.size() - k; i++)
            {
                ans= ans + (al.get(i));
            }
            System.out.println(ans);
        }


    }
}
