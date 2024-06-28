package fundamentals;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(i*n);
			i+=1;
		}
		s.close();
	}
}
