package fundamentals;
import java.util.Scanner;
public class InvertedPyramid2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n;
		int i=1;
		n=s.nextInt();
		while(i<=n) {
			int spaces=i-1;
			while(spaces>0)
			{
				System.out.print("  ");
				spaces--;
			}
			int stars=n-i+1;
			while(stars>0){
				System.out.print("* ");
				stars--;
			}
		i+=1;
		System.out.println();
		}
		s.close();
	}
}
