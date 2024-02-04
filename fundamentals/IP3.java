package fundamentals;
import java.util.Scanner;
public class IP3{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			int p=n-i+1;
			while(j<=p)
			{
				System.out.print(p+" ");
				j+=1;
				
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
