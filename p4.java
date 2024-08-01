package patterns;

import java.util.Scanner;

public class p4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int row=1;
		while(row<=n)
		{
			int col=1;
			while(col<=n)
			{
				int num=n-row+1;
				while(num<=n)
				{
					System.out.print(num);
					num++;
					col++;
				}
				int no5=n- row;
				while(no5>0)
				{
					System.out.print(n+1);
					no5--;
					col++;
				}
			}
			row++;
			System.out.println();
		}
		s.close();
	}
}
