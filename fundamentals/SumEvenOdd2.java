package fundamentals;
import java.util.Scanner;
public class SumEvenOdd2 {
	public static void main(String args[]) {
		int n,SumEven=0,SumOdd=0,temp,rem;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		temp=n;
		while(temp>0) {
			rem=temp%10;
			temp=temp/10;
			if(rem%2==0) {
				SumEven+=rem;
			}
			if(rem%2!=0) {
				SumOdd+=rem;
			}
		}
		System.out.println(SumEven+" "+SumOdd);
	}

}
