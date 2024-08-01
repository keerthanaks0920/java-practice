package patterns;

import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		while(i<n)
		{
			int j=1;
			while(j<=i+1)
			{
				System.out.print((char)('A'+i));
				j++;
			}
			i++;
			System.out.println();
		}
		s.close();
	}
}
