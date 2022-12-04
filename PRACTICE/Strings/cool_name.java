package codechef.Strings;

import java.util.*;

public class cool_name {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++)
        {
            String str = s.next();
            int len = str.length();
            Character c[] = new Character[len];
          for (int i = 0; i < len ; i++)
          {
            c[i] = str.charAt(i);
          }
          Arrays.sort(c);
          int sum =0;

          for (int i = 1; i <=len ; i++)
          {
              sum = sum+ ( i * ( (int)c[i-1]-96 ));
          }
            System.out.println(sum);

        }


    }
}
