package Arrrays;

public class SelectionSort {
	public static void main(String args[]) {
		int[] arr= {1,7,6,5,3,4};
		selectionSort(arr);
	}
	public static void selectionSort(int[] arr) 
	{
		for(int i=0;i<arr.length-1;i++)
		{	
			int min=i;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
