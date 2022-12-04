/* Chef has a string S consisting of lowercase English characters. Chef defined functions left shift L(X) and right shift R(X) as follows.

L(X) is defined as shifting all characters of string X one step towards left and moving the first character to the end.
R(X) is defined as shifting all characters of string X one step towards the right and moving the last character to the beginning.
For example, L("abcd") = "bcda" and R("abcd") = "dabc"

Chef wants to find out whether there exists a string V of the same length as S such that both L(V)=S and R(V)=S holds.

*/


package codechef;
import java.util.Scanner;

public class CHEF_AND_STRING {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i = 0; i <t; i++)
        {
            String str =s.next();
            int len = str.length();

            String lx = "" , rx="";

            if( len == 1)
            {
                System.out.println("YES");
            }
            else
            {
                lx = lx + str.substring(1, len) + str.charAt(0);
                rx= rx + str.charAt(len-1) + str.substring(0, len-1);
                if(lx.equals(rx) )
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
}
