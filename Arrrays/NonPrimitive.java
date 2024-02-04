package Arrrays;
public class NonPrimitive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		incrementArray(arr);
		printArray(arr);
	}
	public static void incrementArray(int[] arr) {
		arr=new int[7];
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
		}
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}