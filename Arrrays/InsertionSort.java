package Arrrays;

public class InsertionSort{
    public static void main(String args[]){
        int[] arr={9,7,6,8,4,5,2,3};
        insertionSort(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while((j>=0)&&(arr[j]>key))
            {
            	arr[j+1]=arr[j];
            	j-=1;
            }
            arr[j+1]=key;
        }
    }
}