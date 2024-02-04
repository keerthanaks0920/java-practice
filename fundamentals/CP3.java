package fundamentals;
import java.util.Scanner;
public class CP3 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1,p;
		n=s.nextInt();
		while(i<=n) {
			int j=1;
			p=('A'+i-1);
			while(j<=n) {
				System.out.print((char)(p));
				j+=1;
				p++;
			}
			System.out.println();
			i+=1;
		}
	s.close();
	}
}
