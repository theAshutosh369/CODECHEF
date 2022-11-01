package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 1; i <= t; i++)
        {
            String str = s.next();
            String ans = "";
            int n = str.length();
            int j = 0;

            while( j < (n-1))
            {
                if(str.charAt(j)<str.charAt(j+1) && j+1<n )
                {
                    Character c = str.charAt(j);
                    ans=ans+c+c;
                    j++;
                }
                else if(str.charAt(j)==str.charAt(j+1))
                {
                    String ran = ""+str.charAt(j);
                    int r=j;
                    int c=0;
                    while(str.charAt(j)==str.charAt(r) && r<n-1)
                    {
                            r++;
                            c++;
                    }
                    if(r==n-1 && str.charAt(j)==str.charAt(r))
                    {
                        ans=ans+ran.repeat(c);
                        break;
                    }
                    ans=ans+ran.repeat((2*c));
                    j=r;
                }
                else{
                    ans=ans+str.charAt(j);
                    j++;
                }
            }
            ans = ans+str.charAt(n-1);
            System.out.println("Case #"+i+": "+ ans);



        }



    }
}
