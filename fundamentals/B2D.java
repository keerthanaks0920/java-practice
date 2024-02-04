package fundamentals;
import java.util.Scanner;
public class B2D {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int binary=s.nextInt();
		int mod,dec=0,pv=1;
		while(binary>0) {
			mod=binary%10;
			dec=dec+(mod*pv);
			pv=pv*2;
			binary=binary/10;
		}
		System.out.println(dec);
		s.close();
	}
}
