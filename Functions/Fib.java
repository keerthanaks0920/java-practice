package Functions;
import java.util.Scanner;
public class Fib {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		fib(n);
		s.close();
	}
	public static void fib(int n)
	{
		int a=0;
		int b=1;
		if(n==0) {
			System.out.println("True");
			return;
		}
		while(a+b<=n) {
			int temp=a+b;
			a=b;
			b=temp;
			if(temp==n) {
				System.out.println("True");
				return;
			}
		}
		System.out.println("False");
		return;
	}
}
