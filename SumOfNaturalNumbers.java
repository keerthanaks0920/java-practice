package fundamentals;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0,i=1;
		while(i<=n)
		{
			sum=sum+i;
			i+=1;
		}
		System.out.println(sum);
		s.close();
	}
}
