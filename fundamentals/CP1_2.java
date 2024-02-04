package fundamentals;
import java.util.Scanner;
public class CP1_2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print((char)('A'+j-1)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
