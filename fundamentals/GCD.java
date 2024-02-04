package fundamentals;

import java.util.Scanner;
public class GCD{
	public static void main(String args[])
	{
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int gcd=1;
    if(a > b)
    {
        if(b % a==0)
        {
           gcd=a;
           break;
        }
    }
    else
    {
        if(a % b==0)
        {
           gcd=b;
           break;
        }
    }
    for(int i=2;i<=Math.min(a,b);i++)
    {
        if(a%i==0 && b%i==0)
        {
            gcd=i;
        }
    }
    System.out.println(gcd);
    s.close();
    }
}
