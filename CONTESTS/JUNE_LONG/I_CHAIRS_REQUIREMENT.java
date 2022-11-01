package codechef.JUNE_LONG;

import java.util.*;

public class I_CHAIRS_REQUIREMENT {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int a =s.nextInt();
            int b =s.nextInt();
            if( a<=b) {
                System.out.println(0);
            }
            else System.out.println(a-b);


        }
        s.close();
        //-------------------------------------------


    }
}
