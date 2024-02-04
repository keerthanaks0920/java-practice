package Functions;
import java.util.Scanner;
public class NcrUsingFunctions {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int factN=factorial(n);
		int factR=factorial(r);
		int factNR=factorial(n-r);
		int ncr=factN/(factR*factNR);
		System.out.println(ncr);
		s.close();
		
	}
}
