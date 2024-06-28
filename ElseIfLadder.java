package fundamentals;

import java.util.Scanner;

public class ElseIfLadder {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b) {
			System.out.println("first num is greater");
		} else if(a==b) {
			System.out.println("Both are equal");
		}else {
			System.out.println("secong num is greater");
		}
		s.close();
	}
}
