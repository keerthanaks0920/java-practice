package fundamentals;
import java.util.Scanner;
public class Primality3 {
	public static void main(String args[]) {
		int n,i=2;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				System.out.println("Composite");
				return;
			}
			i+=1;
		}
		System.out.println("Prime");
		s.close();
	}
}
