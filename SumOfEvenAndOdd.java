package fundamentals;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int rem=0,e=0,o=0;
	while(num>0) {
		rem=num % 10;
		if(rem%2==0) {
			e=e+rem;
		}
		else {
			o=o+rem;
		}
		num=num/10;
	}
	System.out.println(e);
	System.out.println(o);
	s.close();
	}
}
