package codechef.Strings;

import java.util.*;

public class daily_train {
    
    public static int fact(int x)
    {
        int ans =1;
        for (int i = 1; i <=x; i++) 
        {
            ans*=i;
        }
        return ans;
    }
    
    public static int ncr(int n , int r)
    {
        if(r>n) return 0;
        else {
            return fact(n) / ( fact((n-r)) * fact(r));
        }
    }
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

            int x =s.nextInt();
            int n =s.nextInt();
            int ans=0;
            for (int z = 0;z < n; z++) 
            {
                String str = s.next();
                for (int i=0,j=53 ; i<j ; i=i+4,j=j-2 )
                {
                    int p=0;
                    for (int k = i; k < i+4; k++)
                    {
                        if( str.charAt(k)=='0') p++;
                    }
                    for (int k = j; k >j-2 ; k--)
                    {
                        if(str.charAt(k)=='0') p++;
                    }
                    ans=ans+ncr(p,x);
                }
            }
            System.out.println(ans);

    }
}
