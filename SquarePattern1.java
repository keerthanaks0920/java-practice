package patterns;

import java.util.Scanner;

public class SquarePattern1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i+" ");
				j+=1;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
