package codechef;

import java.util.Scanner;

public class good_permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long T = s.nextInt();
        for (long z = 1; z <= T; z++)
        {
            int n = s.nextInt();
            if(n%2!=0)
            {
                if(n==1 || n==3)
                {
                    System.out.println(-1);
                }
                else
                {
                    System.out.print("3 5 1 2 4 ");
                    for (int i = n; i >= 6; i--)
                    {
                        System.out.println(i + " ");
                    }
                }
            }
            else
            {
                for(int i=1;i<=n;i++){
                    System.out.print(n+1-i+" ");
                }
                System.out.println();
            }
        }


    }
}
