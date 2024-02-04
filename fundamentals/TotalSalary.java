package fundamentals;
import java.util.Scanner;
public class TotalSalary {
	public static void main(String args[]) {
		int bs,allow,integralPart;
		char ch;
		double ts;
		Scanner s=new Scanner(System.in);
		bs=s.nextInt();
		ch=s.next().charAt(0);
		if(ch=='A') {
			allow=1700;
		}
		else if(ch=='B')
			{
					allow=1500;
			}
		else {
			allow=1300;
		}
		ts=(bs)+(0.20*bs)+(0.50*bs)+(allow)-(0.11*bs);
		integralPart=(int)Math.round(ts);
		System.out.println("Total Salary:"+integralPart);
		s.close();
	}

}
