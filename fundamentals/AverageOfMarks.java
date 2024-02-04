package fundamentals;
import java.util.Scanner;

public class AverageOfMarks {
	public static void main(String args[]) {
		int m1,m2,m3,avg;
		String ka;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name of the student:");
		ka=s.next();
		System.out.println("Enter the value of the three subjects :");
		m1=s.nextInt();
		m2=s.nextInt();
		m3=s.nextInt();
		avg=(m1+m2+m3)/3;
		System.out.println("The average of the three subjects is : "+avg);
		s.close();
		}
}
