package fundamentals;
import java.util.Scanner;
public class Armstrong {
	public static int power(int mod,int count) {
		int power=1;
		for(int i=1;i<=count;i++)
		{
		 power*=mod;
		}
		return power;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int mod,arm=0,count=0;
		int temp=num;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		temp=num;
		while(temp>0) {
			mod=temp%10;
			arm+=power(mod, count);
			temp=temp/10;
		}
		if(arm==num) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not a armstrong");
		}
	}
}
