package fundamentals;

public class BreakKeyword {
	public static void main(String args[]) {
		int n=5;
		int i=1;
		while(i<=n) {
			if(i==4) {
				break;
			}
		 System.out.println(i);
		 i++;
		}
		System.out.println("Outside while");
		for(int j=1;j<=n;j++) {
			if(j==4) {
				break;
			}
			System.out.println(j);
		}
		System.out.println("Outside for");
		for(int k=1;k<=n;k++) {
			for(int l=1;l<=n;l++) {
				if(k+1==l) {
					break;
//					return;
				}
				System.out.print(l+" ");
			}
			System.out.println();
		}
	}
}
