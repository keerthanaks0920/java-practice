package fundamentals;
import java.util.Scanner;
public class WhileLoop {
	public static void main(String args[]) {
		int n,i=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(i<=n) {
			System.out.println(i);
			i+=1;
		}
		s.close();
	}
}
