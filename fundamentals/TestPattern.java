package fundamentals;
import java.util.Scanner;
public class TestPattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=1;i<=n;i++) {
			for(int j=5;j>0;j--) {
				if(j==i) {
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		s.close();
	}
}
