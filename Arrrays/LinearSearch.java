package Arrrays;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int arr[]=takeInput(s);
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the element you want to search for: ");
		int elemToBeFound=s1.nextInt();
		int result=linearSearch(arr,elemToBeFound);
		System.out.println("The element is present at the index: "+result);
		s1.close();
		s.close();
		}
	public static int[] takeInput(Scanner s) {
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int linearSearch(int arr[],int n) {
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				index=i;
				break;
			}
		}
		return index;
	}
}
