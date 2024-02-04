package fundamentals;
import java.io.*;
import java.util.Scanner;
public class CP1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1,p;
		char ch;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			p=65;
			while(j<=n) {
				ch=(char)p;
				System.out.print(ch+" ");
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
