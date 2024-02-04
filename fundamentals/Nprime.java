package fundamentals;
import java.util.Scanner;
public class Nprime {
	public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=2;
        while(i<=n){
            int j=2;
            boolean isPrime=true;
            while(j<=Math.sqrt(i))
            {
                if(i%j==0){
                    isPrime=false;
                    break;
                }
                j++;
            }
            if(isPrime)
            {
                System.out.println(i);
            }
            i++;
        }
        s.close();
    }
}
