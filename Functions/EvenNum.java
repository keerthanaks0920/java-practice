package Functions;
import java.util.Scanner;
public class EvenNum {
	public static void EvenFunc(int a, int b) {
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		EvenFunc(start,end);
		s.close();
	}
}
