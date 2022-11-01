package codechef.Strings;

import java.util.*;

public class v_how_many_maximums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tpoai = scan.nextInt();
        for (int t = 0; t < tpoai; t++) {
            int number = scan.nextInt();
            String str = scan.next();

            char firstcharacter = str.charAt(0);
            char janabhai = firstcharacter;
            int count=1;
            for (int i = 1; i < number-1 ; i++)
            {
                if( str.charAt(i) != firstcharacter )
                {
                    count++;
                    firstcharacter = str.charAt(i);
                }
            }

            if( janabhai =='0')
            {
                if(count%2==0)
                {
                    System.out.println(count/2);
                }
                else {
                    System.out.println(count/2 + 1);
                }
            }
            else {
                System.out.println(count/2+1);
            }

        }


    }
}
