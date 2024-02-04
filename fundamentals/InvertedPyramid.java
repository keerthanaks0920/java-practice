package fundamentals;
import java.util.Scanner;
public class InvertedPyramid {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i;
		n=s.nextInt();
		i=n;
		while(i>0) {
			int j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j+=1;
							}
			System.out.println();
			i-=1;
		}
		s.close();
	}
}
