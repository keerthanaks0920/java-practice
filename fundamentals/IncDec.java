package fundamentals;
import java.util.Scanner;
public class IncDec {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int prev=0,cur=0,count=0;
		for(int i=0;i<num;i++) {
			cur=s.nextInt();
			if(cur==prev) {
				System.out.println("false");
				return;
			}
			else if(cur<prev) {
				if(count>0) {
					System.out.println("false");
					return;
				}
			}
			else if(cur>prev && i>0) {
				count++;
			}
		}
		System.out.println("true");
		s.close();
	}
}
