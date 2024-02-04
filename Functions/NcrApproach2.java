package Functions;
import java.util.Scanner;
public class NcrApproach2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int numerator=1;
		for(int i=r;i<=n;i++) {
			numerator=numerator*i;
		}
		int denominator=1;
		for(int i=1;i<=r;i++) {
			denominator=denominator*i;
		} 
		int combination=numerator/denominator;
		System.out.println(combination);
		s.close();
	}
}
