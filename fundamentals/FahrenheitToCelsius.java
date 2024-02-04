package fundamentals;
import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int P;
		int S=sc.nextInt();
		int E=sc.nextInt();
		int W=sc.nextInt();
		while(S<=E) {
			P=(S-32)*5/9;
			System.out.print(S);
			S+=W;
			System.out.print(" "+P+"\n");
			
		}
		sc.close();
	}
}
