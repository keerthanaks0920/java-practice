package fundamentals;

import java.util.Scanner;

public class Loop1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		for(i=0;i<n;i++) {
			System.out.println("Hello");
		}
		s.close();
	}
}