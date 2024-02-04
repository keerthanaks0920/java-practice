package fundamentals;
import java.util.Scanner;
public class SumPattern {
	public static void main(String args[]) {
		int n,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n) {
			int j=1,sum=0;
			while(j<=i) {
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
				sum=sum+j;
				j++;
			}
			System.out.println(sum);
			i++;
		}
		s.close();
	}
}
