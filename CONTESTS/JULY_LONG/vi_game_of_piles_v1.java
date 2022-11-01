package CODECHEF.CONTESTS.JULY_LONG;

import java.util.Arrays;
import java.util.Scanner;

public class vi_game_of_piles_v1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            int size = s.nextInt();
            int Array[] = new int[size];
            int odd=0 , onecount =0;

            for (int j = 0; j < size  ; j++)
            {
                Array[j] = s.nextInt();
                if( Array[j]==1 )
                {
                    onecount++;
                }
                if( Array[j] %2==1 )
                {
                    odd++;
                }
            }
            if( odd%2==1 || onecount>0 )
            {
                System.out.println("CHEF");
            }
            else{
                System.out.println("CHEFINA");
            }

        }


    }
}
