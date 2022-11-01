package codechef;

import java.util.Scanner;

public class unchanging_or {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int T = s.nextInt();
        for (int z = 0; z < T; z++)
        {
            int n = s.nextInt();

            int p =0;
            int ans=0;

            for (int i = 0; i < 10; i++)
            {
                if( (Math.pow(2,i)-1) >= n  )
                {
                    p=i-1;
                    break;
                }
                ans = ans + (int)(Math.pow(2,i-1)-1);

            }
            ans=ans + (  n - (int)(Math.pow(2,p))  ) ;

            System.out.println(ans);

        }

    }
}
