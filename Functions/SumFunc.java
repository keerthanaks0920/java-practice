package Functions;
import java.util.Scanner;
public class SumFunc {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int add=sum(n1,n2);
		System.out.println(add);
		s.close();
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}
