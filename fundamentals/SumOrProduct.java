package fundamentals;
import java.util.Scanner;
public class SumOrProduct {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		int sum=0;
		int product=1;
		switch(c) {
		case 1:
			for(int i=1;i<=n;i++) {
				sum+=i;
			}
			System.out.println(sum);
			break;
		case 2:
			for(int j=1;j<=n;j++) {
				product*=j;
			}
			System.out.println(product);
			break;
		default:
			System.out.println(-1);
		}
		s.close();
	}
}
