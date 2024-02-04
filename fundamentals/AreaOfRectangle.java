package fundamentals;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int x1,x2,y1,y2,area;
		System.out.println("Enter the value for the two ends of diagonals with its co-ordinates");
		x1=s.nextInt();
		y1=s.nextInt();
		x2=s.nextInt();
		y2=s.nextInt();
		area=(x2-x1)*(y2-y1);
		System.out.println("Area of the rectangle : "+area);
		s.close();
	}

}
