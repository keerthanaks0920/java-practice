package fundamentals;

import java.util.Scanner;

public class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		int C;
		while(S<=E)
		{
			System.out.print(S);
			C=(S-32)*5/9;
			S=S+W;
			System.out.println(" "+C);
		}
		s.close();
	}
}
