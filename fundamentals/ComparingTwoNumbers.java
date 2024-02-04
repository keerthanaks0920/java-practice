package fundamentals;
import java.util.Scanner;
public class ComparingTwoNumbers {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a>b)
		{
			System.out.println(a + " is greater");
		}
		else if(b>a) {
				System.out.println(b +" is greater");
			}
	    else {
	           System.out.println("Both are equal");
			}
	}

}
