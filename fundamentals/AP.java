package fundamentals;
import java.util.Scanner;
public class AP {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int count=0;
		for(i=1;;i++) {
			int term=3*i+2;
			if(term%4==0) {
				continue;
			}
			System.out.print(term+" ");
			count++;
			if(count==n) {
				break;
			}
		}
		s.close();
	}
}
