package fundamentals;
import java.util.Scanner;
public class BitwiseOperator {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=10,b=3;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a<<b);
		System.out.println(a>>b);
		s.close();
	}
}
