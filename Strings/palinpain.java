package codechef;

import java.util.Comparator;
import java.util.Scanner;

public class palinpain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long T = s.nextInt();
        for (long m = 1;m <= T; m++)
        {
            int x = s.nextInt();
            int y = s.nextInt();
           String s1 = "", s2="";
           String med="";
           if(x%2!=0) med="a";
           else if(y%2!=0) med="b";
           String str ="",strr = "";

           if( (x%2!=0 && y%2!=0) || ( x==1 || y==1) ) System.out.println(-1);
           else {

               for (int i = 0; i < (x/2); i++)
               {
                   str=str+"a";
               }
               for (int i = 0; i < (y / 2); i++) {
                   str=str+"b";
                   strr = strr+"b";
               }
               for (int i = 0; i < (x/2); i++)
               {
                   strr=strr+"a";
               }
               System.out.println(str+med+strr);
               System.out.println(strr+med+str);

           }




        }





    }
}
