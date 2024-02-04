package fundamentals;
import java.util.Scanner;
public class RightPyramid {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j+=1;
			}
			i+=1;
			System.out.println();
		}
	}
}
