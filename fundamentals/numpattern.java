package fundamentals;
import java.util.Scanner;
public class numpattern {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n,i=1;
		n=s.nextInt();
		while(i<=n) {
			int j=1,space=n-i,inc=1,p=i,dec=i-1;
			while(j<=n) {
				while(space>0) {
					System.out.print(" "+" ");
					space--;
				}
				while(inc<=i) {
					System.out.print(p+" ");
					inc++;
					p++;
				}
				int element=2*i-2;
				while(dec>=1){
					System.out.print(element+" ");
					element--;
					dec--;
				}
				j+=1;
			}
			System.out.println();
			i+=1;
		}
		s.close();
	}
}
