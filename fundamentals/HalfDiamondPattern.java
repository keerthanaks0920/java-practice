package fundamentals;
import java.util.Scanner;
public class HalfDiamondPattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		System.out.println("*");
		while(i<=n) {
		System.out.print("*");
		int j=1;
		while(j<=i) {
			System.out.print(j);
			j++;
		}
		j=i-1;
		while(j>0) {
			System.out.print(j);
			j--;
		}
		System.out.print("*");
		i+=1;
		System.out.println();
		}
		int k=n-1;
		while(k>0) {
			System.out.print("*");
			int i1=1;
			while(i1<=k) {
				System.out.print(i1);
				i1++;
			}
			i1=k-1;
			while(i1>0) {
				System.out.print(i1);
				i1--;
			}
			System.out.print("*");
			k-=1;
			System.out.println();
		}
		System.out.println("*");
		s.close();
	}
}
