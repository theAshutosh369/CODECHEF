package codechef;

import java.util.Scanner;

public class binary_mismatch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long T = s.nextInt();
        for (long z = 1; z <= T; z++)
        {
            int n = s.nextInt();
            String str = s.next();
            if(n%2!=0)
            {
                System.out.println("NO");
            }
            else {

                System.out.println("YES");
                int zr = 0, on = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '0') zr++;
                    else on++;
                }

                int num = Math.abs(zr - on)/2;

                if (num == 0) {
                    System.out.println(1 + " " + n);
                }
                else if(num==1)
                {
                    if(zr>on)
                    {
                        for (int i = 0; i < n; i++) {
                            if (str.charAt(i) == '0') {
                                System.out.println((i + 1) + " " + (i + 1));
                                break;
                            }
                        }
                    }
                    else
                    {
                        for (int i = 0; i < n; i++)
                        {
                            if(str.charAt(i)=='1') {
                                System.out.println((i + 1) + " " + (i + 1));
                                break;
                            }
                        }

                    }
                }


            }

        }

    }
}
