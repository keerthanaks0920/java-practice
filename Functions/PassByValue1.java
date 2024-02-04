package Functions;
import java.util.Scanner;
public class PassByValue1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("Main "+n );
		increment(n);
		s.close();
	}
	public static void increment(int n) {
		n++;
		System.out.println("Increment "+n);
	}
}
