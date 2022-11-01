package codechef.JUNE_LONG;

import java.util.*;

public class viii_expected_move
{
    public static void main(String[] args)
    {


        Scanner s = new Scanner(System.in);
        int aojsndonasd = s.nextInt();
        for (int t= 0; t < aojsndonasd; t++)
        {
            long xnumber = s.nextLong();
            long nnumber= s.nextLong();

            long answer =  (2*nnumber-xnumber)*(xnumber-1);
            System.out.println(  answer );
        }


    }
}
