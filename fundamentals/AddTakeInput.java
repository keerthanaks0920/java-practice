package fundamentals;
import java.util.Scanner;

public class AddTakeInput {
	public static void main(String args[]) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		a=s.nextInt();
		System.out.println("Enter b value:");
		b=s.nextInt();
		c=a+b;
		System.out.println("Sum = "+c);
		s.close();
	}
}
