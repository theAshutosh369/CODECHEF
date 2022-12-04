package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class same_parity_swap_in_binary_strings {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            String str = s.next();

            int oz = 0, oo = 0, ez = 0, eo = 0, to = 0, tz = 0;

            for (int i = 0; i < n; i++) {

                if (str.charAt(i) == '0' && i % 2 != 0) {
                    oz++;
                    tz++;
                } else if (str.charAt(i) == '1' && i % 2 != 0) {
                    oo++;
                    to++;
                } else if (str.charAt(i) == '0' && i % 2 == 0) {
                    ez++;
                    tz++;
                } else {
                    eo++;
                    to++;
                }

            }

            int ans = 0;

            if (to == tz) {
                ans = to - 1;
            } else if (to < tz) {
                ans = to;

            }
            else if (to > tz) {
                ans = tz;



            }

            System.out.println(ans);
        }
    }
}
