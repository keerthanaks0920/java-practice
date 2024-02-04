package fundamentals;
import java.util.Scanner;
public class MP1 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int spaces,stars,j=1;
			spaces=n-i;
			stars=i;
			while(j<=n) {
				int p=1;
				while(spaces>0) {
					System.out.print(" "+" ");
					spaces--;
				}
				while(stars>0) {
					System.out.print(p+" ");
					stars--;
					p++;
				}
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
