package Functions;
import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		int step=s.nextInt();
		F_To_C(start,end,step);
		s.close();
	}
	public static void F_To_C(int start, int end, int step) {
		while(start<=end) {
		System.out.print(start);
		int c=(start-32)*5/9;
		start+=step;
		System.out.println(" "+c);
		}
	}
}
