package codechef.Strings;

import java.util.*;

public class pushpa {
    public static void main(String[] args) {
        Scanner scankarre = new Scanner(System.in);
        int tttttttt = scankarre.nextInt();
        for (int testcases = 0; testcases < tttttttt; testcases++) {
            int numberoftowers = scankarre.nextInt();
            long[] arrayoftower = new long[numberoftowers];
            Map<Long,Long> nakasha = new HashMap<>();
            for (int lol = 0; lol < numberoftowers; lol++)
            {
                arrayoftower[lol] = scankarre.nextLong();
            }
            Arrays.sort(arrayoftower);
            long faltuvalue = 1;
            for (int i = 0; i < numberoftowers; i++) {
                if( nakasha.containsKey(arrayoftower[i]) )
                {
                    nakasha.put( arrayoftower[i] , nakasha.get(arrayoftower[i])+1 );
                }
                else {
                    nakasha.put( arrayoftower[i] ,faltuvalue );
                }
            }
            long sarvocchvalue =Integer.MIN_VALUE;
            long highestsum = Integer.MIN_VALUE;

            for (Map.Entry<Long,Long> iterator : nakasha.entrySet())
            {
                if( iterator.getKey() >= sarvocchvalue )
                {
                    sarvocchvalue = iterator.getKey();
                }
                if( iterator.getValue()+iterator.getKey() >= highestsum )
                {
                    highestsum = iterator.getValue()+iterator.getKey();
                }
            }


            long uttara = highestsum -1;
            if( uttara >= sarvocchvalue){
                System.out.println(uttara );
            }
            else {
                System.out.println(sarvocchvalue);
            }

        }
        scankarre.close();
        //-------------------------------------------


    }
}
