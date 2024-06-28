package fundamentals;

import java.util.Scanner;

public class totalSalary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int basic=s.nextInt();
		char grade=s.next().charAt(0);
		double total_sal;
		int allow=0;
		if(grade=='A') {
			allow=1700;
		}else if(grade=='B')
		{
			allow=1500;
		}else {
			allow=1300;
		}
		total_sal=Math.round(basic+(0.20*basic)+(0.50*basic)+allow-(0.11*basic));
		System.out.println((int)total_sal);
		s.close();
	}
}
