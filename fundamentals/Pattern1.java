package fundamentals;
import java.util.Scanner;
public class Pattern1 {
	public static void main(String args[]) {
		int n,i=1,j=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println("\n");
		}
	}
}
