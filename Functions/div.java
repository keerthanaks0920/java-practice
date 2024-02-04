package Functions;
import java.util.Scanner;
public class div {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int numerator=s.nextInt();
		int denominator=s.nextInt();
		int div=division(numerator,denominator);
		System.out.println(div);
		s.close();
	}
	public static int division(int a, int b) {
		if(b==0) {
			System.out.println("Division by zero is not possible");
			return 0;
		}
		int div=a/b;
		return div;
	}
}
