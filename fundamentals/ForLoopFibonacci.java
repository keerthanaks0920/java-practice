package fundamentals;
import java.util.Scanner;
public class ForLoopFibonacci {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=0;
		int n2=1;
		int fib=0;
		for(int i=1;i<=n-1;i++) {
			fib=n1+n2;
			n1=n2;
			n2=fib;
		}
		System.out.println(n1);
		s.close();
	}
}
