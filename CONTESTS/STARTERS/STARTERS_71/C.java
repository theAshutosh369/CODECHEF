package CODECHEF.CONTESTS.STARTERS.STARTERS_71;
import java.util.*;

public class C {
    static Scanner s = new Scanner(System.in);

    static void AshutoshKaUniqueAnswer () {
        int n = s.nextInt();
        int arr[] = new int[n];
        Map<Integer , Integer> mp = new HashMap<>();
        for (int i = 0; i < n ; i++) {
            arr[i] = s.nextInt();
            mp.put( arr[i] , mp.getOrDefault(arr[i],0)+1 );
        }

        int num = mp.size();
        System.out.println( mp );

        boolean f = true;
        for( Map.Entry<Integer , Integer> e : mp.entrySet() )
        {
            if( e.getValue()%2!=0  ){
                f=false;
                break;
            }
        }

        if( f ) System.out.println( "YES");
        else System.out.println("NO");


    }

    public static void main ( String[] args ) {

        int t = s.nextInt();
        for (int test = 0; test < t; test++) {
            AshutoshKaUniqueAnswer();
        }
        s.close();
        //-------------------------------------------
    }
}

