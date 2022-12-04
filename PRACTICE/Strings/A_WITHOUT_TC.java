package codechef;

import java.util.*;

public class A_WITHOUT_TC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int n =s.nextInt();

        int sum=0;
        int i=0;
        while(sum<n)
        {
            sum= sum + ( i*(i+1)/2 );
            if(sum!=n) i++;
        }
        System.out.println(i);




    }
}
