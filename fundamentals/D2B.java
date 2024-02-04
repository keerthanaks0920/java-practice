package fundamentals;
import java.util.Scanner;
public class D2B {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int dec=s.nextInt();
		long rem,pt=1;
		long bin=0;
		while(dec>0) {
			rem=dec%2;
			bin=bin+(rem*pt);
			pt=pt*10;
			dec=dec/2;
		}
		System.out.println(bin);
		s.close();
	}
}
