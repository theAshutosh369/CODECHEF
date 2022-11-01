package codechef.Strings;

import java.util.*;

public class MAX_OR_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int test = 0; test < t; test++)
        {
            int numberofbits = scan.nextInt();
            int[] bitsarray = new int[numberofbits];
            int numberofones=0;
            int numberofzeroes=0;
          for (int k = 0; k < numberofbits; k++)
          {
            bitsarray[k] = scan.nextInt();
            if(bitsarray[k]==1) {
              numberofones++;
            }
            else{
              numberofzeroes++;
            }
          }

          if( numberofones>=numberofzeroes) {
            System.out.println(1);
          }
          else {
            System.out.println(0);
          }

        }
        scan.close();
        //-------------------------------------------


    }
}
