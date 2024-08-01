package patterns;

import java.util.Scanner;

public class CharacterPattern2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i)
			{	char c=(char)('A'+i-1);
				System.out.print(c);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
