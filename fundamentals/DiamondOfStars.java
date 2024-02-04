package fundamentals;
import java.util.Scanner;
public class DiamondOfStars {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		int firsthalf=(n+1)/2;
		int secondhalf=n/2;
		while(i<=firsthalf) {
			int spaces=1;
			while(spaces<=firsthalf-i) {
				System.out.print(" "+" ");
				spaces++;
			}
			int stars=2*i-1;
			while(stars>0) {
				System.out.print("*"+" ");
				stars--;
			}
			i+=1;
			System.out.println();
		}
		i=secondhalf;
		while(i>=1) {
			int spaces=secondhalf-i+1;
			while(spaces>0) {
				System.out.print(" "+" ");
				spaces--;
			}
			int stars=2*i-1;
			while(stars>0){
				System.out.print("*"+" ");
				stars--;
			}
			System.out.println();	
			i-=1;
		}
	s.close();
	}
}