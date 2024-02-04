package fundamentals;
import java.util.Scanner;
public class SqrtInt {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		for(i=0;i<=n;i++) {
			if(i*i>n) {
				break;
			}
		}
		if(i==0) {
			System.out.println(0);
		}
		else
		{
			System.out.println(i-1);
		}
		s.close();
	}
}
