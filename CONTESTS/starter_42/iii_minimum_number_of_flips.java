package codechef.starter_42;

import java.util.*;

public class iii_minimum_number_of_flips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for (int test = 1;test <= T; test++)
        {
            int n = s.nextInt();
            int arr[] = new int[n];
            int p = 0, neg = 0;
            for (int i = 0; i < n; i++)
            {
                arr[i] = s.nextInt();
                if (arr[i] == 1) p++;
                else neg++;
            }
            if( n%2!=0){
                System.out.println(-1);
            }
            else {
                System.out.println(Math.abs(n / 2 - p));
            }



        }
        s.close();
    }
}
