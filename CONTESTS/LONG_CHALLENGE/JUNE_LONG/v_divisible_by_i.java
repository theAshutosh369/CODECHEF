package codechef.JUNE_LONG;

import java.util.*;

public class v_divisible_by_i {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            if( n%2==0)
            {
                int f = n/2;
                int sec = f+1;
                arr.add(f);
                arr.add(sec);

                for (int i = 2; i < n; i++)
                {
                    if( i%2==0 )
                    {
                        f--;
                        arr.add(f);
                    }
                    else {
                        sec++;
                        arr.add(sec);
                    }
                }
            }
            else {

                int f = n/2+1;
                int sec = f-1;
                arr.add(f);
                arr.add(sec);

                for (int i = 2; i < n; i++)
                {
                    if( i%2==0 )
                    {
                        f++;
                        arr.add(f);
                    }
                    else {
                        sec--;
                        arr.add(sec);
                    }
                }

            }
            for (int i = 0; i < arr.size(); i++) {
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();


        }
        s.close();
        //-------------------------------------------


    }
}
