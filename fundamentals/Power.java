package fundamentals;
import java.util.Scanner;
public class Power {
	public static void main(String args[]) {
		int n,p,i=1,power=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		p=s.nextInt();
		for(i=1;i<=p;i++) {
			power=power*n;
		}
		System.out.println(power);
		s.close();
	}
}
