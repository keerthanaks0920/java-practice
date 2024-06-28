package fundamentals;

import java.util.Scanner;

public class ConditionalsAndOperators {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a!=b) {
			System.out.println("Both are not equal");
		}
		else {
			System.out.println("Both are equal");
		}
//		if(a>0 && b>0) {
//			System.out.println("Both are positive.");
//		}
//		else {
//			System.err.println("Both are not positive");
//		}
		s.close();
	}
}
