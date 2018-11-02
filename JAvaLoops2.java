import java.util.*;
import java.io.*;

class Solution{
    static int[] ar;
    public static int[] series(int a, int b, int n)
    {
         ar = new int[n];
         
         for(int i = 0; i < ar.length; i++)
         {
             ar[i] = a + sum(i,b);
         }
        return ar;
    }
    static int sum(int max, int b)
    {
        int sum = 0;
        for(int j = 0; j <= max; j++)
        {
            sum += power(2,j) * b;
        }
        return sum;
    }
    static int  power(int x, int y)
    {
        int pow = 1;
        for(int i = 0; i < y; i ++)
        {
            pow = pow * x; 
        }
        return pow;
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            series(a,b,n);
            for(int j : ar)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
