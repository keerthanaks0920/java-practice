package fundamentals;

import java.util.Scanner;

public class PowerOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int base=s.nextInt();
		int power=s.nextInt();
		int ans=1,i=1;
		while(i<=power) {
			ans=ans*base;
			i++;
		}
		System.out.println(ans);
		s.close();
	}
}
