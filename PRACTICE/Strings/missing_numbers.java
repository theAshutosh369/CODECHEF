package codechef;
//Missing Numbers


import java.util.*;
import java.lang.*;
import java.io.*;

class missing_numbers
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long num[]=new long[4];

            for(int i=0;i<4;i++)
                num[i]=sc.nextLong();
            Arrays.sort(num);

            double p1=(double)(num[2]+num[0])/2;
            double q1=num[2]-p1;

            double p2=(double)(num[2]+num[1])/2;
            double q2=num[2]-p2;

            double p3=(double)(num[3]+num[0])/2;
            double q3=num[3]-p3;

            double p4=(double)(num[3]+num[1])/2;
            double q4=num[3]-p4;


            if( (p1>=1)   && (q1>=1))
            {
                if( ((int)(p1/q1)==(double)num[1])  &&  (p1*q1==(double)num[3]) )
                {
                    System.out.println( (long)p1+" "+(long)q1 );
                    continue;
                }
            }
            if( (p2>=1)  &&   (q2>=1))
            {
                if(((long)(p2/q2)==(double)num[0])  &&  (p2*q2==(double)num[3]) )
                {
                    System.out.println( (long)p2+" "+(long)q2 );
                    continue;
                }
            }
            if( (p3>=1)  &&    (q3>=1))
            {
                if(((long)(p3/q3)==(double)num[1])  &&  (p3*q3==(double)num[2]) )
                {
                    System.out.println( (long)p3+" "+(long)q3 );
                    continue;
                }
            }
            if( (p4>=1)  &&   (q4>=1))
            {
                if(((long)(p4/q4)==(double)num[0])  &&  (p4*q4==(double)num[2]) )
                {
                    System.out.println( (long)p4+" "+(long)q4 );
                    continue;
                }
            }
            System.out.println("-1 -1");
        }
    }
}
