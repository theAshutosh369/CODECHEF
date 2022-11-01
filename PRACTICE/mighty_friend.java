package CODECHEF.PRACTICE;

import java.util.*;

public class mighty_friend {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tooo = s.nextInt();
        for (int test = 0; test < tooo; test++) {
            int n = s.nextInt();
            int k = s.nextInt();
            int arr[] = new int[n];
            int m[] ;

            int motu=0 , tomu =0 ;
            if( (n&1)!=0 )
            {
                m = new int[n/2+1];

            }
            else {
                m = new int[n/2];
            }
            int t[] = new int[n/2];
            int mm=-1;
            int tt=-1;
            for (int i = 0; i <n; i++)
            {
                arr[i] = s.nextInt();
                if( (i&1)==0 ) {
                    mm++;
                    m[mm] = arr[i];
                    motu=motu+arr[i];
                }
                else {
                    tt++;
                    t[tt] = arr[i];
                    tomu= tomu+arr[i];
                }
            }

            if( tomu>motu ) System.out.println("YES");
            else {
                boolean f = false;
                while ( k-- >0 ) {
                    Arrays.sort(m);
                    Arrays.sort(t);
                    int sizem = m.length;

                    if ( m[ sizem-1 ] > t[0] )
                    {
                        int temp =  m[ sizem-1];
                        m[ sizem-1 ]= t[0];
                        t[0] = temp;

                    }
                    motu=motu- t[0]+m[ sizem-1 ];
                    tomu=tomu+t[0]-m[ sizem-1 ];

                    if( tomu > motu )
                    {
                        f=true;
                        System.out.println("YES");
                        break;
                    }
                }
                if( !f ) System.out.println("NO");
            }


        }
        s.close();
        //-------------------------------------------


    }
}
