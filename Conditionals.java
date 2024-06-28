package fundamentals;

import java.util.Scanner;

public class Conditionals 
{
	public static void main(String[] args) 
	{
		Scanner  s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
	    if(a>b)
		{
			System.out.println("A is the largest");
		}
		else {
			System.out.println("B is the largest");
		}
	    System.out.println("Outside if else");
	    s.close();
	}
}
