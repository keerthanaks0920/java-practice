package fundamentals;
import java.util.Scanner;
public class AverageMarks {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		int m1=s.nextInt();
		int m2=s.nextInt();
		int m3=s.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(a);
		System.out.println(avg);
		s.close();
	}
}
