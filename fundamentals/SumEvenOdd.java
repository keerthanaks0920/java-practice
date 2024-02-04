package fundamentals;
import java.util.Scanner;
public class SumEvenOdd {
	public static void main(String args[]) {
		int n,i=1,SumEven=0,SumOdd=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n)
		{
			if(i%2==0) {
				SumEven+=i;
			}
			if(i%2!=0) {
				SumOdd+=i;
			}
			i+=1;
		}
		System.out.println(SumEven+" "+ SumOdd);
		
	}
}
