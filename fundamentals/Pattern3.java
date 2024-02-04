package fundamentals;
import java.util.Scanner;
public class Pattern3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1,j;
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++) {
				System.out.print(n);
			}
			System.out.println();
		}
		s.close();
	}
}
