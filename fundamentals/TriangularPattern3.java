package fundamentals;
import java.util.Scanner;
public class TriangularPattern3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1,p;
		n=s.nextInt();
		while(i<=n)
		{
			int j=1;
			p=i;
			while(j<=i) {
				System.out.print(p+" ");
				j+=1;
				p+=1;
			}
			i+=1;
			System.out.println();
		}
		s.close();	
	}
}
