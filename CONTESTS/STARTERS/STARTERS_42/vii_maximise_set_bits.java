package codechef.starter_42;

import java.util.*;

public class vii_maximise_set_bits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n =s.nextInt();
            int k =s.nextInt();

            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 1; i <= k+1; i++)
            {
                int r = i & (i-1);
                if( r==0)
                {
                    arr.add(i-1);
                }
            }
            System.out.println(arr);


        }
        s.close();
        //-------------------------------------------


    }
}
