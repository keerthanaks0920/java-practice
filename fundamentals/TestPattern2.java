package fundamentals;
import java.util.Scanner;
public class TestPattern2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int start=1;
		int mid=n+1;
		int end=2*n+1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n+1;j++) {
				if(j==start||j==mid||j==end ) {
					System.out.print("* ");
				}
				else {
					System.out.print("0 ");
				}
			}
			start++;
			end--;
			System.out.println();
		}
		s.close();
	}
}
