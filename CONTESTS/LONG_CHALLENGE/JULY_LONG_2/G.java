package CODECHEF.CONTESTS.JULY_LONG_2;

import java.util.*;

public class G {

    static Scanner scan = new Scanner(System.in);
    static void code(){
        int size = scan.nextInt();
        int[] dori = new int[size];
        int[] ajunekdori= new int[size];

        for (int i = 0; i < size; i++) {
            dori[i] = scan.nextInt();
            ajunekdori[i] = dori[i];
        }

        Arrays.sort(ajunekdori);
        int index = 0;
        ArrayList<Integer> aplajigari = new ArrayList<>();
        for (int i = 0; i <size ; i++)
        {
            if( ajunekdori[index] != dori[i])
            {
                aplajigari.add(dori[i]);
            }
            else{
                index++;
            }
        }

        boolean pole = true;
        for (int i = 1; i < aplajigari.size(); i++)
        {
            if( aplajigari.get(i)<aplajigari.get(i-1))
            {
                pole = false;
                break;
            }
        }
        if (pole ) {
            System.out.println( "YES");
        }
        else {
            System.out.println("NO");
        }

    }
    public static void main(String[] args) {

        int t = scan.nextInt();
        for (int test = 0; test < t; test++)
        {
           code();
        }

    }
}
