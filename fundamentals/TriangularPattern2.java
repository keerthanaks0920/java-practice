package fundamentals;
import java.util.Scanner;
public class TriangularPattern2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1,p=1;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print(p+" ");
				j+=1;
				p+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
