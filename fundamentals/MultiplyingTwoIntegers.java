package fundamentals;
import java.util.Scanner;
public class MultiplyingTwoIntegers {
	public static void main(String args[]) {
		int f1,f2;
		long d;
		Scanner sc=new Scanner(System.in);
		f1=sc.nextInt();
		f2=sc.nextInt();
		d=(long)f1*f2;
		System.out.println(d);
		sc.close();
	}
}
