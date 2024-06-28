package fundamentals;
import java.util.Scanner;
public class ReadingInput 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//		int c=a+b;
//		System.out.println(c);
		String str=s.nextLine();
		System.out.println(str);
		char l=s.nextLine().charAt(0);
		System.out.println(l);
		s.close();
	}
}