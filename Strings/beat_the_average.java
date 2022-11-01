package codechef.Strings;

import java.util.*;

public class beat_the_average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int love = s.nextInt();
        for (int z = 0; z < love; z++)
        {
            int numberofstudents =s.nextInt();
            int maxscore =s.nextInt();
            int average =s.nextInt();

            if( maxscore<= average ) {
                System.out.println(0);
            }
            else {
                int mul = numberofstudents*average;
                System.out.println( mul / (average+1));
            }

        }
        s.close();
        //-------------------------------------------


    }
}
