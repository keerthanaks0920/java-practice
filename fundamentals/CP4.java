package fundamentals;
import java.util.Scanner;
public class CP4 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			char p=(char)('A'+i-1);
			int j=1;
			while(j<=i) {
				System.out.print(p);
				p=(char)(p+1);
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
