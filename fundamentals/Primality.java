package fundamentals;
import java.util.Scanner;
public class Primality {
	public static void main(String args[]) {
		int n,i=2;
		boolean condition=true;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(i<=n-1) {
			if(n%i==0) {
				condition=false;
				break;
			}
			i+=1;
		}
	    if(condition) {
	    	System.out.println("Prime");
	    }
	    else {
	    	System.out.println("Composite");
	    }
		sc.close();
	}
}
