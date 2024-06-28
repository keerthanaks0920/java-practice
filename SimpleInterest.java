package fundamentals;

public class SimpleInterest 
{
	public static void main(String[] args)
	{
		int principal=2000;
		double rate=2.2;
		int time=4;
		int si=(int)(principal*rate*time)/100;
		System.out.println(si);
	}
}
