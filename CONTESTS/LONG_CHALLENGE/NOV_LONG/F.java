package NOV_LONG;

import java.util.*;

public class F {


    public static void main ( String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            String str = s.next();

            int num = Integer.parseInt( str , 2);
            System.out.println(num);

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add( num );
            for (int i = 0; i < str.length()-1; i++)
            {
                if( str.charAt(i)!= str.charAt(i+1))
                {
                    char ch =  str.charAt(i) ;
//                    str.charAt(i) = str.charAt(i+1);

                }
            }

        }
        s.close();
        //-------------------------------------------


    }
}
