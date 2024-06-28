package fundamentals;

import java.util.Scanner;

public class PrintAsciiValueOfACharacter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
		System.out.println((int)c);
		s.close();
	}
}