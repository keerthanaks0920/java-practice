package fundamentals;
import java.util.Scanner;
public class Primality2 {
	public static void main(String args[]) {
		int i=2,n;
		boolean condition=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=Math.sqrt(n)) {
			if(n%i==0) {
				condition=false;
				break;
			}
			i+=1;
		}
		if(condition) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		sc.close();
	}
}
