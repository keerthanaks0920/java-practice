package fundamentals;
import java.util.Scanner;
public class EvenODd {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		if(a%2==0)
		{
			System.out.println(a +" is  a even");
		}
		else {
			System.out.println(a+ " is odd");
		}
	}
}
