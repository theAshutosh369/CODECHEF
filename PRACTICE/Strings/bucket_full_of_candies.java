package codechef;

import java.util.Scanner;

public class bucket_full_of_candies {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long T = s.nextInt();
        for (long z = 1;z <= T; z++)
        {
            long n = s.nextLong();
            long m = s.nextLong();
            long l = s.nextLong();
            long i=n-1;
           while(i>=0)
           {
               m=m%(l+i);
               i= m-l;
           }
            System.out.println(m);

        }


    }
}
