package fundamentals;
import java.util.Scanner;
public class IsocelesPattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int spaces,inc,dec,j=1;
			spaces=n-i;
			inc=1;
			dec=i-1;
			while(j<=n) {
				while(spaces>0)
				{
					System.out.print(" "+" ");
					spaces--;
				}
				while(inc<=i) {
					System.out.print(inc+" ");
					inc++;
				}
				while(dec>=1) {
					System.out.print(dec+" ");
					dec--;
				}
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
