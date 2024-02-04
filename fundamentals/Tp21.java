package fundamentals;
import java.util.Scanner;
public class Tp21 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			int j;
			for(j=1;j<=n;j++) {
				if(j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}
			}
			j--;
			System.out.print("* ");
			while(j>=1) {
				if(j==i) {
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}
				j--;
			}
			System.out.println();
		}
		s.close();
	}
}
