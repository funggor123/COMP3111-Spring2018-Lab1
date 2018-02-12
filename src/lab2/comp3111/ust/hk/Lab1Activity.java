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
		
		
	}
	
}
