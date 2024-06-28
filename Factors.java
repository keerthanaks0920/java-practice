package fundamentals;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		boolean hasFactor=false;
		int i=2;
		while(i<num) {
			if(num%i==0) {
				System.out.print(i+" ");
				hasFactor=true;
			}
			i+=1;
		}
		if(!hasFactor) {
			System.out.println(-1);
		}
		s.close();
	}
}
