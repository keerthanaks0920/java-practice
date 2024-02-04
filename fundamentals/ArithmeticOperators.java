package fundamentals;

import java.util.Scanner;

public class ArithmeticOperators{
	public static void main(String args[])
	{
		int p;
		double r;
		int t,si;
		Scanner s=new Scanner(System.in);
		p=s.nextInt();
		r=s.nextDouble();
		t=s.nextInt();
		si=(int)(p*r*t)/100;
		System.out.println(si);
	    s.close();
    }
}
