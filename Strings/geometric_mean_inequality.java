package codechef;

import java.util.*;

public class geometric_mean_inequality {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int o=0 , mo =0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
                if(arr[i]==1) o++;
                else mo++;
            }
            if( (Math.abs(mo-o)<2) ) System.out.println("YES");
            else if( Math.abs(mo-o)==2 && o%2==0 && mo%2==0) System.out.println("YES");
            else System.out.println("NO");

        }


    }
}
