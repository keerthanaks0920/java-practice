package fundamentals;
import java.util.Scanner;
public class SumOfN {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0,sum=0;
		while(i<=n) {
			sum=sum+i;
			i+=1;
		}
		System.out.println("Sum of "+ n + "numbers is " +sum);
	}
}
