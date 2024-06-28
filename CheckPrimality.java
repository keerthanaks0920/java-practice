package fundamentals;

import java.util.Scanner;

public class CheckPrimality {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int i=2;
		boolean condition = true;
		while(i<num)
		{
			if(num%i==0) {
				condition=false;
				break;
			}
			i+=1;
		}
		if(condition) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		s.close();
	}
}
