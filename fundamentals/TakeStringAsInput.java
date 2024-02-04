package fundamentals;
import java.util.Scanner;
public class TakeStringAsInput {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int a = s.nextInt();
		System.out.print(str + " " + a);
	    s.close();
	}
}
