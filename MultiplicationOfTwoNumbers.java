package fundamentals;
import java.util.Scanner;
public class MultiplicationOfTwoNumbers {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long l1=s.nextLong();
		long l2=s.nextLong();
		long l3=l1*l2;
		System.out.println(l3);
		s.close();
	}
}
