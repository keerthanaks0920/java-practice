package fundamentals;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String args[]) {
		double p,r,t,si;
		Scanner s=new Scanner(System.in);
		p=s.nextDouble();
		r=s.nextDouble();
		t=s.nextDouble();
		si=(p*r*t)/100;
		System.out.println("Simple Interest : "+si);
		s.close();
		
	}

}
