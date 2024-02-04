package fundamentals;
import java.util.Scanner;
public class LeftPyramid {
	public static void main(String args[]) {
		int n,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n) {
				int spaces=n-i;
				while(spaces>0)
				{
					System.out.print("  ");
					spaces--;
				}
				int stars=1;
				while(stars<=i) {
					System.out.print("* ");
					stars++;
			   }
			i+=1;
			System.out.println();
		  }
			s.close();
	}

	}