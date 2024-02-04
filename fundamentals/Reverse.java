package fundamentals;
import java.util.Scanner;
public class Reverse 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		int mod;
		while (num>0)
		{
			mod=num%10;
			rev=mod+rev*10;
			num=num/10;
		}
		System.out.println("The reverse of the given number"+num+"is :"+rev);
		s.close();
	}
}
