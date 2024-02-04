package fundamentals;
import java.util.Scanner;
public class ASCII {
	public static void main(String args[]) {
	int i;
	char ch;
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
	i=ch;
	System.out.println(i);
	s.close();
	}
}