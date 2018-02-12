package lab2.comp3111.ust.hk;

public class Lab1Activity {
	
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		
		// Write your code here..
		// Add 10 numbers //
		for (int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println(String.format("Sum of the numbers is %d", sum));	
		System.out.print(String.format("Min = %d; ", minNum(arr)));
		System.out.println(String.format("Max = %d", maxNum(arr)));	
	}
	
	public static int minNum(int[] arr) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int maxNum(int[] arr) {
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
}
