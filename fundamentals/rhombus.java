package fundamentals;
import java.util.Scanner;
public class rhombus {
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
			int stars=n;
			while(stars>0)
			{
				System.out.print("* ");
				stars--;
			}
			i+=1;
			System.out.println();
		}
	}
}
