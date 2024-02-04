package fundamentals;
import java.util.Scanner;
public class FullPyramid {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int spaces=n-i;
			while(spaces>0) {
				System.out.print("  ");
				spaces--;
			}
			int stars=1;
			while(stars<=i) {
				System.out.print("* ");
				stars++;
			}
			int dec=i-1;
			while(dec>0) {
				System.out.print("* ");
				dec--;
			}
			i+=1;
			System.out.println();
		}
	}
}
