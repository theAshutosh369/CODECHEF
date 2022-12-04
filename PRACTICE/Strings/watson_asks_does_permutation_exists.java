
/* Watson gives an array A of N integers A1, A2, ..., AN to Sherlock. He wants Sherlock to reorganize the array in a way such that no two adjacent numbers differ by more than 1.

Formally, if reorganized array is B1, B2, ..., BN, then the condition that | Bi - Bi + 1 | ≤ 1, for all 1 ≤ i < N(where |x| denotes the absolute value of x) should be met.

Sherlock is not sure that a solution exists, so he asks you.   */


package codechef;

import java.util.Scanner;
public class watson_asks_does_permutation_exists {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i <t; i++)
        {
            int n = s.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = s.nextInt();
            }

            int c =0;
            for (int j = 0; j < n-1; j++) {
                int r= Math.abs(arr[j+1] - arr[j]);
                if( r>1 )
                {
                    c++;
                }
            }

            if( c==0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }


    }
}
