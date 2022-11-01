
//In an attempt to reduce the growing population, Archer was asked to come up with a plan. Archer being as intelligent as he is, came up with the following plan:
//
//If N children, with names C1,C2,...,CN, are born to parents with names A and B, and you consider C to be the concatenation of all the names of the children, i.e. C=C1+C2+...+CN (where + is concatenation operator), then C should be a substring of one of the permutations of A+B.
//
//You are given the task to verify whether the names parents propose to give their children are in fact permissible by Archer's plan or not.



package codechef;
import java.util.Scanner;

public class Name_reduction {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        for (int z = 0; z < T; z++)
        {
            String a =s.next();
            String b =s.next();

            char arr[] = new char[26];

            for (int i = 0; i < a.length(); i++)
            {
                arr[a.charAt(i)-97]++;
            }
            for (int i = 0; i < b.length(); i++)
            {
                arr[b.charAt(i)-97]++;
            }


            Boolean flag = true;
            int n =s.nextInt();
            for (int i = 0; i < n; i++)
            {
                String c = s.next();
                for (int j = 0; j < c.length(); j++)
                {
                    if (arr[c.charAt(j)-97] >0)
                    {
                        arr[c.charAt(j)-97]--;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if (flag)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }


    }
}
