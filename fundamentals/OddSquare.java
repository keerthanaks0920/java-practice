package fundamentals;
import java.util.Scanner;
public class OddSquare {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int p=i;
		while(i<=n) {
			int temp=p;
			int p1=n-i+1;
			while(p1>0) {
				System.out.print(temp+" ");
				temp+=2;
				p1--;
			}
			int temp2=1;
			int p2=i-1;
			while(p2>0) {
				System.out.print(temp2+" ");
				temp2+=2;
				p2--;
			}	
			i+=1;
			p+=2;
			System.out.println();
		}
		s.close();
	}
}
