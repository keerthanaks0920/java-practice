package fundamentals;
import java.util.Scanner;
public class Inverted1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int spaces=i-1;
			while(spaces>0) {
				System.out.print("  ");
				spaces--;
			}
			int inc=n-i+1;
			while(inc>0) {
				System.out.print("* ");
				inc--;
			}
			int dec=n-i;
			while(dec>0) {
				System.out.print("* ");
				dec--;
			}
			i+=1;
			System.out.println();
		}
		s.close();
	}
}
