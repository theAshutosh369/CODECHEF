package codechef.Strings;

import java.util.*;

public class subarrays_with_length {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] =s.nextInt();
            }

            int ans =0;
            Set<String> st = new HashSet<>();
            for (int i = 0; i < n; i++)
            {
                int l,r;

                if( (i-arr[i]+1)<0 ) l=0;
                else l=(i-arr[i]+1);

                if( i+arr[i]-1>=n ) r=n-1;
                else r= i+arr[i]-1;

                int ll=l , rr=l+arr[i]-1;

//                while( rr<=r )
//                {
//                    String str = ll+"-"+rr;
//                    st.add(str);
//                    rr+=1;
//                    ll+=1;
//                }


            }
            System.out.println(st.size());
        }
        s.close();
        //-------------------------------------------


    }
}
