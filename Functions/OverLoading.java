package Functions;
import java.util.Scanner;
public class OverLoading {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(sum(a));
		System.out.println(sum(a,b));
		System.out.println(sum(10.6,6.01));
	}
	public static int sum(int a) {
		return ++a;
	}
	public static double sum(double a, double b) {
		return a+b;
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}
