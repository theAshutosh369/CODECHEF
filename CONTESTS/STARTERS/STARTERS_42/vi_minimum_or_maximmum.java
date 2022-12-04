package codechef.Strings;

import java.util.*;

public class vi_minimum_or_maximmum {
    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
        int tonfjnsjf = scan.nextInt();
        for (int t = 0; t < tonfjnsjf; t++)
        {

          int highest = Integer.MIN_VALUE;
          int lowest = Integer.MAX_VALUE;

          boolean flagforcondition = true;
            int size = scan.nextInt();
            int[] line = new int[size];

          for (int k = 0; k < size; k++)
          {
            line[k] = scan.nextInt();
          }



          for (int i = 0; i < size; i++)
          {
            lowest = Math.min(line[i],lowest);
            highest = Math.max(line[i],highest);

            if( i>1)
            {
              if( line[i] < highest && line[i]>lowest )
              {
                flagforcondition = false;
                break;
              }
              else if(line[i]>highest)
              {
                highest = Math.max(line[i],highest);
              }

            }
          }

          if( flagforcondition){
            System.out.println("YES");
          }
          else{
            System.out.println("NO");
          }




        }

    }
}
