package Arrrays;

public class UniqueElement {
	public static void main(String args[]) {
		int[] arr= {2,3,1,9,1,6,3,6,2};
		findUnique(arr);
	}
	public static void findUnique(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}
	}
}
