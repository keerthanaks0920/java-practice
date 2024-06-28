package fundamentals;

import java.util.Scanner;

public class FindCharCase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char n=s.next().charAt(0);
		if(n>=97 && n<=122)
		{
			System.out.println(0);
		}
		else if(n>=65 && n<=90)
		{
			System.out.println(1);
		}
		else {
			System.out.println(-1);
		}
		s.close();
	}
}
