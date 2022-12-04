package CODECHEF.CONTESTS.AUGUST_LONG;
import java.util.*;

public class E {
    public static void main ( String[] args ) {
        Scanner scnnn = new Scanner(System.in);
        int test = scnnn.nextInt();
        while (test-->0){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int n = scnnn.nextInt();
            int x = scnnn.nextInt();
            int y = scnnn.nextInt();


            for (int i = 0; i < n; i++) {
                pq.add( scnnn.nextInt() );
            }

            while(y>0)
            {
                int min = pq.peek();
                int res = min^x;
                if( res <= min )
                {
                    if( (y&1)==0 ) break;
                    else {
                        pq.remove();
                        pq.add( res );
                        break;
                    }

                }
                else {
                    pq.remove();
                    pq.add(res);
                    y--;
                }
            }

            int i=0;
            int st[] = new int[n];
            while (!pq.isEmpty())
            {
                st[i] = pq.remove();
                i++;
            }
            for (i = 0; i < n; i++) {
                System.out.print(st[i]+" ");
            }
            System.out.println();

        }

    }
}


