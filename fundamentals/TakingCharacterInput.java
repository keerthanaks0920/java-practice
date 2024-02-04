package fundamentals;
import java.util.Scanner;
public class TakingCharacterInput {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		System.out.println("input character : "+ch);
		s.close();
	}

}
